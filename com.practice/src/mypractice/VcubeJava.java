package mypractice;

public class VcubeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l= new Laptop();
		l.setRam("5g");
		l.setProcesser("i5");
		l.setBrand(" Samsung");
		l.setPrice(70000);
		
		l.RunIDE();
		l.compilecode();
		l.displaydetails();
		System.out.println("*********");
		
		
		Mobile2 m= new Mobile2();
		m.setBattery(" 4,500 mAh ");
		m.setCamera("Ultra-premium flagship main cameras");
		m.setBrand("LG");
		m.setPrice(60000);
		m.makeCall();
		m.takephoto();
		m.displaydetails();

	}

}
