package com.jsp.ems.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ems.model.Department;
import com.jsp.ems.model.Employee;
import com.jsp.ems.model.Project;

public class Controller {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

	
	// Inserting Employee Department Projects
		public boolean AddEmployee(Employee employee) {
			if(employee != null) {
				entityTransaction.begin();
				entityManager.persist(employee);
				entityTransaction.commit();
				
				return true;
			}
			return false;
		}
		
		// Inserting Department 
		public boolean AddDepartment(Department department) {
			if(department != null)
			{
				entityTransaction.begin();
				entityManager.persist(department);
				entityTransaction.commit();
				return true;
			}
			return false;
		}
		
		// Inserting Projects
		
		public boolean Addproject(Project project) {
			if(project != null) {
				entityTransaction.begin();
				entityManager.persist(project);
				entityTransaction.commit();
				
				return true;
			}
			return false;
		}
		
		
		//Find Employee
		
	public Employee findemployee(int id) {
		return entityManager.find(Employee.class, id);
	}

	public Department finddepartment(int id) {
		return entityManager.find(Department.class, id);
	}
	
	public Project findproject(int id) {
		return entityManager.find(Project.class, id);
	}
	
	
	
	
}
