package com.cg.lambdaexp.client;
import com.cg.lambdaexp.services.EmployeeService;
public class MainClass {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		System.out.println("Total Salary : "+service.totalSal());
		System.out.println("************************************************************************************");
		System.out.println("Department info :");
		service.departmentInfo();
		System.out.println("************************************************************************************");
		System.out.println("Employees w/o department : ");
		service.empWithoutDep();
		System.out.println("************************************************************************************");
		System.out.println("Department w/o employees : ");
		service.depWithoutEmp();
		System.out.println("************************************************************************************");
		System.out.println("Department with highest no. of employees");
		service.highestEmpDep();
		System.out.println("************************************************************************************");
	}
}
