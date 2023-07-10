package edu.nyu.cs9053.midterm.hierarchy;

public class Test {
	
	public static void main(String[] args)  {
		
		System.out.println("Undergraduate Testing");
		UndergraduateStudent US1 = new UndergraduateStudent("Anil", 24, false);
		UndergraduateStudent US2 = new UndergraduateStudent("Anil", 24, false);
		System.out.println(US1.equals(US2));
		US2.setAge(25);
		System.out.println(US1.equals(US2));
		US2.setAge(24);
		US2.setName("Devon");
		System.out.println(US1.equals(US2));
		US2.setName("Anil");
		US2.setMatriculated(true);
		System.out.println(US1.equals(US2));
		US2.setMatriculated(false);
		System.out.println(US1.equals(US2));
		
		System.out.println("Graduate Testing");
		GraduateStudent GS1 = new GraduateStudent("Anil", 24, true);
		GraduateStudent GS2 = new GraduateStudent("Anil", 24, true);
		System.out.println(GS1.equals(GS2));
		GS2.setAge(25);
		System.out.println(GS1.equals(GS2));
		GS2.setAge(24);
		GS2.setName("Devon");
		System.out.println(GS1.equals(GS2));
		GS2.setName("Anil");
		GS2.setMatriculated(false);
		System.out.println(GS1.equals(GS2));
		GS2.setMatriculated(true);
		System.out.println(GS1.equals(GS2));
		
		System.out.println("Student Testing");
		System.out.println(US1.equals(GS1));
		
		System.out.println("Lecturer Testing");
		Lecturer L1 = new Lecturer("Anil", 24, 1000.45);
		Lecturer L2 = new Lecturer("Anil", 24, 1000.45);
		System.out.println(L1.equals(L2));
		L2.setAge(25);
		System.out.println(L1.equals(L2));
		L2.setAge(24);
		L2.setName("Devon");
		System.out.println(L1.equals(L2));
		L2.setName("Anil");
		L2.setSalary(1000.46);
		System.out.println(L1.equals(L2));
		L2.setSalary(1000.45);
		L2.setTitle("");
		System.out.println(L1.equals(L2));
		L2.setTitle("Lecturer");
		L2.setTenured(true);
		System.out.println(L1.equals(L2));
		L2.setTenured(false);
		System.out.println(L1.equals(L2));
		
		System.out.println("Assistant Testing");
		AssistantProfessor A1 = new AssistantProfessor("Anil", 24, 1000.45);
		AssistantProfessor A2 = new AssistantProfessor("Anil", 24, 1000.45);
		System.out.println(A1.equals(A2));
		A2.setAge(25);
		System.out.println(A1.equals(A2));
		A2.setAge(24);
		A2.setName("Devon");
		System.out.println(A1.equals(A2));
		A2.setName("Anil");
		A2.setSalary(1000.46);
		System.out.println(A1.equals(A2));
		A2.setSalary(1000.45);
		A2.setTitle("");
		System.out.println(A1.equals(A2));
		A2.setTitle("Assistant Professor");
		A2.setTenured(true);
		System.out.println(A1.equals(A2));
		A2.setTenured(false);
		System.out.println(A1.equals(A2));
		
		System.out.println("Associate Testing");
		AssociateProfessor AP1 = new AssociateProfessor("Anil", 24, 1000.45);
		AssociateProfessor AP2 = new AssociateProfessor("Anil", 24, 1000.45);
		System.out.println(AP1.equals(AP2));
		AP2.setAge(25);
		System.out.println(AP1.equals(AP2));
		AP2.setAge(24);
		AP2.setName("Devon");
		System.out.println(AP1.equals(AP2));
		AP2.setName("Anil");
		AP2.setSalary(1000.46);
		System.out.println(AP1.equals(AP2));
		AP2.setSalary(1000.45);
		AP2.setTitle("");
		System.out.println(AP1.equals(AP2));
		AP2.setTitle("Associate Professor");
		AP2.setTenured(true);
		System.out.println(AP1.equals(AP2));
		AP2.setTenured(false);
		System.out.println(AP1.equals(AP2));
		
		System.out.println("Professor Testing");
		Professor P1 = new Professor("Anil", 24, 1000.45);
		Professor P2 = new Professor("Anil", 24, 1000.45);
		System.out.println(P1.equals(P2));
		P2.setAge(25);
		System.out.println(P1.equals(P2));
		P2.setAge(24);
		P2.setName("Devon");
		System.out.println(P1.equals(P2));
		P2.setName("Anil");
		P2.setSalary(1000.46);
		System.out.println(P1.equals(P2));
		P2.setSalary(1000.45);
		P2.setTitle("");
		System.out.println(P1.equals(P2));
		P2.setTitle("Professor");
		P2.setTenured(false);
		System.out.println(P1.equals(P2));
		P2.setTenured(true);
		System.out.println(P1.equals(P2));
		
		System.out.println("Faculty Testing");
		System.out.println(L1.equals(A1));
		System.out.println(L1.equals(AP1));
		System.out.println(L1.equals(P1));
		System.out.println(A1.equals(AP1));
		System.out.println(A1.equals(P1));
		System.out.println(AP1.equals(P1));
		
		System.out.println("Staff Testing");
		Staff S1 = new Staff("Anil", 24, 1000.45,"Staff");
		Staff S2 = new Staff("Anil", 24, 1000.45,"Staff");
		System.out.println(S1.equals(S2));
		S2.setAge(25);
		System.out.println(S1.equals(S2));
		S2.setAge(24);
		S2.setName("Devon");
		System.out.println(S1.equals(S2));
		S2.setName("Anil");
		S2.setSalary(1000.46);
		System.out.println(S1.equals(S2));
		S2.setSalary(1000.45);
		S2.setTitle("");
		System.out.println(S1.equals(S2));
		S2.setTitle("Staff");
		System.out.println(S1.equals(S2));
		
		System.out.println("Adminstrator Testing");
		Staff AD1 = new Staff("Anil", 24, 1000.45,"Adminstrator");
		Staff AD2 = new Staff("Anil", 24, 1000.45,"Adminstrator");
		System.out.println(AD1.equals(AD2));
		AD2.setAge(25);
		System.out.println(AD1.equals(AD2));
		AD2.setAge(24);
		AD2.setName("Devon");
		System.out.println(AD1.equals(AD2));
		AD2.setName("Anil");
		AD2.setSalary(1000.46);
		System.out.println(AD1.equals(AD2));
		AD2.setSalary(1000.45);
		AD2.setTitle("");
		System.out.println(AD1.equals(AD2));
		AD2.setTitle("Adminstrator");
		System.out.println(AD1.equals(AD2));
		
		System.out.println("Employee Testing");
		System.out.println(S1.equals(AD1));
		
		System.out.println("Student-Faculty Testing");
		System.out.println(US1.equals(L1));
		System.out.println(US1.equals(A1));
		System.out.println(US1.equals(AP1));
		System.out.println(US1.equals(P1));
		System.out.println(GS1.equals(L1));
		System.out.println(GS1.equals(A1));
		System.out.println(GS1.equals(AP1));
		System.out.println(GS1.equals(P1));
		
		System.out.println("Employee-Faculty Testing");
		System.out.println(S1.equals(L1));
		System.out.println(S1.equals(A1));
		System.out.println(S1.equals(AP1));
		System.out.println(S1.equals(P1));
		System.out.println(AD1.equals(L1));
		System.out.println(AD1.equals(A1));
		System.out.println(AD1.equals(AP1));
		System.out.println(AD1.equals(P1));
		
		System.out.println("Employee-Student Testing");
		System.out.println(S1.equals(US1));
		System.out.println(S1.equals(GS1));
		System.out.println(AD1.equals(US1));
		System.out.println(AD1.equals(GS1));
		

	}

}
