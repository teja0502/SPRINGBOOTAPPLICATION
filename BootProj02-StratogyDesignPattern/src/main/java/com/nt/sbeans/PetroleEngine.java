package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pEngg")
//@Primary
public class PetroleEngine implements Engine {

	public PetroleEngine() {
		System.out.println("PetroleEngine:: 0-param contructor.");
	}
	@Override
	public void start() {
		System.out.println("PetroleEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetroleEngine.stop()");
	}

}
