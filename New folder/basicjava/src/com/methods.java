package com;

public class methods {
	
	public static void main(String[] args) {
		
	    System.out.println("Main method");
		
		info();
		add(9,8);
		add(90,52);
		add(90,20);
		String result = sayHello("");
		System.out.println("In main "+result);
	
	}

	// no passing parameter and no return type
	static void info() {
		System.out.println("This is user defined method - no passing parameter and no return type");
	}
	
	// passing parameter but no return type 
	static void add(int x, int y) {
		int sum = x+y;
		System.out.println("Sum of two number is "+sum);
		//return sum;
	}
	// passing parameter and return value 
	static String sayHello(String name) {
		//coding 
		return "Welcome user "+name;
	}
}



