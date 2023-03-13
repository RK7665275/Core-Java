package com.oops;

interface Parent {

	void meth1();
	void meth2();
}

interface Child extends Parent{
	void meth3();
	void meth4();
}

class Combo implements Child{
	public void meth1(){
		System.out.println("meth1");
	}
	public void meth2(){
		System.out.println("meth2");
	}
	public void meth3(){
		System.out.println("meth3");
	}public void meth4(){
		System.out.println("meth4");
	}
}
public class InheritanceInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Combo c = new Combo();
		c.meth1();
		c.meth2();
		c.meth3();
		c.meth4();
	}

}
