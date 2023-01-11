package com.nt.model;

import java.sql.Timestamp;

public class Patient {
	private Integer pID;
	private String pName;
	private String pAddrs;
	private Long pMobileNumber;
	private Timestamp dateOfAdmiting;
	private Timestamp dateOfDischarging;
	private Double preDayAmt;
	private Double totalAmt;
	private Double discountAmt;
	private Double totalPayableAmt;
	//Genarate getters and setters.
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
	public Timestamp getDateOfAdmiting() {
		return dateOfAdmiting;
	}
	public void setDateOfAdmiting(Timestamp dateOfAdmiting) {
		this.dateOfAdmiting = dateOfAdmiting;
	}
	public Timestamp getDateOfDischarging() {
		return dateOfDischarging;
	}
	public void setDateOfDischarging(Timestamp dateOfDischarging) {
		this.dateOfDischarging = dateOfDischarging;
	}
	public Double getPreDayAmt() {
		return preDayAmt;
	}
	public void setPreDayAmt(Double preDayAmt) {
		this.preDayAmt = preDayAmt;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Double getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(Double discountAmt) {
		this.discountAmt = discountAmt;
	}
	public Double getTotalPayableAmt() {
		return totalPayableAmt;
	}
	public void setTotalPayableAmt(Double totalPayableAmt) {
		this.totalPayableAmt = totalPayableAmt;
	}
	
}
