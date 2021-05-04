package io.educative.arrays;

/*
In this problem, you have to implement the int[] findProduct(int[] arr) method
which will modify arr in such a way that in the output,
each index i will contain the product of all elements present in arr except the element stored on that index i.

Input:  arr = {1,2,3,4}

Output: arr = {24,12,8,6}
*/

public class Product {
    public static int[] findProduct(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j) {
                    result[i] *= arr[j];
                }
            }
        }
        return result;
    }

    public static int[] findProductMoreOptimal(int[] arr) {
        int[] result = new int[arr.length];
        int temp = 1;
        for(int i = 0; i < arr.length; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }
}
