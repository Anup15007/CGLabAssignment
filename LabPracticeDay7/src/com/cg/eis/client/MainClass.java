package com.cg.eis.client;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.eis.beans.Employee;
import com.cg.eis.services.EmployeeService;
import com.cg.eis.services.InsuranceServiceDemo;

public class MainClass 
{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		InsuranceServiceDemo services = new InsuranceServiceDemo();
		Employee employ1 = new Employee("Prajjval",101,45000,"manager",services.findScheme(45000,"manager"));
		Employee employ2 = new Employee("Girish",102,25000,"programmer",services.findScheme(25000,"programmer"));
		Employee employ3 = new Employee("Dhingra",103,21000,"programmer",services.findScheme(21000,"programmer"));
		employ1.list.put(101,employ1);
		employ2.list.put(102, employ2);
		employ3.list.put(103, employ3);
		System.out.println("Enter the Name : ");
		String name = sc.next();
		System.out.println("Enter the Id of employee : ");
		Integer id =sc.nextInt();
		System.out.println("Enter the salary of Employee : ");
		long salary = sc.nextLong();
		System.out.println("Enter the Designation of Employee : ");
		String designation = sc.next();
		String scheme = services.findScheme(salary,designation);
		Employee employee = new Employee(name,id,salary,designation,scheme);
		employee.list.put(id, employee);
		System.out.println("**********Employ added successfully**********");
		System.out.println(employee);
		employee.list.remove(101);
		System.out.println("Employee is removed now");
	}

}
