package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eEngg")
@Primary
public class EletricEngine implements Engine {

	public EletricEngine() {
		System.out.println("EletricEngine:: 0-param contructor.");
	}
	@Override
	public void start() {
		System.out.println("EletricEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("EletricEngine.stop()");
	}

}
