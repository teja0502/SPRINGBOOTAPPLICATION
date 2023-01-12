package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Patient;
@Repository("patientDAO")
public class PatientDAOImpl implements IPatientDAO {
	
	private static final String INSERT_CORONA_QUERY="INSERT INTO CORONA_INFO VALUES(PID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;

	@Override
	public int insertPatient(Patient patient) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_CORONA_QUERY)){
			
			//insert data.
			ps.setString(1, patient.getpName());
			ps.setString(2, patient.getpAddrs());
			ps.setLong(3, patient.getpMobileNumber());
			ps.setTimestamp(4, patient.getDateOfAdmiting());
			ps.setTimestamp(5, patient.getDateOfDischarging());
			ps.setDouble(6, patient.getPreDayAmt());
			ps.setDouble(7, patient.getTotalAmt());
			ps.setDouble(8, patient.getDiscountAmt());
			ps.setDouble(9, patient.getTotalPayableAmt());
			
			//excute query.
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
