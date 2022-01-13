package com.dsa.array.array_algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};
        int[] result = sumOfTwoReturned(arr, 100);
        System.out.println(Arrays.toString(result));
    }

    public static boolean sumOfTwo(int[] arr, int value) {
        //Given an unsorted integer array, return true if there is a pair with the given sum as result.
        for (int i = 0; i <= arr.length; i++) {
            int diff = value - i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == diff) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] sumOfTwoReturned(int[] arr, int value) {
        //Given an unsorted integer array, find a pair with the given sum in it.
        int[] pair = new int[2];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    return pair;
                }
            }
        }
        System.out.println("Pair not found");
        return pair;
    }
}
