public class ComplexNumber extends Number implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double a;
	double b;
	
	public ComplexNumber(double a,double b) {
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumber(double a) {
		this.a = a;
		this.b = 0;
	}
	
	public ComplexNumber() {
		this.a = 0;
		this.b = 1;
	}
	
	public double getReal() {
		return a;
	}
	
	public double getImaginary() {
		return b;
	}
	
	public String toString() {
		if(b!=0) {
			String s = a + " + " + b + "i";
			return s;
		} else {
			String s = a + "";
			return s;
		}
	}
	
	public ComplexNumber add(ComplexNumber x) {
		double p1 = this.getReal() + x.getReal();
		double p2 = this.getImaginary() + x.getImaginary();
		ComplexNumber y = new ComplexNumber(p1,p2);
		return y;
	}

	public ComplexNumber subtract(ComplexNumber x) {
		double p1 = this.getReal() - x.getReal();
		double p2 = this.getImaginary() - x.getImaginary();
		ComplexNumber y = new ComplexNumber(p1,p2);
		return y;
	}
	
	public ComplexNumber multiply(ComplexNumber x) {
		double p1 = (this.getReal()*x.getReal()) - (this.getImaginary()*x.getImaginary());
		double p2 = (this.getImaginary()*x.getReal()) + (this.getReal()*x.getImaginary()); 
		ComplexNumber y = new ComplexNumber(p1,p2);
		return y;
	}
	
	public ComplexNumber divide(ComplexNumber x) {
		double p1 = (this.getReal()*x.getReal()) + (this.getImaginary()*x.getImaginary());
		double p2 = Math.pow(x.getReal(), 2) + Math.pow(x.getImaginary(), 2);
		double p3 = (this.getImaginary()*x.getReal()) - (this.getReal()*x.getImaginary()); 
		double p4 = p1/p2;
		double p5 = p3/p2;
		ComplexNumber y = new ComplexNumber(p4,p5);
		return y;
	}
	
	public double abs() {
		double p1 = Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2);
		double p2 = Math.sqrt(p1);
		return p2;
	}
	
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (ComplexNumber)super.clone();
    }

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int) a;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long) a;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float) a;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return a;
	}
	
	public int getInt() {
		return (int) a;
	}
	
	public double getDouble() {
		return a;
	}
	
	public float getFloat() {
		return (float) a;
	}
	
	public long getLong() {
		return (long) a;
	}
}
