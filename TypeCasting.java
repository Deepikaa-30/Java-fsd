package com;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 12; //implicit
		short b = a;
		System.out.println( a);
		System.out.println( b);
		
		int c = 15;
		long d = (int)c;
		
		System.out.println( c);
		System.out.println( d);

		
		//Explicit
		
		double p = 10.5; //8 byte
		int q = (int)p; //4 byte
		System.out.println( q );
		
		double o = 10.5;
		float r = (float)o;
		System.out.println( r );
	

	}

}


