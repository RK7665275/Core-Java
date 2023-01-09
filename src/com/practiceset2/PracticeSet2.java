package com.practiceset2;
//
//import java.util.Random;
//import java.util.Scanner;

public class PracticeSet2 {  
	
	public static void main(String[] args) {
////		Que1
//		int a=10;
//		if(a==11) {
//			System.out.println("i am 11");
//		}
//		else{
//			System.out.println("i am not 11");
//		}
		
//		Question 2
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Please Enter Marks Obtained in Physics");
//		int m1 = sc.nextInt();
//		
//		System.out.println("Please Enter Marks Obtained in Chemistry");
//		int m2 = sc.nextInt();
//		
//		System.out.println("Please Enter Marks Obtained in Mathematics");
//		int m3 = sc.nextInt();
//				 
//		float avg=(m1+m2+m3)/3f;
//		System.out.println("You are Overall Percentage is:" + avg + "%");
//
//	if(m1<33) {
//		System.out.println("You are failed in Physics");
//	}
//	
//	if(m2<33) {
//		System.out.println("You are failed in Chemistry");
//
//	}
//	
//	if(m3<33) {
//		System.out.println("You are failed in Mathematics");
//
//	}
//	
//		if(avg>=40 && m1>33 && m2>33 && m3>33) {
//		System.out.println("Congratulations! You Are Promoted");	
//		}
//		else {
//			System.out.println("Sorry! You Are Not Promoted");
//		}
		
		
		//Question 3
		
//		Scanner sc = new Scanner (System.in);
//		float tax = 0;
//		System.out.println("Please Enter Your LPA: ");
//		float income = sc.nextFloat();
//		
//		if(income<2.5f) {
//			tax= tax + 0;
//		}
//		
//		else if(income>2.5f && income<=5.0f) {
//			tax = tax + 0.05f * (income - 2.5f);
//		}
//		else if(income>5.0f && income<=10.0f) {
//			tax = tax + 0.05f * (5.0f - 2.5f);
//			tax = tax + 0.2f * (income - 5.0f);
//		}
//		else if(income>10.0){
//			tax = tax + 0.05f * (5.0f - 2.5f);
//			tax = tax + 0.2f * (10.0f - 5.0f);
//			tax = tax + 0.3f * (income - 10.0f);
//		}
//		System.out.println("The tax paid by you is: " + tax);
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Please enter the Day: ");
//		int day = sc.nextInt();
		
		//Questinn 4
//		
//	switch (day) {
//	case 1 -> System.out.println("Thsi is Monday");
//	case 2 -> System.out.println("Thsi is Tuesday");	
//	case 3 -> System.out.println("Thsi is Wednesday");
//	case 4 -> System.out.println("Thsi is Thursday");
//	case 5 -> System.out.println("Thsi is Friday");
//	case 6 -> System.out.println("Thsi is Saturday");
//	case 7 -> System.out.println("Thsi is Sunday");
//		}
		
		//Question 5
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Please Enter The Year: ");
//			int year = sc.nextInt();
//			
//			 if(((year % 4 == 0) && (year % 100 != 0)) || (year % 100 != 0 ) && (year % 400 == 0)) {
//			        System.out.println(year+" is a leap year");
//			 }
//			     else {
//			    	 
//			        System.out.println(year+" is not a leap year");
//			 }
		//Question 6
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Please Enter The Website: ");
//		String Website = sc.next();
//		
//		if(Website.endsWith(".com")) {
//			System.out.println("This is Commercial Website");
//			
//		}
//		if(Website.endsWith(".org")) {
//			System.out.println("This is Organisation Website");
//			
//		}
//		if(Website.endsWith(".in")) {
//			System.out.println("This is Indian Website");
//			
//		}
//		
		//Question 6 rock paper scissor
		
//		Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        int comp_choice = rand.nextInt(3); // taking computer input (random)
//
//        System.out.println("0 --> Rock\n1--> Paper\n2--> Scissors\n");
//        System.out.print("What do you chose:\t");
//        int user_choice = sc.nextInt(); // taking user input
//
//        // Game Logic
//        System.out.printf("You chose %d\n", user_choice);
//        System.out.printf("Computer chose %d\n", comp_choice);
//
//
//        if (comp_choice == user_choice) {
//            System.out.println("Its a draw!");
//        } else if (comp_choice == 0) {
//            if (user_choice == 1) {
//                System.out.println("You Won");
//            } else if (user_choice == 2) {
//                System.out.println("Computer Won");
//            }
//        } else if (comp_choice == 1) {
//            if (user_choice == 0) {
//                System.out.println("Computer Won");
//            } else if (user_choice == 2) {
//                System.out.println("You Won");
//            }
//        } else if (comp_choice == 2) {
//            if (user_choice == 0) {
//                System.out.println("You Won");
//            } else if (user_choice == 1) {
//                System.out.println("Computer Won");
//            }
//        }


	}
}
