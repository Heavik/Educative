package io.educative;

import io.educative.arrays.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 7, -2, -5, 10, -1};
        int result = FindMax.findMaxSubArray(arr);
        System.out.println(result);
    }
}
