package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Services extends Employee implements EmpService
{
	Employee emp = new Employee();
	Scanner sc = new Scanner(System.in);
	public void showDetails()
	{
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Designation: "+emp.getDesgn());
		System.out.println("Scheme: "+emp.getInsrSchm());
	}
	public void putDetails()
	{
		System.out.println("Enter Id: ");
		emp.setId(sc.nextInt());
		System.out.println("Enter Name: ");
		emp.setName(sc.next());
		System.out.println("Enter Salary: ");
		emp.setSalary(sc.nextDouble());
		System.out.println("Enter Designation: ");
		emp.setDesgn(sc.next());
		emp.setInsrSchm(getInsSchm(emp.getSalary(),emp.getDesgn()));
	}
	public String getInsSchm(double sal, String desgn)
	{
		String insSch = null;
		if(sal<5000 && desgn.equals("Clerk"))
		{
			insSch = "No scheme.";
		}
		else if(((sal>=5000) && (sal<20000)) && (desgn.equals("System Associate")))
		{
			insSch = "Scheme C.";
		}
		else if(((sal>=20000) && (sal<40000)) && (desgn.equals("Programmer")))
		{
			insSch = "Scheme B.";
		}
		else if(((sal>=20000) && (sal<40000)) && (desgn.equals("Manager")))
		{
			insSch = "Scheme A.";
		}
		return insSch;
	}
	
}
