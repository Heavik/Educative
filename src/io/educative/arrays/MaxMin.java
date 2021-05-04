package io.educative.arrays;

/*
In this problem, you have to implement the void maxMin(int[] arr) method.
This will re-arrange the elements of a sorted array in such a way that the first position will have
the largest number, the second will have the smallest, the third will have the second-largest, and so on.

Input:  arr = {1, 2, 3, 4, 5}
Output: arr = {5, 1, 4, 2, 3}
*/

public class MaxMin {
    public static void maxMin(int[] arr) {
        int[] tempArr = new int[arr.length];

        int tempArrPos = 0;
        for(int i = 0; i <= arr.length / 2 && tempArrPos < tempArr.length; i++) {
            tempArr[tempArrPos++] = arr[arr.length - i - 1];
            if(i != arr.length / 2) {
                tempArr[tempArrPos++] = arr[i];
            }
        }

        for(int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }
}
