package com.nt;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.CustomerController;
import com.nt.model.Customer;

@SpringBootApplication
//@ImportResource("com/nt/cnfg/applicationContext.xml")
public class BootProj05CustomerShoppingLayaredApplication {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter customer name::::");
		String name=sc.nextLine();
		System.out.println("Enter Customer address::::");
		String addrs=sc.nextLine();
		System.out.println("Enter Item Details::::");
		String item=sc.nextLine();
		System.out.println("Enter total price::");
		Double price=sc.nextDouble();
		
		Customer cust= new Customer();
		cust.setcName(name);
		cust.setcAddrs(addrs);
		cust.setItems(item);
		cust.setPrice(price);
		
		
		ApplicationContext ctx=   SpringApplication.run(BootProj05CustomerShoppingLayaredApplication.class, args);
		
		CustomerController controller=ctx.getBean("custController",CustomerController.class);
		try {
		String result= controller.processCustomer(cust);
		System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("Internal Problem--Try again!!!"+e.getMessage());
			e.printStackTrace();
		}
		sc.close();
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
