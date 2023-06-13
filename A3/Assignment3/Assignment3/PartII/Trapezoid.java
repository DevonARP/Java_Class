
public class Trapezoid {
	
	private static int nextid = 0;
	private double base1 = 1;
	private double base2 = 1;
	private double height = 1;
	
	public Trapezoid() {
		nextid = nextid + 1;
	}
	
	public Trapezoid(double b1, double b2, double h) {
		nextid = nextid + 1;
		base1 = b1;
		base2 = b2;
		height = h;
	}
	
	public double getBase1() {
		return base1;
	}
	
	public double getBase2() {
		return base2;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return ((base1+base2)/2)*height;
	}
	
	public int getID() {
		return nextid;
	}
	
	public void setBase1(double b1) {
		base1=b1;
	}
	
	public void setBase2(double b2) {
		base2=b2;
	}
	
	public void setHeight(double h) {
		height=h;
	}
	//I use the TestTrapezoid.java file to test out the class
	
}
