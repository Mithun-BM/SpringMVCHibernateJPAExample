package com.example.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EmployeeDAO;
import com.example.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO
{
	//Using HibernateJPA Implementation
	@PersistenceContext(unitName="SpringMVCHibernateJPAdb")	
	private EntityManager em;	

	@Transactional
	public boolean addEmployee(Employee employee) {
		boolean isAdded = false;
		try{
			em.persist(employee);
			isAdded = true;
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return isAdded;
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		List<Employee> empList = null;
		try{
			/*Query q = em.createNamedQuery("findAllEmployees");//Named Query
			empList = q.getResultList();*/
			//OR
			Query q1 = em.createQuery("select e from Employee e");//Simple Query
			empList = q1.getResultList();
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}

		return empList;
	}

	@Transactional
	public boolean deleteEmployee(Integer employeeId) {
		boolean isSuccess = false;
		try{
			if(em.find(Employee.class,employeeId) != null){
				em.remove(em.find(Employee.class,employeeId));
				isSuccess = true;
			}
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return isSuccess;
	}

	@Transactional
	public Employee getEmployee(Integer id) {
		Employee emp = null;
		try{
			emp = em.find(Employee.class,id);
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return emp;
	}
}