package mypractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can use upcasting here, even though we are unable create abject class 
		//still we can access the abstract class instance methods.by using upcasting
		//blocks also called from abstract class with upcasting
		AbsClass t= new Test();
		t.test();
		t.test1();
		t.test2();
		t.test3();
		//instance method in abstract, 
		t.hello();
		//calling static varibale
		System.out.println("static variable"+AbsClass.a);
//calling instance varibale
		System.out.println("instance varibale "+t.b);
		//calling final variable
		System.out.println("final varibale "+t.c);
		//blocks also called from abstract class with upcasting
		System.out.println("***********");
		AbsClass t1= new Test3();
		t1.test();
		t1.test1();
		t1.test2();
		t1.test3();
		t1.hello();
	}

}
