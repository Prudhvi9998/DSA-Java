package com.Prudhvi.Practice;

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseWithAdditionalArray(originalArray);

        // Print original and reversed arrays
        System.out.print("Original Array: ");
        printArray(originalArray);

        System.out.print("Reversed Array: ");
        printArray(reversedArray);
    }

    static int[] reverseWithAdditionalArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
