package assignment.dao;

import java.util.ArrayList;
import java.util.List;

import assignment.exceptions.DataNotPresentException;
import assignment.exceptions.StudentNotFoundException;
import assignment.model.Students;

public class  StudentsDAOImpl implements StudentsDAO {
	private static List<Students> studentsList=new ArrayList<Students>();
	@Override
	public String addStudents(Students student) {
		if(student!=null) {
			studentsList.add(student);
			return "Student with student id " + student.getId() + " added successfully";
		}else {
			throw new DataNotPresentException("Data not present");
		}

	}
	public List<Students> getAllStudents(){
		return studentsList;
	}
	@Override
	public List<Students> getStudentByCity(String city) throws StudentNotFoundException{
		List<Students> studWithSameCity = new ArrayList<Students>();
		for(Students student: studentsList) {
			if(student.getCity().equalsIgnoreCase(city)) {
				studWithSameCity.add(student);				
			}
		}
		if(studWithSameCity != null && !studWithSameCity.isEmpty()) {
			return studWithSameCity;
		}else {
			throw new StudentNotFoundException("Student with city name "+city+" doesn't exists");
		}
	}

	@Override
	public Students getStudentById(Integer id) throws StudentNotFoundException {
		boolean isAvaliable =false;
		Students st =null;
		
		for(Students student: studentsList) {
			if(student.getId() == id) {
				st =student;
				isAvaliable=true;
				break;
			}
		}
		if(!isAvaliable) {
			throw new StudentNotFoundException("Student with id "+id+" doesn't exists");
		}else {
			return st;
		}
		
	}

}
