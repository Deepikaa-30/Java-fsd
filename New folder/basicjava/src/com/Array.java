package com;

public class Array {
	public static void main(String[] args) {
		
	//	int [] marks; //declaration
	//	marks = new int[10]; //Memory Allocation
		
		int [] marks = {30,56,89,76,64,90,100,12,65,78};
		
		System.out.println(marks[6]);
	    System.out.println(marks [5]);
		
		// retrieve array by using for loop
		System.out.println( "Retrieve array marks by using for loop");
		
		for(int i=0;i<9;i++) {
		System.out.println("array marks" +marks [i]);
		
		}
		
		
		
		
		
	}

}
