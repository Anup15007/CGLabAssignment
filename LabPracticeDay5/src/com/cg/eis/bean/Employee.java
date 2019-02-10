package com.cg.eis.bean;

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
		this.salary = salary;
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
