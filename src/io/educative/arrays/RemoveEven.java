package io.educative.arrays;

/*
In this problem, you have to implement the int[] removeEven(int[] arr) method,
which removes all the even elements from the array and returns back updated array.

Input:  arr = {1, 2, 4, 5, 10, 6, 3}
Output: arr = {1, 5, 3}
*/

public class RemoveEven {
    public static int[] removeEven(int[] arr) {
        int odds = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!isEven(arr[i])) {
                odds++;
            }
        }
        int[] result = new int[odds];
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(!isEven(arr[i])) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}