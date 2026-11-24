package com.myproject02;
//we can create a object in class level and give it static and we can use it any static area to call the instance data members

public class JvmDemo04 {
	static JvmDemo04 obj1 = new JvmDemo04();

	void method4() {
		System.out.println("method 4 called");
	}

// in instance area we can call instance data members directly
	void method3() {

		method4();
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

		// here we are using the call levle obj1
		obj1.method1();

	}

}
