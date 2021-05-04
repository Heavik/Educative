package io.educative.arrays;

/*
In this problem, you have to implement the int findFirstUnique(int[] arr) method
that will look for a first unique integer, which appears only once in the whole array.
The function returns -1 if no unique number is found.

Input:  arr = {9, 2, 3, 2, 6, 6}

Output: 9
*/

public class FirstUnique {
    public static int findFirstUnique(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for(int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if(!repeated) {
                return arr[i];
            }
        }
        return -1;
    }
}
