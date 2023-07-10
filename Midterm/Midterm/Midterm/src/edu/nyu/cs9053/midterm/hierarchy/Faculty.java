package edu.nyu.cs9053.midterm.hierarchy;

abstract class Faculty extends Employee{
	
	boolean tenured;
	
	public void setTenured(boolean tenured) {
		this.tenured = tenured;
	}
	
	public boolean isTenured() {
		return this.tenured;
	}
	
	public boolean isAdjunct() {
		boolean adjunct = !this.tenured;
		return adjunct;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.isTenured()!=((Faculty) x).isTenured()) {
				return false;
			}
			if(this.isAdjunct()!=((Faculty) x).isAdjunct()) {
				return false;
			}
			return true;
		}
		return false;
	}
}
