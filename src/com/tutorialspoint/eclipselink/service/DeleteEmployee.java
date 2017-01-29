package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, 1201);

		em.remove(employee);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
