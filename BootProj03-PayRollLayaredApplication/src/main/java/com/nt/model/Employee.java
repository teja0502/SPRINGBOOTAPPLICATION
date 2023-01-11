package com.nt.model;

import lombok.Data;


@Data
public class Employee {
	
	public Integer eNo;
	public String eName;
	public String eJob;
	public Double basicSalary;
	public Double grossSalary;
	public Double netSalary;
	//Genarate Getters and Setters.
	public Integer geteNo() {
		return eNo;
	}
	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteJob() {
		return eJob;
	}
	public void seteJob(String eJob) {
		this.eJob = eJob;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}

}
