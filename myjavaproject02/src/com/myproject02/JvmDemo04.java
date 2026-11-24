package com.myproject02;

public class JvmDemo04 {
	void method3() {
		System.out.println("method 3 called");
	}

// in instance area we can call the static data members direclty
	void method1() {
		method2();
		System.out.println("method1 is called");
	}
//in static  area we cannot call instance data member directly , with object creation we will call the instance data members

	static void method2() {
		JvmDemo04 j = new JvmDemo04();
		j.method3();

		System.out.println("method 2 called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JvmDemo04 obj = new JvmDemo04();
		obj.method1();

	}

}
