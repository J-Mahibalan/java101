package assignment.service;

import java.util.List;

import assignment.dao.StudentsDAO;
import assignment.dao.StudentsDAOImpl;
import assignment.exceptions.StudentNotFoundException;
import assignment.model.Students;

public class StudentsServiceImpl implements StudentsService {

	@Override
	public String addStudents(Students student) {
//		Create an Object of DAO Impl class
		StudentsDAO studentsDAO=new StudentsDAOImpl();
//		Using above object call the addStudents
//		and pass the student reference variable
//		addStudent method on successful addition returns message
		String message=studentsDAO.addStudents(student);
		return message;
	}

	@Override
	public List<Students> getAllStudents() {
		StudentsDAO studentsDAO=new StudentsDAOImpl();
		List<Students> student=studentsDAO.getAllStudents();
		return student;
	}
	public List<Students> getStudentByCity(String city) throws StudentNotFoundException {
		StudentsDAO studentsDAO = new StudentsDAOImpl();
		return studentsDAO.getStudentByCity(city);
	}


	public Students getStudentById(Integer id) throws StudentNotFoundException {
		StudentsDAO studentsDAO = new StudentsDAOImpl();
		return studentsDAO.getStudentById(id);
	}

}
