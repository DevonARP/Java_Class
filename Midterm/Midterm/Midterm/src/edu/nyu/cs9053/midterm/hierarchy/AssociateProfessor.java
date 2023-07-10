package edu.nyu.cs9053.midterm.hierarchy;

public class AssociateProfessor extends Faculty{
	
	public AssociateProfessor(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.tenured = false;
		this.title = "Associate Professor";
	}

}
