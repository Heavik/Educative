package io.educative.arrays;

/*
In this problem, you have to implement the void rotateArray(int[] arr) method,
which takes an arr and rotate it right by 1.
This means that the right-most elements will appear at the left-most position in the array.

Input:  arr = {1, 2, 3, 4, 5}

Output: arr = {5, 1, 2, 3, 4}
*/

public class RotateArray {
    public static void rotateArray(int[] arr) {
        int lastElem = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastElem;
    }
}
