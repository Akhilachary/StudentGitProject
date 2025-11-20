package com.student;

import java.util.List;

public interface StudentOperations {

	void addStudent(Student student);

	boolean deleteStudent(int id);

	boolean updateStudent(int id);

	Student getStudentById(int id);

	List<Student> getAllStudents();

	int countStudents();
}
