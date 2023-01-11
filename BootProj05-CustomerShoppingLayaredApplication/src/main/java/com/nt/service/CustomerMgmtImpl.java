package com.nt.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;
@Service("custService")
public class CustomerMgmtImpl implements ICustomerMgmtService {
	@Autowired
	private ICustomerDAO custDAO;
	@Override
	public String registerCustomer(Customer cust) throws Exception {
		
		//calcuate discount
		Double amount=cust.getPrice();
		Double discount=0.0;
		Double payableAmt=0.0;
		Timestamp shoppingTime=null;
		try{
			LocalDateTime ldt=LocalDateTime.now();
			shoppingTime=Timestamp.valueOf(ldt);
		if(amount>1 && amount<20000)
			discount=amount*0.1;
		else if(amount>20001 && amount<30000)
			discount=amount*0.2;
		else
			discount=amount*0.3;
		
		payableAmt=amount-discount;
		}
		catch (Exception e) {
			throw e;
		}
		cust.setcShoppingTime(shoppingTime);
		cust.setDiscount(discount);
		cust.setPayableAmt(payableAmt);
		int count=custDAO.insertCustomer(cust);
		String result="Total price---->"+amount+" Discount amount--->"+discount+" Payable Amount--->"+payableAmt;
		
		return (count==0)?"Customer is not registered.":result;
	}

}
