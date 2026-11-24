package mypractice;



public class Laptop extends Device1 {
 private String ram;
 private String processer;
 public void setRam (String ram) {
	 this.ram=ram;
	 
 }
 public void setProcesser(String processer) {
	 this.processer=processer;
 }
 public String getRam() {
	 return ram;
 }
 public String getprocesser() {
	 return processer;
 }
 
 void RunIDE() {
	 System.out.println("Device is Laptop");
	 System.out.println("Run IDE is elipse");
 }
 void compilecode() {
	 System.out.println("you can compile the code!!");
 }
 @Override
 void displaydetails() {
	 super.displaydetails();
	 System.out.println("Laptop ram is "+ ram);
	 System.out.println("Laptop processor is "+ processer);
 }
 
}
