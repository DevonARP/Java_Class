package edu.nyu.cs9053.midterm.hierarchy;

abstract class Student extends UniversityAffiliate {
	
	boolean matriculated;
	
	public void setMatriculated(boolean matriculated) {
		this.matriculated = matriculated;
	}
	
	public boolean isMatriculated() {
		return this.matriculated;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.isMatriculated()!=((Student) x).isMatriculated()) {
				return false;
			}
			return true;
		}
		return false;
	}
	
}
