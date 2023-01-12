package com.nt.model;

import java.sql.Timestamp;

public class Customer {
	
	private Integer cID;
	private String cName;
	private String cAddrs;
	private Timestamp cShoppingTime;
	private String items;
	private Double price;
	private Double discount;
	private Double payableAmt;
	//genarate getters and setters.
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddrs() {
		return cAddrs;
	}
	public void setcAddrs(String cAddrs) {
		this.cAddrs = cAddrs;
	}
	public Timestamp getcShoppingTime() {
		return cShoppingTime;
	}
	public void setcShoppingTime(Timestamp cShoppingTime) {
		this.cShoppingTime = cShoppingTime;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getPayableAmt() {
		return payableAmt;
	}
	public void setPayableAmt(Double payableAmt) {
		this.payableAmt = payableAmt;
	}
	

}
