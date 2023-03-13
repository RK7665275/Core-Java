package com.oops;


 class Employee{

	int id;
	int salary;
	String name;
	String details;
	
	public void print() {
		System.out.println("My Emp_ID = " + id);
		System.out.println("My Syalary = " + salary);
		System.out.println("My Name = " + name);
	}
	
	public int getSalary(){
		return salary;
		
	}
	
	public String getDetalis() {
		return details;
	}
}

public class CreatingOwnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating Our Own Class :");
		
	 Employee harry = new Employee();
	 Employee john = new Employee();
	 Employee rushikesh = new Employee(); 
	 
	 harry.id=21;
	 harry.salary=210000;
	 harry.name="Harry";
	 System.out.println(harry.id +"\n"+ harry.salary +"\n"+ harry.name+"\n");
	 harry.print();
	 System.out.println("");
	 john.id=20;
	 john.salary=200000;
	 john.name="John";
	 john.print();
	 rushikesh.salary=510000;
	 int salary=rushikesh.getSalary();
	 System.out.println(salary);
	 rushikesh.details="Ahmednagar";
	 String details=rushikesh.getDetalis();
	 System.out.println(details);
	 
	}

}
