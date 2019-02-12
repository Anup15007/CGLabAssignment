package com.cg.eis.services;

import java.util.Comparator;

import com.cg.eis.beans.Employee;

public class InsuranceServiceDemo implements EmployeeService,Comparator<Employee>  {
	
	@Override
	public String findScheme(long salary,String designation) 
	{	String insuranceScheme;
		if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate"))
		{
			insuranceScheme = "C";
		}
		else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
		{
			insuranceScheme ="B";
		}
		else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
		{
			insuranceScheme ="A";
		}
		else
			insuranceScheme="No Scheme";
		
		return insuranceScheme;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getSalary()-o2.getSalary());
	}
	

}