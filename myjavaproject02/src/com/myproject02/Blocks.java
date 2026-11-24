package com.myproject02;

public class Blocks {
	// this is instance
	
	static int count=0;

	{
		System.out.println("instance block started");
		count++;
		
	}
	static {
		System.out.println("static method caledd");
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		Blocks b= new Blocks();
		Blocks b1= new Blocks();
		Blocks b2= new Blocks();
		Blocks b3= new Blocks();
		Blocks b4= new Blocks();
		System.out.println("main method ended");
		System.out.println(count);

	}

}
