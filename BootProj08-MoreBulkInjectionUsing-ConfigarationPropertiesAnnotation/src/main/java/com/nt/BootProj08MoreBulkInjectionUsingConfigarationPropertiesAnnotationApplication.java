package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;
import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj08MoreBulkInjectionUsingConfigarationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx=  SpringApplication.run(BootProj08MoreBulkInjectionUsingConfigarationPropertiesAnnotationApplication.class, args);
		 //Company comp1=ctx.getBean("comp",Company.class);
		 Employee emp=ctx.getBean("emp",Employee.class);
		 System.out.println(emp);
		 
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
