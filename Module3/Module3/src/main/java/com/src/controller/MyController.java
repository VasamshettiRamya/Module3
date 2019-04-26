package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.src.model.TdsMaster;
import com.src.service.EmployeeService;
import com.src.utility.IDNotFoundException;


@RestController    
public class MyController {

	
	@Autowired   
	EmployeeService employeeservice;
	
	@GetMapping("/getById")    
	public TdsMaster getByPid(@RequestBody int id) throws IDNotFoundException {
		
		TdsMaster t = employeeservice.getById(id);
		if(t==null) {
			throw new IDNotFoundException("ID not found Wrong ID:  "+id);
		}
		else
			return t;
		
	}

	
	
}
