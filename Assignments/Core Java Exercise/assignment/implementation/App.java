package assignment.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import assignment.exceptions.DataNotPresentException;
import assignment.exceptions.StudentNotFoundException;
import assignment.model.Students;
import assignment.service.StudentsService;
import assignment.service.StudentsServiceImpl;

public class App {

	public static void main(String[] args) {
		Students stud1 = new Students();
		stud1.setId(1);
		stud1.setName("Mahi");
		stud1.setCity("Chennai");
		Students stud2 = new Students(2, "Rishi", "Mumbai");
		Students stud3 = new Students(3, "Gokul", "Outsirts of Chennai");
		Students stud4 = new Students(4, "Shiva", "Himalayas");
		Students stud5 = new Students(5, "Harish", "Hyderabad");
		Students stud6 = new Students(6, "Cronenberg", "Theog");
		Students stud7 = new Students(7, "Villenueve", "Brooklyn");
		Students stud8 = new Students(8, "Fincher", "LA");
		Students stud9 = new Students(9, "Ray", "Mumbai");
		Students stud10 = new Students(10, "Ram", "Chennai");
		StudentsService studentService = new StudentsServiceImpl();
		List<Students> studentsList = new ArrayList<Students>();
		studentsList.addAll(List.of(stud1, stud2, stud3, stud4, stud5, stud6, stud7, stud8, stud9, stud10));
		for (Students student : studentsList) {
			try {
				System.out.println(studentService.addStudents(student));
			} catch (DataNotPresentException d) {
				System.out.println(d.getMessage());
			}
		}
//		Read the data
		List<Students> studList = studentService.getAllStudents();
		System.out.println(studList);
		//Name wise sorting
				Collections.sort(studList,Comparator.comparing(Students::getName));
				System.out.println(studList);
				
				//City wise sorting 
				Collections.sort(studList,Comparator.comparing(Students::getCity));
				System.out.println(studList);
				//Get student by id 
				try {
					Students stu1 = studentService.getStudentById(11);
					System.out.println(stu1);
					Students stu2 = studentService.getStudentById(15);
					System.out.println(stu2);
				} catch (StudentNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				//Display All students from a particular city
				try {
					List<Students> stuList= studentService.getStudentByCity("Chennai");
					System.out.println(stuList);
					List<Students> stuList1= studentService.getStudentByCity("Brooklyn");
					System.out.println(stuList1);
				} catch (StudentNotFoundException e) {
					System.out.println(e.getMessage());
				}

	}

}
