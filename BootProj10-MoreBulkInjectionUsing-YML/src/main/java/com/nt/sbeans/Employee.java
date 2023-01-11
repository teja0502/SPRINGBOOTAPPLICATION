package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "emp.info")
//@PropertySource("application.properties")
@Component("emp")
public class Employee {

	private Integer empNo;
	private String empName;
	// array type
	private String[] favColors;
	// list type
	private List<String> nickNames;
	// set type
	private Set<Long> phoneNumbers;
	// map type
	private Map<String, Object> idDetails;
	// HAS-A property
	private Company company;

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}

	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	// toString()
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", favColors=" + Arrays.toString(favColors)
				+ ", nickNames=" + nickNames + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails
				+ ", company=" + company + "]";
	}

}
