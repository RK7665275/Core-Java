package com.oops;

interface Camera{
	void snapshot();
	void videorecording();
	private void greet() {
		System.out.println("Good Morning ....");
	}
	default void recording4Kvideo(){
		greet();
		System.out.println("Recording 4K Video ....");
	}
}
interface WiFi{
	String[] networks();
	void connectToNetwork(String availablenetwork); 
	
}
class CellPhone{
	void callTheNumber(long number) {
		System.out.println("Calling to " + number);
	}
	
	void Connecting() {
		System.out.println("Connecting to ....");
	}
}
class SmartPhone1 extends CellPhone implements Camera,WiFi{
	public void snapshot(){
		System.out.println("Taking Snapshot ....");
	}

	public void videorecording() {
		System.out.println("Recording Video ....");
	}
	
	public String[] networks(){
		System.out.println("Checking Available Networks");
		String[] networksList = {"Rushikesh" , "Akshay" , "Sunny"};
		return networksList;
	}
	public void connectToNetwork(String availablenetwork) {
		System.out.println("Conneting to " + availablenetwork);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhone c = new SmartPhone1();
		
		 // c.newtorks(); // not allowed
		c.Connecting();
		c.callTheNumber(2113456452);
		
		
		SmartPhone1 s = new SmartPhone1(); 
		s.networks();
		s.connectToNetwork("Rushikesh");
		
		
		
	}

}
