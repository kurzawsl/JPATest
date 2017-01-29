package com.tutorialspoint.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("Select UPPER(e.ename) from Employee e");
		
		List<String> result = query.getResultList();
		
		result.forEach(System.out::println);
		
		query = em.createQuery("select MAX(e.salary) from Employee e");
		Double highesSalary = (Double)query.getSingleResult();
		
		System.out.println("Max salary:" + highesSalary);
		
		query = em.createQuery("Select e from Employee e where e.ename like 'M%'");
		
		query.getResultList().forEach(System.out::println);
		
		em.close();
		emf.close();
	}

}
