package com.oops;

 abstract class Parent4{
	 public int getP4() {
		return p4;
	}
	public void setP4(int p4) {
		this.p4 = p4;
	}
	public int getC12() {
		return c12;
	}
	public void setC12(int c12) {
		this.c12 = c12;
	}
	int p4= 12;
	 int c12= 21;
	 public Parent4() {
		 System.out.println("I am a Constructor");
		 
	 }
	public void mobile() {
		System.out.println("This is Mobile");
		
	}
	abstract void on();
	abstract void off();
}
 
 abstract class Child4 extends Parent4{
	 public void silent() {
		 System.out.println("this is silent");
	 }
 }
	 
 class Child12 extends Parent4{
	 @Override
		public void on() {
			System.out.println("The mobile is on");
		}
	 @Override
		public void off() {
			System.out.println("The mobile is off");
		}
	 }
 

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent4 p = new parent4;  //Not Allowed abstract class cannot be instantiated
		Child12 c12 = new Child12(); // abstract method can be instantiated
		Parent4 p4 = new Child12();
		
	//	Child c4 = new Child4();//not allowed
		System.out.println(p4.getP4());
		System.out.println(c12.getC12());
		
		}

}
//abstract class Parent2{
//    public Parent2(){
//        System.out.println("Mai base2 ka constructor hoon");
//    }
//    public void sayHello(){
//        System.out.println("Hello");
//    }
//    abstract public void greet();
//    abstract public void greet2();
//}

//class Child2 extends Parent2{
//    @Override
//    public void greet(){
//        System.out.println("Good morning");
//    }
//    @Override
//    public void greet2(){
//        System.out.println("Good afternoon");
//    }
//}
//
//abstract class Child3 extends Parent2{
//    public void th(){
//        System.out.println("I am good");
//    }
//}
//public class Abstract {
//    public static void main(String[] args) {
//        //Parent2 p = new Parent2(); -- error
//        Child2 c = new Child2();
//        //Child3 c3 = new Child3(); -- error
//    }
//}
