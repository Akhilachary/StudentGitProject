package com.student;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		
		System.out.println("******************Welcome to the Student Portal*********************");
		
		StudentImplementation implementation = new StudentImplementation();
		
		while(true) {
			
			System.out.println("1.Find Student \n2.Add Student \n3.Update Student \n4.Delete Student \n5.Print all Student \n6.Count student");
			System.out.println("Select your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					      
				}
				break;
				
				
				case 2:{
							
							System.out.println("Enter Student ID");
							int sid = sc.nextInt();
							System.out.println("Enter student name");
							String sname = sc.next();
							System.out.println("Enter student CGPA");
							double cgpa = sc.nextDouble();
							
							Student student = new Student(sid, sname, cgpa);
							implementation.addStudent(student);
							
							System.err.println("Student with ID " + sid + " Added sucessfully");
							
				}
				break;
				
				
				case 3:{
					
				}
				break;
				
				
				case 4:{
					  
					System.out.println("Enter student ID");
					int sid = sc.nextInt();
					
					if(implementation.deleteStudent(sid)) {
						System.err.println("Student deleted successfully with this ID "+ sid);
					}else {
						System.err.println("Student with this " + sid + " not found" );
					}
					
					
				}
				break;
				
				
				case 5:{
					
				}
				break;
				
				
				case 6:{
					
				}
				break;
				
				
				default:{
					System.out.println("Please Enter a valid Choice!.");
				}
			}
		}
	}
}
