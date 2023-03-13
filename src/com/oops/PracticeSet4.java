package com.oops;

//Question1 
//abstract class Pen{
//	abstract void refill();
//	abstract void write();
//}
//
//class FountainPen extends Pen{
//	public void refill(){
//		System.out.println("Refilling the Pen Ink");
//	}
//	public void write() {
//		System.out.println("Writing");
//	}
//	public void changeNib() {
//		System.out.println("Changinig Nib");
//	}
//}
//class PracticeSet4 {
//	public static void main(String[] args) {
//		
//		FountainPen fp = new FountainPen();
//		fp.refill();

//Question 2


//Create a class monkey with jump ( ) and bite ( ) methods Create a class
//human whichinherits this monkey class and 
//implements basicanimal interface with eat ( ) and sleep methods 

//class Monkey {
//	public void jump() {
//		System.out.println("Monkey Jumping");
//	}
//	public void bite() {
//		System.out.println("Monkey biting");
//	}
//}
//
//interface Animal{
//	void sleep();
//	void eat();
//}
//
//class Human extends Monkey implements Animal {
//	
//	
//	public void sleep() {
//		System.out.println("Animal Sleeping");
//	}
//	public void eat() {
//		System.out.println("Animal Eating");
//	}
//}
//
//class PracticeSet4 {
//	public static void main(String[] args) {
//		Human h = new Human();
//		h.eat();
//		h.jump();
//		
//		//Polymorphism for above 
//		
//		Monkey m = new Human();
////		m.eat();  //nOt Allowed 
//		m.jump();
//		m.bite();
//		
//		Question 4
//Create a class telephone with ( ) , lift ( ) and disconnected ( ) 
//methods as abstract methods create another c
//class smart telephone and demonstrate polymorphism 
//
//	abstract class Telephone {
//		abstract void lift();
//		abstract void disconnect();
//		
//		}
//	
//	
//	class SmartTelephone extends Telephone{
//		
//		public void videocall() {
//			System.out.println("Video CALLING...");
//		}
//		public void lift(){
//			System.out.println("Lifting...");
//		}
//		public void disconnect() {
//			System.out.println("Disconnecting...");
//		}
//	}
//	
//Question 6
	
	interface TvRemote{
		 void  samsung();
		 void sony();
	}
	
	interface SmartTvRemote extends TvRemote{
		void mi();
		void panasonic();
	}
		class Tv implements TvRemote{
			public void samsung() {
				System.out.println("Samsung Tv Remote");
			}
			public void sony() {
				System.out.println("Sony Tv Remote");
			}
		}
		class PracticeSet4 {
			public static void main(String[] args) {
			//polymorphism	
//				Telephone t = new SmartTelephone();
//				t.disconnect();
				
			Tv t = new Tv();
			t.samsung();
	}

}
