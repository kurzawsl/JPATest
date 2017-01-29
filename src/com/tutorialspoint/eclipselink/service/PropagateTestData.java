package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class PropagateTestData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		Employee em3 = new Employee();
		Employee em4 = new Employee();
		Employee em5 = new Employee();
		Employee em6 = new Employee();
		
		   
		em1.setEid(1201);em1.setEname("Gopal");       em1.setSalary(40000);em1.setDeg("Technical Manager");
		em2.setEid(1202);em2.setEname("Manisha");     em2.setSalary(40000);em2.setDeg("Proof reader");
		em3.setEid(1203);em3.setEname("Masthanvali"); em3.setSalary(40000);em3.setDeg("Technical Writer");
		em4.setEid(1204);em4.setEname("Satish");      em4.setSalary(30000);em4.setDeg("Technical writer");
		em5.setEid(1205);em5.setEname("Krishna");     em5.setSalary(30000);em5.setDeg("Technical Writer");
		em6.setEid(1206);em6.setEname("Kiran");       em6.setSalary(35000);em6.setDeg("Proof reader");
		
		
		em.getTransaction().begin();
		em.persist(em1);
		em.persist(em2);
		em.persist(em3);
		em.persist(em4);
		em.persist(em5);
		em.persist(em6);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
