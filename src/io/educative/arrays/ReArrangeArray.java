package io.educative.arrays;

import java.util.Arrays;

/*
In this problem, you have to implement the void reArrange(int[] arr) method,
which will sort the elements, such that all the negative elements appear at the left
and positive elements appear at the right.

Input:  arr = {10, -1, 20, 4, 5, -9, -6}

Output: arr = {-1, -9, -6, 10, 20, 4, 5}
*/

public class ReArrangeArray {
    public static void reArrange(int[] arr) {
        int[] tempArr = new int[arr.length];
        Arrays.fill(tempArr, -1);

        int nextNegative = 0;
        int nextPositive = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if(tempArr[nextNegative] >= 0) {
                    tempArr[nextPositive++] = tempArr[nextNegative];
                }
                tempArr[nextNegative++] = arr[i];
            } else {
                tempArr[nextPositive++] = arr[i];
            }
        }

        for(int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }

    public static void reArrangeInPlace(int[] arr) {
        int swapWith = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if(i != swapWith) {
                    int temp = arr[i];
                    arr[i] = arr[swapWith];
                    arr[swapWith] = temp;
                }
                swapWith++;
            }
        }
    }
}
