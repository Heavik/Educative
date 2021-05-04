package io.educative.arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
In this problem, you have to implement the int[] findSum(int[] arr, int n) method,
which will take a number n,
and an array arr as input and returns an array of two integers that add up to n in an array.
You are required to return only one such pair. If no such pair found then simply return the array.

Input:  arr = {1, 21, 3, 14, 5, 60, 7, 6}
        value = 27

Output: arr = {21, 6} or {6, 21}
*/

public class Sum {
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        HashSet<Integer> alreadySeen = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            int summand = n - arr[i];
            if(alreadySeen.contains(summand)) {
                result[0] = arr[i];
                result[1] = summand;
                break;
            }
            alreadySeen.add(arr[i]);
        }
        return result;
    }

    public static int[] findSumUsingSort(int[] arr, int n) {
        Arrays.sort(arr);
        int p1 = 0;
        int p2 = arr.length - 1;

        int[] result = new int[2];
        while (p1 != p2) {
            int sum = arr[p1] + arr[p2];
            if(sum < n) {
                p1++;
            } else if(sum > n) {
                p2--;
            } else {
                result[0] = arr[p1];
                result[1] = arr[p2];
                break;
            }
        }
        return result;
    }
}
