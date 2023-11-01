
public class Bicycle extends Vehicle {
	protected int year;
	protected String make;
	protected String model;
	protected int miles;
	protected boolean maintenance;
	
	public Bicycle(int year, String make, String model) {
		super(year, make, model);
		this.miles = 0;
		this.maintenance = false;
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
	
	public boolean getMaintenance() {
		return maintenance;
	}
	
	

}
