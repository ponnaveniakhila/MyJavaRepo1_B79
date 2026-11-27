package mypractice;

public abstract  class AbsClass  implements Ins1{
	// static varibales
	static int a=10;
	//instance variables
	int b=10;
	// final methods
	final int c=20;
	//abstract method
	abstract void hello1();
	//static block
	static {
		System.out.println("static block called");
	}
	//constructor
	AbsClass(){
		System.out.println("no arg called");
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test4() {
		
	}
	//concreate (normal) method
	void hello() {
		System.out.println("hello from abstract class");
	}
	{
		System.out.println("block called from abstract class");
	}

}
