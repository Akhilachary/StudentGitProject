package com.student;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("******************Welcome to the Student Portal*********************");
		
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
									
				}
				break;
				
				
				case 3:{
					
				}
				break;
				
				
				case 4:{
					
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
