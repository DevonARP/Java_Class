package edu.nyu.cs9053.midterm.hierarchy;

abstract class Employee extends UniversityAffiliate{
	
	double salary;
	String title;

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean equals(Object x) {
		if(super.equals(x) == true) {
			if(this.getSalary()!=((Employee) x).getSalary()) {
				return false;
			}
			if(this.getTitle()!=((Employee) x).getTitle()) {
				return false;
			}
			return true;
		}
		return false;
	}
}
