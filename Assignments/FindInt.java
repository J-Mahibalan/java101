package pjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class FindInt {
    public static List<Integer> findIntegers(int[] array, int target) {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num == target) {
                result.add(num);
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	n=sc.nextInt();    
    	int[] array = new int[10];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++)  
    	{    
    	array[i]=sc.nextInt();  
    	int target = 5;
        List<Integer> integers = findIntegers(array, target);
        System.out.println("Integers found in the array for target " + target + ": " + integers);
    	}
    }
}
