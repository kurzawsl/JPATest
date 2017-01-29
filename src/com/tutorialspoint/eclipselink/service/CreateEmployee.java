package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {
	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
			
		
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		
		em.persist(employee);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
