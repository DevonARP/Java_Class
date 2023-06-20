package vehicles;

public class Car extends Vehicle {
	
	private int doors;
	
	public Car(int doors, double space, String color) {
		super(4,space,color);
		if(doors == 2) {
			this.doors=doors;
		}
		else if (doors == 4) {
			this.doors=doors;
		}
		else {
			throw new IllegalArgumentException("Door count has to be either 2 or 4"); 
		}
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public String PressGasPedal() {
		return "accelerating";
	}
	
	public String toString() {
		String s = " This vehicle is also a car and has " + this.getDoors() + " doors.";
		return super.toString() + s;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.getDoors()!=((Car) x).getDoors()) {
				return false;
			}
			return true;
		}
		return false;
	}
	
}
