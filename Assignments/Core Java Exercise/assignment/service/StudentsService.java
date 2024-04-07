package assignment.service;

import java.util.List;

import assignment.exceptions.StudentNotFoundException;
import assignment.model.Students;

public interface StudentsService {
//	Add Students
	public String addStudents(Students student);
	public  List<Students> getAllStudents();
	public List<Students> getStudentByCity(String city) throws StudentNotFoundException;

	//display or get students on the basis of given student id method and handle student not found exception
	public Students getStudentById(Integer id) throws StudentNotFoundException;
}
