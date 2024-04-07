package jca;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	List<Employeejc> list = new ArrayList();// this is to store the employees

	void addEmployee(Employeejc emp) {
		list.add(emp);
		// this method will add a new employee
	}

	Employeejc getEmployee(int id) {     // will return the employee based on the id if 
		for(Employeejc e: list) {		   // the employee is available else returns null.
			if(e.geteId()==id) {
				return e;
			}
		}
		return null;
	}
			

}
