package vehicles;

import java.util.Arrays;

public class Motorcycle extends Vehicle {
	
	private String[] accessories = new String[0];
	
	public Motorcycle(String color) {
		super(2,0,color);
	}
	
	public void setAcc(String acc) {
		String newAcc[] = new String[accessories.length + 1];
		for(int i = 0; i < accessories.length; i++) {
			newAcc[i] = accessories[i];
		}
		newAcc[accessories.length] = acc;
		accessories = newAcc;
	}
	
	public String getAccs() {
		return Arrays.toString(accessories);
	}
	
	public String TwistThrottle() {
		return "accelerating";
	}
	
	public String toString() {
		String s = " This vehicle is also a motorcycle and also has: " + this.getAccs() + " accessorie(s).";
		return super.toString() + s;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.getAccs()!=((Motorcycle) x).getAccs()) {
				return false;
			}
			return true;
		}
		return false;
	}
	
}
