package com.nkxgen.spring.orm.dao;


import java.util.List;
import  com.nkxgen.spring.orm.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class EmpDAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(Employee emp) {
		em.persist(emp);
	}

	public List<Employee> getAllEmployees() {
		return em.createQuery("SELECT e FROM Employee e").getResultList();
	}

}
