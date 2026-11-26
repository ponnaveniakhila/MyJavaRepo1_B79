package mypractice;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("welcome to anumal park");

		// this is up casting , buy using up casting we are achiveing abstraion.
		System.out.println("Cat info  ****************");
		Animal c = new Cat();

		c.eat();
		c.sound();
		c.walk();
		c.sleep();
		// static methods must call using interfacees
		Animal.breath();
		System.out.println("Dog info  ****************");
		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		Animal.breath();
		System.out.println("Monkey info  ****************");
		Animal m = new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.sleep();
		Animal.breath();
		m=null;
		c=null;
		d=null;
		

	}

}
