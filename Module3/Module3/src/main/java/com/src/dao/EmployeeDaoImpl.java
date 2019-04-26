package com.src.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.src.model.TdsMaster;


@Component("employeeDao")
@Repository
@ComponentScan("com.src")
public class EmployeeDaoImpl implements EmployeeDao {

	
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		TdsMaster td = entityManager.find(TdsMaster.class, id);
		return td;
	}

}

	
	
	
	
