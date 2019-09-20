package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.*;

public class EmployeeMain {

	public static void main(String args[]) throws Exception {
		
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scr.nextInt();
		System.out.println("Enter name");
		String name=scr.next();
		System.out.println("Enter salary");
		double sal=scr.nextDouble();
		System.out.println("Enter date");
		String datejoining=scr.next();
		Employee emp=new Employee();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		emp.setDate_ofJoining(sdf.parse(datejoining));
		System.out.println("Enter city");
		String city=scr.next();
		System.out.println("Enter state");
		String state=scr.next();
		System.out.println("Enter pincode");
		Integer pin=scr.nextInt();
		System.out.println("Enter Project Id: ");
		Integer proj_id=scr.nextInt();
		System.out.println("Enter Project Name");
		String proj_name=scr.next();
		System.out.println("Enter project Cost");
		Double pcost=scr.nextDouble();
		System.out.println("Enter dept Id");
		Integer deptid=scr.nextInt();
		System.out.println("Enter dept name");
		String deptname=scr.next();
		Address addr=new Address();
		Project pro=new Project();
		Department dept=new Department();
		dept.setDeptId(deptid);
		dept.setDeptName(deptname);
		addr.setCity(city);
		addr.setState(state);
		addr.setPincode(pin);
		emp.setAddress(addr);
		pro.setProjId(proj_id);
		pro.setProjName(proj_name);
		pro.setProjCost(pcost);
		emp.setProj(pro);
		emp.setDept(dept);
		service.addEmployee(emp);
		//List<Employee> empList=service.findAll();
//		System.out.println("Enter the id to delete");
//		int remId=scr.nextInt();
		//service.removeEmployee(remId);
		System.out.println(service.findAll());
//		empList=service.findBetwSalary(1000.0, 11000.0);
//		for (Employee employee : empList) {
//			System.out.println(employee);
//		}
//	
	}
	
}
