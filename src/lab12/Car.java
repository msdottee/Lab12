package lab12;

public class Car {
	
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	//no-args constructor
	public Car() {
		
	}

	// 4 argument constructor
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return make + "\t" + model + "\t" + year + "\t$" + price;
	}
	
	
	

}
