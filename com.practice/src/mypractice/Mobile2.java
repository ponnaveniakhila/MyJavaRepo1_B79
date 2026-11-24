package mypractice;

public class Mobile2 extends Device1 {
	//camera, battery
	
	
	 //makeCall(), takephoto()
	 
	 private String camera;
	 private String battery;
	 public void setCamera (String camera) {
		 this.camera=camera;
		 
	 }
	 public void setBattery(String battery) {
		 this.battery=battery;
	 }
	 public String getCamera() {
		 return camera;
	 }
	 public String getBattery() {
		 return battery;
	 }
	 void makeCall(){
		 System.out.println("Device is Mobile");
		 System.out.println("Mobile battery is full.. you can  take a call");
	 }
	 void takephoto() {
		 System.out.println("camera having good cemara so  ..take a picture!!");
	 }
	 @Override
	 void displaydetails() {
		 super.displaydetails();
		 System.out.println("Laptop camera is "+camera);
		 System.out.println("Laptop battery is "+battery );
	 }
}
