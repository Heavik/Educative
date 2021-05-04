package io.educative.arrays;

/*
In this problem, you have to implement the int findSecondMaximum(int[] arr) method,
which will traverse the whole array and return the second largest element present in the array.

Input:  arr = {9,2,3,6}

Output: 6
*/

public class SecondMax {
    public static int findSecondMaximum(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
