package io.educative.arrays;

/*
In this problem, given two sorted arrays, you have to implement the
int[] mergeArrays(int[] arr1, int[] arr2) method,
which returns an array consisting of all elements of both arrays in a sorted way.

Input:  arr1 = {1, 3, 4, 5}
        arr2 = {2, 6, 7, 8}

Output: arr = {1, 2, 3, 4, 5, 6, 7, 8}
*/

public class MergeArray {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int[] result = new int[arr1.length + arr2.length];
        int idx = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                result[idx++] = arr1[i];
                result[idx++] = arr2[j];
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                result[idx++] = arr1[i];
                i++;
            } else {
                result[idx++] = arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            result[idx++] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            result[idx++] = arr2[j];
            j++;
        }
        return result;
    }
}
