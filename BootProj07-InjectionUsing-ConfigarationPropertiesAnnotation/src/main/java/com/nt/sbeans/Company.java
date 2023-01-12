package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "org.info")
@Component("comp")

public class Company {

	private String name;
	private String location;
	@Value("${info.size}")
	private Integer size;
	private String type;

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + ", type=" + type + "]";
	}

}
