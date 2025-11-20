package com.student;
import java.util.ArrayList;
import java.util.List;

public class StudentImplementation implements StudentOperations{
	
	private List<Student> slList = new ArrayList<Student>();

	@Override
	public void addStudent(Student student) {
		
		slList.add(student);
		
	}

	@Override
	public boolean deleteStudent(int id) {
		
		for (Student s : slList) {
			 if(s.getId() == id) {
				 slList.remove(s);
				 return true;
			 }
		}
		return false;
	}

	@Override
	public boolean updateStudent(int id, Student updatedStudent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countStudents() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	

}
