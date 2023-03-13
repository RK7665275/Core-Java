package com.oops;


class Employee1{
	int salary;
	String name;
	
	
	public void setName(String n){
		name = n;
       
    }
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}

class Cellphones{
	
	public void ring() {
		System.out.println("Phone is ringing...");
	}
	public void vibrate() {
		System.out.println("Phone is vibrating...");
	}
	public void forward() {
		System.out.println("Phone is forwarding...");
	}
}

class Square{
	int side;
	
	public int area() {
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
}


class Rectangle{
	int length;
	int width;
	public int area() {
		return length * width ;
	}
	public int perimeter() {
		return 2 * (length + width);
	}
}

class Circle{
	int radius;
	public double area() {
		return 3.14 * radius * radius;
	}
	public double perimeter() {
		return  2 * 3.14 * radius;
	}
}

public class PracSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Employee1 em = new Employee1();
		em.setName("Rushikesh");
		em.salary=243;
		em.getSalary();
		em.getName();
		System.out.println(em.getName());
		System.out.println(em.getSalary());
		
		System.out.println("");
		
		Cellphones cell = new Cellphones();
		cell.ring();
		cell.vibrate();
		cell.forward();

		System.out.println("");
		
		Square sq = new Square();
		sq.side=3;
		sq.area();
		sq.perimeter();
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		
		System.out.println("");
		
		Rectangle rec = new Rectangle();
		rec.length=12;
		rec.width=10;
		rec.area();
		rec.perimeter();
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
		
		System.out.println("");
		
		Circle c = new Circle();
		c.radius=5;
		c.area();
		c.perimeter();
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
	}

}
