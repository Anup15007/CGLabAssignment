package com.cg.lambdaexp.util;
import java.time.LocalDate;
import java.util.HashMap;
import com.cg.lambdaexp.beans.Department;
import com.cg.lambdaexp.beans.Employee;
public class EmployeeDBUtil {
	public static HashMap<Integer, Employee> employees = new HashMap<>();
	public EmployeeDBUtil() {
		EmployeeDBUtil.employees.put(101, new Employee(101, 901, "Suresh", "L", "suresh@gmail.com", "9875423525","Developer", LocalDate.of(2017, 11, 6), 20000, new Department(900, 901, "DFS")));
		EmployeeDBUtil.employees.put(102, new Employee(102, 901, "Ramesh", "H", "ramesh@gmail.com", "9034520001","Developer", LocalDate.of(2017, 10, 9), 20000, new Department(900, 901, "DFS")));
		EmployeeDBUtil.employees.put(103, new Employee(103, 901, "Rakesh", "K", "rakesh@gmail.com", "9875430025","Developer", LocalDate.of(2017, 12, 9), 20000, new Department(900, 901, "DFS")));
		EmployeeDBUtil.employees.put(201, new Employee(201, 801, "Mahesh", "C", "mahesh@gmail.com", "989200005","Senior", LocalDate.of(2017, 5, 8), 15000, new Department(800, 801, "UTD")));
		EmployeeDBUtil.employees.put(501, new Employee(501, 0, "Rajesh", "T", "rajesh@gmail.com", "9032350021","Tester", LocalDate.of(2017, 3, 1), 20000, new Department(0, 0, "")));
		EmployeeDBUtil.employees.put(503, new Employee(503, 0, "Dinesh", "P", "dinesh@gmail.com", "9875498021","Developer", LocalDate.of(2017, 2, 17), 20000, new Department(0, 0, "")));
		EmployeeDBUtil.employees.put(504, new Employee(504, 0, "Sukesh", "D", "sukesh@gmail.com", "989200025","Senior", LocalDate.of(2017, 5, 8), 15000, new Department(0, 0, "")));
		EmployeeDBUtil.employees.put(1, new Employee(0, 901, "", "", "", "","", LocalDate.of(1,1,1), 0, new Department(900, 901, "DFS")));
		EmployeeDBUtil.employees.put(2, new Employee(0, 901, "", "", "", "","", LocalDate.of(1, 1, 1), 0, new Department(900, 901, "DFS")));
		EmployeeDBUtil.employees.put(3, new Employee(0, 801, "", "", "", "","", LocalDate.of(1, 1, 1), 0, new Department(800, 801, "UTD")));
	}
	public static HashMap<Integer, Employee> getEmployees() {
		return employees;
	}
	public static void setEmployees(HashMap<Integer, Employee> employees) {
		EmployeeDBUtil.employees = employees;
	}
}