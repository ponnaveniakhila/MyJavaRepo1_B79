package mypractice;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog can eat non-veg");

	}

	@Override
	public void sound() {
		System.out.println("Dog can soud like bow bow!!");

	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and run");

	}

	// overrideing the default method in Dog class. you can not use default here.
	public void sleep() {
		System.out.println("Dog not sleep at night ..provide secury for the people");
	}

}
