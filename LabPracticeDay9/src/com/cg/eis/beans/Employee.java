package com.cg.eis.beans;
public class Employee 
{
	int id;
	String name;
	double salary;
	Designations designation;
	InsuranceSchemes insuranceSchemes=null;
	public Employee(int id, String name,double salary, Designations designation,
			InsuranceSchemes insuranceSchemes) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceSchemes = insuranceSchemes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + id;
		result = prime * result + ((insuranceSchemes == null) ? 0 : insuranceSchemes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation != other.designation)
			return false;
		if (id != other.id)
			return false;
		if (insuranceSchemes != other.insuranceSchemes)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Designations getDesignation() {
		return designation;
	}
	public void setDesignation(Designations designation) {
		this.designation = designation;
	}
	public InsuranceSchemes getInsuranceSchemes() {
		return insuranceSchemes;
	}
	public void setInsuranceSchemes(InsuranceSchemes insuranceSchemes) {
		this.insuranceSchemes = insuranceSchemes;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", designation=" + designation + ", insuranceSchemes="
				+ insuranceSchemes + "]";
	}
}
