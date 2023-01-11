package com.nt;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.PayRollController;
import com.nt.model.Employee;

@SpringBootApplication
@ImportResource("com/nt/cnfg/applicationContext.xml")
public class BootProj03PayRollLayaredApplication {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name:::");
		String name=sc.nextLine();
		System.out.println("Enter Employee Job:::");
		String job=sc.nextLine();
		System.out.println("Enter Employee Basic Salary:::");
		Double basicSalary=sc.nextDouble();
		//Create employee class obj.
		Employee emp = new Employee();
		//set the records into employee class obj.
		emp.seteName(name); emp.seteJob(job); emp.setBasicSalary(basicSalary);
		//Create IOC container.
		 ApplicationContext ctx=  SpringApplication.run(BootProj03PayRollLayaredApplication.class, args);
		 PayRollController controller=ctx.getBean("payRollController",PayRollController.class);
		 try {
			 String result=controller.processEmployee(emp);
			 System.out.println(result);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
			 System.out.println("Internal problem--> Try again!!!!"+e.getMessage());
		}
		 sc.close();
		 ((ConfigurableApplicationContext) ctx).close();
		 
	}

}
