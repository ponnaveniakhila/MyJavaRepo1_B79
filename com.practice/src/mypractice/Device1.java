package mypractice;

public class Device1 {
	private String brand;
	private double price;

	void displaydetails() {
		System.out.println("Device brand is " + brand);
		System.out.println("Device price  is " + price);
	}

	public void setBrand(String Brand) {
		this.brand = Brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
}
