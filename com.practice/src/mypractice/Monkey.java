package mypractice;

public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey can eat only veg..");

	}

	@Override
	public void sound() {
		System.out.println("Monkey can soud like kich kich!!");

	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and jump..");

	}

}
