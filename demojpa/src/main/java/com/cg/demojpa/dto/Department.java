package com.cg.demojpa.dto;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="jpa_department")
public class Department {

	@Id
	private Integer deptId;
	@Column(name="dept_name")
	private String deptName;
	@OneToMany
	@JoinColumn(name = "emp_Id")
	private List<Employee> empList;
	public Department(Integer deptId, String deptName, List<Employee> empList) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.empList = empList;
	}
	public Department () {
		
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", empList=" + empList + "]";
	}

	
}
