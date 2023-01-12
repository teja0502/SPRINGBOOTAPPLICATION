package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("comp1")
public class Company1 {
	@Value("${info.name}")
	private String name;
	@Value("${info.location}")
	private String location;
	@Value("${info.size}")
	private Integer size;
	@Value("${info.type}")
	private String type;
	@Override
	public String toString() {
		return "Company1 [name=" + name + ", location=" + location + ", size=" + size + ", type=" + type + "]";
	}

}
