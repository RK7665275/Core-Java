package com.day2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks Obtained in English: ");
		int M1 = sc.nextInt();
		System.out.println("Enter Marks Obtained in Hindi: ");
		int M2 = sc.nextInt();
		System.out.println("Enter Marks Obtained in Marathi: ");
		int M3 = sc.nextInt();
		System.out.println("Enter Marks Obtained in Maths: ");
		int M4 = sc.nextInt();
		System.out.println("Enter Marks Obtained in Science: ");
		int M5 = sc.nextInt();
		
		int sum = M1+M2+M3+M4+M5;
		double per = (sum*100)/500D;
		System.out.println("The Percentage Of the Student is: " + per);

	}

}
