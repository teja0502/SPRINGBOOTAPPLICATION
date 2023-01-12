package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cnfg/applicationContext.xml")
public class BootProj02StratogyDesignPatternApplication {

	public static void main(String[] args) {
		//Create IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj02StratogyDesignPatternApplication.class, args);

		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		vehicle.startTravel("Ramanaidu Palli", "Chennai");
		//close IOC container
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
