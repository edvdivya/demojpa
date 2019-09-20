package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	public List<Employee> findAll();
	public void removeEmployee(Integer empId);
	public List<Employee> findBetwSalary(double min,double max);
}
