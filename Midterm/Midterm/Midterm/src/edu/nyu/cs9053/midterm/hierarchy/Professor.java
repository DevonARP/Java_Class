package edu.nyu.cs9053.midterm.hierarchy;

public class Professor extends Faculty{

	public Professor(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.tenured = true;
		this.title = "Professor";
	}
}
