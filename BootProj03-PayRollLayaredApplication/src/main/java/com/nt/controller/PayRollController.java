package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.service.IEmployeeMgmtService;
@Controller("payRollController")
public class PayRollController {
	@Autowired
	private IEmployeeMgmtService empService;
	
	public String processEmployee(Employee emp) throws Exception{
		String result=empService.calculateSalary(emp);
		return result;
	}

}
