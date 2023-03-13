package com.methods;

public class PracticeSetMethods {

	
	// 1. Write a Java method to print the multiplication table of a number n. 
	
		static void multiplication(int n) {
			
			for(int i=1;i<=10;i++) {
//				int c=n*i;
//				System.out.println(c);
				System.out.format("%d * %d = %d\n" ,n,i,n*i);
			}
			
		}
		
//2.  Write a program using functions to print the following pattern:
//	      *
//
//	      **
//
//	     ***
//
//	    ****
		static void pattern1(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
//	3.	Write a function to print the following pattern:
//		    ****
//
//		    ***
//
//		    **
//
//		    *
		
		static void pattern2(int n) {
			for(int i=n;i>0;i--) {
				for(int j=i-1;j>0;j--) {
					System.out.print("*");
				}
				System.out.println();
				}
			}
//		4. Write a recursive function to calculate the sum of first n natural numbers.
		static int sum(int n) {
			if(n!=0) {
				return n + sum(n-1);
			}else {
				return n;
			}
			
		}
		
//		5. Write a function to print the nth term of the Fibonacci series using recursion.
		
		static int fib(int n) {
			if(n==1 || n==2) {
				return n-1;
			}else {
				return fib(n-1) + fib(n-2);
			}
		}
		
//		
		   
			
		
		
   	public static void main(String[] args) {
		
		//multiplication(7);
		
		//pattern1(5);
   		//pattern2(6);
   		
//   		int n =6;
//   		int total=sum(n);
//   		System.out.println("The Sum of first " + n + " natural numbers = "  + total );
   		
//   		int n=6;
//   		int number = fib(n);
//   	System.out.println(number);
   		
//   6. Write a function to find the average of a set of numbers passed as arguments.
   		
   		int [] num = {1, 2, 3, 4, 5, 6}; 
   		
   		float sum=0;
   		
   		int i=0;
   		while (i<num.length) {
   			sum += num [i];
   			i++;
   		}
   		float avg =(sum/num.length);
   		System.out.println(avg);
   		

	}

}
