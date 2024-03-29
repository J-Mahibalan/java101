package mahiapp;

import java.util.Scanner; 
public class CountLetters{
	public static void main(String[] args) {
		int[] counts=new int [26]; 
		Scanner scan = new Scanner(System.in);
		//get word from user 
		System.out.println("Enter a single word (letters only, please): "); 
		String word =scan.nextLine();
		//convert to all upper case 
		word= word.toUpperCase();
		//count frequency of each letter in string 
		int i =0;
		try {
		for (i=0; i < word.length(); i++){ 
			counts[word.charAt(i) - 'A']++;
		}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Not a letter: " +word.charAt(i));
			
		}
		//print frequencies 
	
		for (i=0; i<counts.length; i++) 
			if (counts[i] != 0)
			System.out.println((char)(i+'A')+":"+ counts[i]);
	}
}
