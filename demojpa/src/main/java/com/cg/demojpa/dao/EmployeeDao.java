package com.cg.demojpa.dao;
import java.util.List;

import com.cg.demojpa.dto.*;
public interface EmployeeDao {

	public Employee save(Employee emp);
	public List<Employee> findAll();
	public void remove(Integer empId);
	List<Employee> findBtwSalary(double min, double max);
		
}
