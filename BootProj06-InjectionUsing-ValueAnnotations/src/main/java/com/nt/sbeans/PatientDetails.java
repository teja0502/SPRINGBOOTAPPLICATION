package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PatientDetails {
	@Value("1000")
	private Integer pID;
	@Value("${pi.name}")
	private String pName;
	@Value("${pi.addrs}")
	private String pAddrs;
	@Value("${pi.mobileNo}")
	private Long pMobileNumber;
	@Value("#{center.xrayPrice + center.ctscanPrice }")
	private Double totalAmt;
	@Value("#{center.ecgPrice==0}")
	private Boolean ecgfree;
	@Value("${os.name}")
	private String osName;
	@Value("${Path}")
	private String Path;
	public Integer getpID() {
		return pID;
	}
	public void setpID(Integer pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddrs() {
		return pAddrs;
	}
	public void setpAddrs(String pAddrs) {
		this.pAddrs = pAddrs;
	}
	public Long getpMobileNumber() {
		return pMobileNumber;
	}
	public void setpMobileNumber(Long pMobileNumber) {
		this.pMobileNumber = pMobileNumber;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Boolean getEcgfree() {
		return ecgfree;
	}
	public void setEcgfree(Boolean ecgfree) {
		this.ecgfree = ecgfree;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	@Override
	public String toString() {
		return "PatientDetails [pID=" + pID + ", pName=" + pName + ", pAddrs=" + pAddrs + ", pMobileNumber="
				+ pMobileNumber + ", totalAmt=" + totalAmt + ", ecgfree=" + ecgfree + ", osName=" + osName + ", Path="
				+ Path + "]";
	}
	
	

}
