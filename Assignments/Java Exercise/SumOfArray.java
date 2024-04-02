package mahiapp;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a;i++) {
        	arr[i] = sc.nextInt();
        }
        int sum = sumArray(arr, arr.length - 1);
        System.out.println("The sum of the array is: " + sum);
    }
 
    public static int sumArray(int[] array, int index) {
        if (index < 0) {
            return 0;
        } else {
            return array[index] + sumArray(array, index - 1);
        }
    }
	}

