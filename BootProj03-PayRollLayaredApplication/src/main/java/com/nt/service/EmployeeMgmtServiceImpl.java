package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	@Qualifier("finalDAO")
	private IEmployeeDAO empDAO;

	@Override
	public String calculateSalary(Employee emp) throws Exception {
		//Calculate Gross salary and net salary
		Double grossSalary=emp.getBasicSalary()+(emp.getBasicSalary()*0.4f);
		Double netSalary=grossSalary-(grossSalary*0.2f);
		
		//set gross salary and net salary in employee obj.
		emp.setGrossSalary(grossSalary);
		emp.setNetSalary(netSalary);
		
		int count=empDAO.insertEmployee(emp);
		String result="Employee registed:::Basic Salary---->"+emp.getBasicSalary()+" Gross salary----->"+grossSalary+"Net Salary----->"+netSalary;
		//return the value
		return (count==0)?"Employee is not registed":result;
	}

}
