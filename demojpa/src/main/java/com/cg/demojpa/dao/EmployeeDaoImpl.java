package com.cg.demojpa.dao;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.demojpa.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("demojpa");
	
	@Override
	@Transactional
	public Employee save(Employee emp) {
	
		EntityManager em=entityFactory.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		em.persist(emp);
//		em.persist(emp.getProj());
//		em.flush();
		tran.commit();
//		Transaction tran=em.getTransaction();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
//		List<Employee> empList=new ArrayList<Employee>();
//		empList.add(em.find(Employee.class, 1001));
		Query query = em.createQuery("From Employee");
		List<Employee> empList=query.getResultList();
		return empList;
	}
	

	@Override
	public void remove(Integer empId) {
		EntityManager em=entityFactory.createEntityManager();
		Employee empRemove=em.find(Employee.class, empId);
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		em.remove(empRemove);
		// TODO Auto-generated method stub
		tran.commit();
		
	}

	@Override
	public List<Employee> findBtwSalary(double min, double max) {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Query query = em.createQuery("From Employee where empSalary BETWEEN : First and : Second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Employee> empList=query.getResultList();
		return empList;
	}



	
}
