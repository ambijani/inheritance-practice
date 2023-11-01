
public class Car extends Vehicle {
	protected int year;
	protected String make;
	protected String model;
	protected int miles;
	protected int gallonsOfFuel;
	
	
	public Car(int year, String make, String model, int gallonsOfFuel) {
		super(year, make, model);
		this.miles = 0;
		this.gallonsOfFuel = gallonsOfFuel; 
	}
	
	public void drive(int milesDriven) {
		this.miles += milesDriven;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMiles() {
		return miles;
	}
	
	public int getFuel() {
		return gallonsOfFuel;
	}
	
}
