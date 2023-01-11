package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;
@Repository("custDAO-oracle")
public class CustomerOracleDAOImpl implements ICustomerDAO {
	
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMER_INFO VALUES(CID_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
	
//	@Autowired
//	private DataSource ds;

	@Override
	public int insertCustomer(Customer cust) throws Exception {
		int count=0;
		
		try(Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1524:xe","system","tiger");
				PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY)){
			
			ps.setString(1, cust.getcName());
			ps.setString(2, cust.getcAddrs());
			ps.setTimestamp(3, cust.getcShoppingTime());
			ps.setString(4, cust.getItems());
			ps.setDouble(5, cust.getPrice());
			ps.setDouble(6, cust.getDiscount());
			ps.setDouble(7, cust.getPayableAmt());
			
			count=ps.executeUpdate();
			
		}
		catch (SQLException se) {
			throw se;
			
		}
		catch (Exception e) {
			throw e;
		}
	
		return count;
	}

}
