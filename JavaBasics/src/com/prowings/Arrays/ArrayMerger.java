package com.prowings.Arrays;
import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int mergedLength = arr1Length + arr2Length;

        int[] mergedArray = new int[mergedLength];

        // Copy elements of arr1 to mergedArray
        System.arraycopy(arr1, 0, mergedArray, 0, arr1Length);

        // Copy elements of arr2 to mergedArray
        System.arraycopy(arr2, 0, mergedArray, arr1Length, arr2Length);

        return mergedArray;
    }
}
