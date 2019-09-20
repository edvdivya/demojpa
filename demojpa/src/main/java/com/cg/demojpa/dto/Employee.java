package com.cg.demojpa.dto;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="jpa_employee")

public class Employee {
	@Id
	@Column(name="emp_Id")
	private Integer empId;
	@Column(name="emp_Name")
	private String empName;
	@Column(name="emp_Sal")
	private Double empSalary;
	@Column(name="joining_date")
	private Date date_ofJoining;
	@Embedded
	private Address address;
	@OneToOne(cascade=CascadeType.ALL)
	private Project proj;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "deptId")
	private Department dept;
	
	
	public Employee(Integer empId, String empName, Double empSalary, Date date_ofJoining, Address address, Project proj,
			Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.date_ofJoining = date_ofJoining;
		this.address = address;
		this.proj = proj;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", date_ofJoining="
				+ date_ofJoining + ", address=" + address + ", proj=" + proj + ", dept=" + dept + "]";
	}


	public Employee() {
		
	}
	

	
	public Project getProj() {
		return proj;
	}


	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address addr) {
		this.address = addr;
	}


	public Department getDept() {
		return dept;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Date getDate_ofJoining() {
		return date_ofJoining;
	}


	public void setDate_ofJoining(Date date_ofJoining) {
		this.date_ofJoining = date_ofJoining;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}




	
}
