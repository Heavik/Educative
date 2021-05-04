package io.educative.arrays;

/*
In this problem, you have to implement the int findMinimum(int[] arr) method,
which will traverse the whole array and find the smallest number in the array.

Input:  arr = {9, 2, 3, 6}
Output: 2
*/

public class Minimum {
    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
