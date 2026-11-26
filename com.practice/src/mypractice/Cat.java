package mypractice;

//by using interface we can achive abstraction with class and interface with implements key word
public class Cat implements Animal {

	@Override
	// the scope should not reduce for overrideing methods so we keep public
	public void eat() {
		System.out.println("Cat can eat rat..");

	}

	@Override
	public void sound() {
		// we can call static method in class
		// Animal.breath();
		System.out.println("Cat  can sound like meow meow!!");

	}

	@Override
	public void walk() {
		// we can call default method in class using the object refernece
		// Cat c1= new Cat();
		// c1.sleep();
		System.out.println("Cat walk like CatWalk");

	}

}
