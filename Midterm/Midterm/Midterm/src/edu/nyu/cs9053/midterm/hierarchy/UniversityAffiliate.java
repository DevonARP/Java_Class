package edu.nyu.cs9053.midterm.hierarchy;

abstract class UniversityAffiliate {
	
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean equals(Object x) {
		if(this.getClass()!=x.getClass()) {
			return false;
		}
		if(this.getName()!=((UniversityAffiliate) x).getName()) {
			return false;
		}
		if(this.getAge()!=((UniversityAffiliate) x).getAge()) {
			return false;
		}
		return true;
	}
	
}
