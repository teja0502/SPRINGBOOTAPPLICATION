package com.nt;


import java.sql.Timestamp;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.CoronaPatientRegistration;
import com.nt.model.Patient;

@SpringBootApplication
public class BootProj04CoronaRegistrationLayaredApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Patient Name:::");
		String name=sc.nextLine();
		System.out.println("Enter Patient Address:::");
		String addrs=sc.nextLine();
		System.out.println("Enter Patient Mobile Number::");
		Long mobileNumber=sc.nextLong();
		System.out.println("Enter of Admitting (yyyy-MM-dd hh:mm:ss)::");
		sc.nextLine();
		String doj=sc.nextLine();
		
		System.out.println("Enter Per day amount::");
		Double perDayAmt=sc.nextDouble();
		Timestamp dateOfAdmitting=Timestamp.valueOf(doj);

		//Create Patient class obj.
		Patient patient = new Patient();
		//set the values.
		patient.setpName(name);
		patient.setpAddrs(addrs);
		patient.setpMobileNumber(mobileNumber);
		patient.setDateOfAdmiting(dateOfAdmitting);
		
		patient.setPreDayAmt(perDayAmt);
		
		ApplicationContext ctx=  SpringApplication.run(BootProj04CoronaRegistrationLayaredApplication.class, args);
		
		CoronaPatientRegistration controller=ctx.getBean("coronaPatientController",CoronaPatientRegistration.class);
		
		try {
			String result=controller.registerPatientDetails(patient);
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("Internal Problem - Try again!!!"+e.getMessage());
			e.printStackTrace();
		}
		sc.close();
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
