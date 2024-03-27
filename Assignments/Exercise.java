package mahiapp;

import java.util.Scanner;

public class Exercise {

public static void main(String[] args) {
		String hi="Hi";
		String mom=" Mom";
		System.out.println(hi.concat(mom));
		String res=hi+mom;
		System.out.println(res);
		Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your full name: ");
	        String fullName = scanner.nextLine();
	        String initials = computeInitials(fullName);
	        System.out.println("The initials for " + fullName + " are: " + initials);
	        scanner.close();
	    }

	    public static String computeInitials(String fullName) {
	        String[] words = fullName.split("\\s+");
	        StringBuilder initials = new StringBuilder();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                initials.append(word.charAt(0));
	            }
	        }
	        return initials.toString().toUpperCase();
	    }

}
