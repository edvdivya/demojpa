package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dao.*;
import com.cg.demojpa.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void removeEmployee(Integer empId) {
		// TODO Auto-generated method stub
		dao.remove(empId);
	}

	@Override
	public List<Employee> findBetwSalary(double min, double max) {
		// TODO Auto-generated method stub
		return dao.findBtwSalary(min,max);
	}

	
}
