package com.nt.sbeans;

public class Company {

	private String name;
	private String location;
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
