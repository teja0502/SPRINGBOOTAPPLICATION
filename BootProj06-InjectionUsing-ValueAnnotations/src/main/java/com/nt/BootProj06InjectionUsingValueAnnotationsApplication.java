package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


import com.nt.sbeans.DiagnosticCenterCatalog;
import com.nt.sbeans.PatientDetails;

@SpringBootApplication
public class BootProj06InjectionUsingValueAnnotationsApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx=   SpringApplication.run(BootProj06InjectionUsingValueAnnotationsApplication.class, args);
		 
		 DiagnosticCenterCatalog center=ctx.getBean("center",DiagnosticCenterCatalog.class);
		 System.out.println(center);
		 System.out.println("---------------------------------------------");
		 PatientDetails ceneter=ctx.getBean("pInfo",PatientDetails.class);
		 System.out.println(ceneter);
		 ((ConfigurableApplicationContext) ctx).close();
	
	}

}
