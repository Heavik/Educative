package io.educative.arrays;

/*
Given an integer array, return the maximum subarray sum.
The array may contain both positive and negative integers and is unsorted.

Input:  arr = {1, 7, -2, -5, 10, -1}
Output: 11

Kadane’s Algorithm:

currMax = A[0]
globalMax = A[0]
for i = 1 -> size of A
    if currMax is less than 0
        then currMax = A[i]
    otherwise
        currMax = currMax + A[i]
    if globalMax is less than currMax
        then globalMax = currMax
*/

public class FindMax {
    public static int findMaxSubArray(int[] arr) {
        int currMax = arr[0];
        int globalMax = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(currMax < 0) {
                currMax = arr[i];
            } else {
                currMax += arr[i];
            }

            if(globalMax < currMax) {
                globalMax = currMax;
            }
        }

        return globalMax;
    }
}
