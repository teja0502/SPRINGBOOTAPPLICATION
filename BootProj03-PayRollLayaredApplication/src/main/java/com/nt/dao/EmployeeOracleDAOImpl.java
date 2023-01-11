package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empDAO-Oracle")
public class EmployeeOracleDAOImpl implements IEmployeeDAO {
	private static final String INSER_EMPLOYEE_QUERY="INSERT INTO EMPLOYEE_INFO VALUES(ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	@Override
	public int insertEmployee(Employee emp) throws Exception {
		System.out.println("Data Source is:::"+ds.getClass());
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSER_EMPLOYEE_QUERY)){
			
			//insert records in data base collecting from employee class obj.
			ps.setString(1, emp.geteName());
			ps.setString(2, emp.geteJob());
			ps.setDouble(3,emp.getBasicSalary());
			ps.setDouble(4, emp.getGrossSalary());
			ps.setDouble(5, emp.getNetSalary());
			//excute the query.
			count=ps.executeUpdate();
			
			
		}
		catch(SQLException se) {
			throw se;
		}
		catch (Exception e) {
			throw e;
		}
		
		return count;
	}

}
