package mypractice;

public class VarArg {

	public static void main(String[] args) {
		addition(10,20);
		addition(10,20,30);
		addition(10,20,40);
		addition(10,20,30,40,50);



		

	}
	
//instread of create multiple methods so pass multipul argment we use var here
	 static int sum=0;
	static void addition(int... i) {
		//here it is like array , wiht collection of Int values
		for (int value :i) {
			sum= sum+value;
			
		}
		
		System.out.println("sum is"+sum);
	}

}
