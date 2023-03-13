package com.oops;

interface Cycle {
	int i =16;
	void applyBreak (int decrement);
	void speedUp(int increment);
}

interface CycleHorn{
	int j = 25;
	String a = "Horn pressed";
	String b = "Horn Released";
	void blowTheHorn();
	void stopHorn();
}
class Atlas implements Cycle,CycleHorn{
	public void applyBreak(int decrement) {
		System.out.println("apply break");
		
	}
	public void speedUp(int increment) {
		System.out.println("Speed Up");
	}
	public void blowTheHorn() {
		System.out.println("Pee Poo Pee");
	}
	public void stopHorn() {
		System.out.println("Horn Stopped");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atlas A = new Atlas();
		A.applyBreak(5);
		System.out.println("Applying the Break......");	
		
		A.speedUp(12);
		System.out.println("Speeding Up .....");
		
		//System.out.println(A.i);
		
	//	System.out.println(A.a);
		A.blowTheHorn();
		
		//System.out.println(A.b);
		A.stopHorn();

	}

}
