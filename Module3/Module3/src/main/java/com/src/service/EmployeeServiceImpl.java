package com.src.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.src.dao.EmployeeDao;
import com.src.model.TdsMaster;


@Component("employeeService")
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getById(id);
	}

}
