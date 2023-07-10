package edu.nyu.cs9053.midterm.hierarchy;

public class AssistantProfessor extends Faculty{
	
	public AssistantProfessor(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.tenured = false;
		this.title = "Assistant Professor";
	}

}
