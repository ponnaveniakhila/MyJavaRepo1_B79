package com.javaproject2;

public class Costructor02 {
	String sname;
	String sid;
	int sage;
	// the above 3 are the current object data.

	// parametarized constructor
	Costructor02(String sname, String sid, int sage) {
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
		System.out.println("parameterized constuctor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Costructor02 c = new Costructor02("akhila", "4", 22);
		c.show();
		Costructor02 c1 = new Costructor02("shanu", "41", 30);
		c1.show();

	}

	void show() {

		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
	}
}
