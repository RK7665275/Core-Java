package com.oops;

class Phone{
	
	public void play() {
		System.out.println("Can Play Only Radio....");
	}
	
	public void about() {
		System.out.println("This is Nokia Simple Phone");
	}
}

class SmartPhone extends Phone{
	
	public void music() {
		System.out.println("Can Play The Music....");
	}
	
	@Override
	public void about() {
		System.out.println("This Is Nokia Smart Phone");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone sm = new SmartPhone();//obj is created at run time so dynamic Method Dispatch 
		//Helps ploymorphism during Run time
		
		sm.about();//allowed the method which overrided are executed
		sm.play();//allowed
		
//		sm.music();// This canmnot be run because we hac=ve created obj with ref to Phone
		//only the methods in Phones and the overriden methods in smartphone can be allowed

	}

}
