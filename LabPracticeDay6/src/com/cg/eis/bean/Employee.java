package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

public class Employee 
{
	private int id;
	private String name;
	private static double salary;
	private String desgn;
	private String insrSchm;
	public Employee(){}
	public Employee(int id, String name, String desgn, String insrSchm) 
	{
		super();
		this.id = id;
		this.name = name;
		this.desgn = desgn;
		this.insrSchm = insrSchm;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		if(salary>3000)
		{
				this.salary = salary;
		}
		else
		{
			try
			{
				throw new EmployeeException();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Low Salary.");
			}
		}
	}
	public String getDesgn() 
	{
		return desgn;
	}
	public void setDesgn(String desgn) 
	{
		if(desgn.equals("System"))
		{
			this.desgn = desgn + " Associate";
		}
		else this.desgn = desgn;
	}
	public String getInsrSchm() 
	{
		return insrSchm;
	}
	public void setInsrSchm(String insrSchm) 
	{
		this.insrSchm = insrSchm;
	}
	
}
