package pjava;

import java.util.Arrays;
import java.util.Random;

public class MyIntArrayUtil {
    public static void main(String[] args) {
        // Create an array of ten random integers between 1 and 100
        int[] myArray = generateRandomArray(10, 1, 100);

        // Display the original array
        System.out.println("Original array:");
        printArray(myArray);

        // Sort the array in ascending order
        Arrays.sort(myArray);

        // Display the sorted array
        System.out.println("\nSorted array (ascending order):");
        printArray(myArray);
    }

    // Generate an array of random integers
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Print the elements of an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}