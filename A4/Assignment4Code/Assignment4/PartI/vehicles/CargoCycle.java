package vehicles;

public class CargoCycle extends Bicycle{
	
	public CargoCycle(String color, int wheels, double space, boolean electric) {
		super(color, electric);
		if(wheels == 2) {
			this.setWheels(wheels);
			this.setSpace(space);
		}
		else if (wheels == 3) {
			this.setWheels(wheels);
			this.setSpace(space);
		}
		else if (wheels == 4) {
			this.setWheels(wheels);
			this.setSpace(space);
		}
		else {
			throw new IllegalArgumentException("Wheel count has to be either 2, 3, or 4."); 
		}
	}
	
	public String toString() {
		String s = " This bicycle is also a cargocycle.";
		return super.toString() + s;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			return true;
		}
		return false;
	}
	
}
