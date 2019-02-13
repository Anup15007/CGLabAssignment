package com.cg.eis.services;
import com.cg.eis.beans.Designations;
import com.cg.eis.beans.InsuranceSchemes;
public interface EmployeeService 
{
	public abstract void addEmployeeDetails(int id,String name,double salary,Designations  designation, InsuranceSchemes insuranceScheme);
	public abstract InsuranceSchemes showInsuranceSchemes(int id, double salary,Designations  designation);
	public abstract String dispEmployeeDetails(int id);
}
