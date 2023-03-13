package com.methods;

public class Methods {
	
	
	//static int logic (int x,int y) {
		 int logic (int x,int y) {
		int z;
		
		if(x>y){
			
			z=(x+y)*5;

		}else {
			z=x+y;
		}
		return z;
		
	}
	
	

	public static void main(String[] args) {
		
		int a = 7;
		int b = 6;
		int c;
		
		
		//for non static create object
		Methods obj = new Methods();
		c=obj.logic(a,b);
		//c=logic(a,b);
		
		System.out.println(c);
		
		int a1=5;
		int b1=2;
		int c1;
		
		Methods obj1 = new Methods();
		c1=obj1.logic(a1,b1);
		//c1=logic(a1,b1);
		
		System.out.println(c1);
		
	
		int p = 5;
		int q = 8;
		int sum = p+q;
		int mul = p*q;
		
		if(p>q) {
			System.out.println(sum);
			
		}else {
			System.out.println(mul);
		}
		
		
	}

}
