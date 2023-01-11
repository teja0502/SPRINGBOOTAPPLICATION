package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;
import com.nt.sbeans.Company1;

@SpringBootApplication
public class BootProj07InjectionUsingConfigarationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx=  SpringApplication.run(BootProj07InjectionUsingConfigarationPropertiesAnnotationApplication.class, args);
		 Company comp1=ctx.getBean("comp",Company.class);
		 System.out.println(comp1);
		 System.out.println("---------------------------------------------");
		 Company1 comp2=ctx.getBean("comp1",Company1.class);
		 System.out.println(comp2);
		 System.out.println("System properties:::"+System.getProperties());
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
