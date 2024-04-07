package assignment.dao;

import java.util.List;

import assignment.exceptions.StudentNotFoundException;
import assignment.model.Students;

public interface StudentsDAO {
//	Add Students
	public String addStudents(Students student);
	public  List<Students> getAllStudents();
	// Display student city name sorted
		public List<Students> getStudentByCity(String city) throws StudentNotFoundException;

		// display or get students on the basis of given student id method and handle
		// student not found exception
		public Students getStudentById(Integer id) throws StudentNotFoundException;
}
