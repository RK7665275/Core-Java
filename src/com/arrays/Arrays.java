package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//There are main 3 methods to decelare array in java

	//  1.	 //decleration and memory allocation then initialisation of the array
		//int [] marks = new int [5];  
		
//	 2.	int [] marks;  //decleration of array
//		marks =new int[4];  //memory allocation of array
	
		//initialisation of array
//		marks [0] = 20;
//		marks [1] = 25;
//		marks [2] = 10;
//		marks [3] = 45;
		
//	3.	//decleration,memory allocation and initialiation in one statement
//		int [] marks = {10, 20, 30, 44};  
//		
//		System.out.println(marks[3]);
//		
//		System.out.println(marks.length);
		
//		int [] marks = {10, 20, 30, 40};
//		
//		for (int i=0;i<marks.length;i++) {
//			//System.out.print(marks[i]);
//			System.out.printf("%3d",marks[i]);
//		}
//		
		
		
//		int [] marks = {10, 20, 30, 40};
//		
//		for (int i=marks.length-1;i>=0;i--) {
//			//System.out.println(marks[i]);
//			System.out.printf("%3d",marks[i]);
//		}
		
		//For Each Loop
		
	int [] marks = {10, 20, 30, 40};
		
		for (int a : marks) {
			// System.out.println(a);
			System.out.printf("%3d",a);
		}
		
		
		
	}

}
