package pjava;

import java.util.Scanner;

public class Votepodu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		sc.close();
		if(age>=18) {
			System.out.println("You're Eligible to vote");
		}
		else {
			System.out.println("You're not eligible to vote");
		}
	}

}
