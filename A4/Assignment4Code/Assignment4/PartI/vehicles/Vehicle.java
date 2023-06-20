package vehicles;

public class Vehicle {
	
	private int wheels;
	private double space;
	private String color;
	private int id;
	private static int next_id = 0;
	
	public Vehicle(int wheels, double space, String color) {
		this.wheels = wheels;
		this.space = space;
		this.color = color;
		next_id = next_id + 1;
		this.id = next_id;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getSpace() {
		return space;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpace(double space) {
		this.space = space;
	}
	
	public int getiD() {
		return id;
	}
	
	public String toString() {
		String s = "This vehicle has " + this.getWheels() + " wheel(s), " + this.getSpace() + " cubic feet of cargo space, is "
				+  this.getColor() + " and has ID number " + this.getiD() + ".";
		return s;
	}
	
	public boolean equals(Object x) {
		if(this.getClass()!=x.getClass()) {
			return false;
		}
		if(this.getColor()!=((Vehicle) x).getColor()) {
			return false;
		}
		if(this.getWheels()!=((Vehicle) x).getWheels()) {
			return false;
		}
		if(this.getSpace()!=((Vehicle) x).getSpace()) {
			return false;
		}
		return true;
	}

}




