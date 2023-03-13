package com.oops;

class Cylinder{
	
	private int radius;
	private int height;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double surfaceArea(){
		return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
	}
	
	public double Volume(){
		return  Math.PI * radius * radius * height;
	}
	public Cylinder(int radius, int height) {
		
		this.radius = radius;
		this.height = height;
	}
}
class Rectangle1{
	private int lenght;

	private int height;
	public Rectangle1() {
		super();
		this.lenght = 45;
		this.height = 64;
	}
	public Rectangle1(int lenght, int height) {
		super();
		this.lenght = lenght;
		this.height = height;
	}
	public int getLenght() {
		return lenght;
	}
	
	public int getHeight() {
		return height;
	}
	
}
public class PracSet {
		
	public static void main(String[] args) {
//		
//		//Cylinder cy = new Cylinder();
//		
//		cy.setHeight(51);
//		cy.setRadius(15);
//		System.out.println("The cylinder Height is : " + cy.getHeight());
//		System.out.println("The Cylinder Radius is : "+ cy.getRadius());
//		System.out.println("The Surface Area Of Cylinder Is : " + cy.surfaceArea());
//		System.out.println("The Volume Of The Cylinder Is : " + cy.Volume());
//		
//		Cylinder cy = new Cylinder(12,25);
//		
//		System.out.println("The cylinder Height is : " + cy.getHeight());
//		System.out.println("The Cylinder Radius is : "+ cy.getRadius());
//		
		
		Rectangle1 rec1 = new Rectangle1(12 , 15);
		
		System.out.println(rec1.getLenght());
		System.out.println(rec1.getHeight());
		
	}
}
