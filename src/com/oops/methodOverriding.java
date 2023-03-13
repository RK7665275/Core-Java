package com.oops;

class Google{
	
	public void maps () {
		System.out.println("This Is Google Maps");
		
	}
	
	public void photos() {
		System.out.println("This is Google Photos");
	}
}

class Browser extends Google{
		public void chrome() {
			System.out.println("This is Chrome");
		}
		
		@Override
		public void photos() {
			System.out.println("This is One Photos");
		}
}

public class methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Google g = new Google();
		g.photos();
		g.maps();
	
		Browser b = new Browser();
		b.photos();
		b.chrome();
	}

}
