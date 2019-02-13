package com.socgen.demo;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.socgen.dao.EmployeeDetails;
import com.socgen.file.FileReadWriter;

public class Employee {
	private static final String filepath="C:\\Users\\Yash\\Desktop\\Emp.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		EmployeeDetails employee = new EmployeeDetails();
		FileReadWriter f = new FileReadWriter();
		System.out.println("Choose one of the following options:\n1. Enter an Employee's Data.\n2. Retrieve info of an Employee. \n3. Get all sorted employee's Name.");
		int option = input.nextInt();
		switch(option) {
			case 1: {
				System.out.println("Enter Employee's First name: "); employee.setFirstName(input.next());
				System.out.println("Enter Employee's Last name: "); employee.setLastName(input.next());
				System.out.println("Enter Employee's ID: "); employee.setEmpId(input.nextInt());
				System.out.println("Enter Employee's Department: "); employee.setDpt(input.next());
				f.writeObjectToFile(employee);
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				List<EmployeeDetails> empObj=f.readObjectFromFile();
				Collections.sort(empObj);
				for (EmployeeDetails e : empObj) {
					System.out.println("Name: "+ e.getFirstName()+" "+e.getLastName()+"\n");
					System.out.println("Emp ID: "+ e.getEmpId()+"\n");
					System.out.println("Dept: "+ e.getDpt()+"\n");
					System.out.println("----------------\n");
				}
				break;
			}
			
		}
	}
	
	

}
