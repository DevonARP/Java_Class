package vehicles;

public class Bicycle extends Vehicle{
	
	private boolean electric;
	
	public Bicycle(String color, boolean electric) {
		super(2,0,color);
		this.electric = electric;
	}
	
	public boolean getElectric() {
		return electric;
	}
	
	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
	public String Pedal() {
		return "pedaling";
	}
	
	public String toString() {
		String s = " This vehicle is also a bicycle and also is possibly electric: " + this.getElectric() + ".";
		return super.toString() + s;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.getElectric()!=((Bicycle) x).getElectric()) {
				return false;
			}
			return true;
		}
		return false;
	}
	
}