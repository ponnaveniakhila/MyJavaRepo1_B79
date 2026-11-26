package mypractice;

public interface Animal {
	public static final String org = "Vcube";

	public abstract void eat();

	public abstract void sound();

	// where you give are not all the methods in interface public
	abstract void walk();

	// Default methods can override, call using the obj reference variable
	public default void sleep() {
		hello();
		rest();
		System.out.println("Most of the animals are sleep in night");
	}

	public static void breath() {
		hello();
		System.out.println("evey Animal must breath!!!");
	}

	private static void hello() {
		System.out.println("hello");
	}

	// this private method we can not call in staic method.
	private void rest() {
		System.out.println("animal must take rest to servival..");
	}
}
