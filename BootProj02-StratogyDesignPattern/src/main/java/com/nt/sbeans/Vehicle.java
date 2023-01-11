package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("motor")
	private Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle:: 0 -param constructor");
	}
	
	public void startTravel(String startDestination,String endDestination) {
		
		System.out.println("Jurney started from "+startDestination);
		engine.start();
		System.out.println("Jurney going.........................");
		engine.stop();
		System.out.println("Jurney Stoped at "+endDestination);
		
	}

}
