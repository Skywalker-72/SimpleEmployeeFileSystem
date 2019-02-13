package com.socgen.dao;

import java.io.Serializable;

public class EmployeeDetails implements Serializable,Comparable<EmployeeDetails>{
	 private static final long serialVersionUID = 1L;
	 
	private String firstName;
	private String lastName;
	private int empId;
	private String dpt;


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	
	@Override     
	  public int compareTo(EmployeeDetails emp) {          
	    return this.getFirstName().compareTo(emp.getFirstName());     
	}
	
	@Override
    public String toString() {
        return new StringBuffer(this.firstName+",")
                .append(this.lastName+",").append(this.empId+",")
                .append(this.dpt).append("\n").toString();
    }
	
	
}
