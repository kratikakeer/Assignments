package com.te.assignment;

public class Feed {

	public static void main(String[] args) {
		Extract e = new Extract();
		Intern i = new Intern("Darshana", "Intern", 60000);
		SeniorDeveloper sd = new SeniorDeveloper("Kratika", "Senior Developer", 70000);
		ManualTestEngineer m = new ManualTestEngineer("Yashoda", "Manual Tester", 40000);
		AutomationTestEngineer a = new AutomationTestEngineer("Sanjana", "Automation Tester", 50000);
		Hr h = new Hr("Ranjitha", "HR", 100000);
		e.get(i);
		System.out.println("____________________________________");
		e.get(m);
		System.out.println("_____________________________________");
		e.get(sd);
		System.out.println("_____________________________________");
		e.get(a);
		System.out.println("_____________________________________");
		e.get(h);
		System.out.println("______________________________________");
		Employee ee = new Employee();

	}

}
