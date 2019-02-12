package com.cg.eis.beans;

import java.util.HashMap;

public class Employee {
	
		private long id;
		private String name;
		private long salary;
		private String designation;
		private String insuranceScheme;
		public HashMap<Integer,Employee> list=new HashMap<>();
		public HashMap<Integer, Employee> getList() {
			return list;
		}
		public void setList(HashMap<Integer, Employee> list) {
			this.list = list;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getInsuranceScheme() {
			return insuranceScheme;
		}
		public void setInsuranceScheme(String insuranceScheme) {
			this.insuranceScheme = insuranceScheme;
		}
		public Employee(String name,long id,long salary,String designation,String insuranceScheme)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.designation=designation;
			this.insuranceScheme=insuranceScheme;
		}
		public Employee() {}
		public Employee(String name, long id, long salary, String designation) {
			this.name=name;
			this.id=id;
			this.salary=salary;
			this.designation=designation;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
					+ ", designation=" + designation + ", insuranceScheme="
					+ insuranceScheme +"]";
		}
}
