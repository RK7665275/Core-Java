package com.arrays;

public class PracticeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.Create an array of 5 floats and calculate their sum.
//		2.Write a program to find out whether a given integer is present in an array or not.
//		3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//		4.Create a Java program to add two matrices of size 2x3.
//		5.Write a Java program to reverse an array.
//		6.Write a Java program to find the maximum element in an array.
//		7.Write a Java program to find the maximum element in a Java array.
//		8.Write a Java program to find whether an array is sorted or not.
		
		
		//Question 1
//		float [] marks  = {90.0f,81.0f,74.0f};
//		
//		float sum = 0;
//		
//		for(float elements : marks) {
//			sum = sum + elements;
//			
//		}
//		System.out.println(sum);
//		
		
		//Question 2
float [] marks  = {90.0f,81.0f,74.0f};
	
		float num = 90.0f;
		boolean IsInArray = false;
		for(float elements : marks) {
			if(num==elements) {
				IsInArray = true;
				break;
		}
		}
			if(IsInArray==true) {
				
				System.out.println("The No Is Present In The Array");

			}
			else {
				
				System.out.println("The No Is Not Present In The Array");

			}
		
		}
		
	}

