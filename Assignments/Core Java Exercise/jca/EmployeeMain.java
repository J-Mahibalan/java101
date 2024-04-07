package jca;

public class EmployeeMain {
	public static void main(String[] args) {
		Employeejc emp1= new Employeejc(1,"Lynch","New York");
		Employeejc emp2= new Employeejc(2,"Noah","Los Angeles");
		Employeejc emp3= new Employeejc(3,"Greta","Long beach");
		Employeejc emp4= new Employeejc(4,"David","Yorkshire");
		Employeejc emp5= new Employeejc(5,"Baron","Miami");
		
		AddEmployee add = new AddEmployee();
		add.addEmployee(emp1);
		add.addEmployee(emp2);
		add.addEmployee(emp3);
		add.addEmployee(emp4);
		add.addEmployee(emp5);
		
		for (Employeejc e: add.list)
		{
			System.out.println(e);
		}
		System.out.println("\n***********************************************************\n");
		System.out.println(add.getEmployee(4));
	}
}
