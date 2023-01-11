package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngg")
//@Primary
public class DesielEngine implements Engine {

	public DesielEngine() {
		System.out.println("DesielEngine:: 0-param contructor.");
	}
	@Override
	public void start() {
		System.out.println("DesielEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("DesielEngine.stop()");
	}

}
