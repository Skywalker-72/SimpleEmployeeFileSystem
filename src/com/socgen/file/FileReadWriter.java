package com.socgen.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.socgen.dao.EmployeeDetails;

public class FileReadWriter {
	private static Scanner input;
	List<EmployeeDetails> employeeDataList = new ArrayList<EmployeeDetails>();
	
	public void writeObjectToFile(EmployeeDetails serObj) {
		 
        try {
 
			File file = new File("Employee.txt");
			FileWriter fr = new FileWriter(file,true);
			fr.write(serObj.toString()); fr.close();
            System.out.println("The Employee details are succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	public List<EmployeeDetails> readObjectFromFile() throws IOException {
		
		try {
			BufferedReader userlines = new BufferedReader(new FileReader("Employee.txt"));
			EmployeeDetails emp = new EmployeeDetails();
			employeeDataList.clear();
			String line = null;
			while((line=userlines.readLine()) != null) {
				emp = new EmployeeDetails();
				/*System.out.println(line);*/
				String[] temp = line.split(",");
				emp.setFirstName(temp[0]); emp.setLastName(temp[1]);
				emp.setEmpId(Integer.parseInt(temp[2])); emp.setDpt(temp[3]);
				employeeDataList.add(emp);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Employee data:"+ employeeDataList.size());
		return employeeDataList;
	}

}
