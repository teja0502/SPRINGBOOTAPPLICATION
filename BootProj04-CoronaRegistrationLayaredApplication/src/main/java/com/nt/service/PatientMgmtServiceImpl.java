package com.nt.service;


import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPatientDAO;
import com.nt.model.Patient;
@Service("patientService")
public class PatientMgmtServiceImpl implements IPatientMgmtService {
	@Autowired
	private IPatientDAO patientDAO;

	@Override
	public String registerPatient(Patient patient) throws Exception {
		
		//calculate no of days in hospitalized.
		Integer days=0;
		Double totalAmt=0.0;
		Double discountAmt=0.0;
		//Days Calculation.
		Timestamp dayOfDischarging=null;
        try{
        	Timestamp d1=patient.getDateOfAdmiting();
        	 //get the current date
    		LocalDateTime ldt=LocalDateTime.now();
    		dayOfDischarging=Timestamp.valueOf(ldt);
        // Calculate time difference in milliseconds
        long difference_In_Time= dayOfDischarging.getTime() - d1.getTime();
        // Calculate time difference in days
        Long difference_In_Days= (difference_In_Time/ (1000 * 60 * 60 * 24));
       String diff_In_Days= difference_In_Days+"";
       days=Integer.parseInt(diff_In_Days);
        }
        catch (Exception e) {
			throw e;
		}
        //Calculate total amount.
        totalAmt=patient.getPreDayAmt()*days;
        //Calculate discount amount.
        if(totalAmt>100000 && totalAmt<199999)
     	   discountAmt=totalAmt*0.1;
        else if(totalAmt>200000 && totalAmt<299999)
     	   discountAmt=totalAmt*0.2;
        else if(totalAmt>300000 && totalAmt<399999)
     	   discountAmt=totalAmt*0.3;
        else if(totalAmt>400000)
      	   discountAmt=totalAmt*0.4;
        else
     	   discountAmt=0.0;
        //calculate total payable amount
        Double totalPayableAmt=totalAmt-discountAmt;
       
		//set the values to patient class obj.
       patient.setDateOfDischarging(dayOfDischarging);
		patient.setTotalAmt(totalAmt);
		patient.setDiscountAmt(discountAmt);
		patient.setTotalPayableAmt(totalPayableAmt);
		
		int count=patientDAO.insertPatient(patient);
		String result="Patient Name is::"+patient.getpName()+" Total No of days--->"+days+" Total Amount--->"+totalAmt+" Discount Amount --->"+discountAmt+" Total Payable Amount --->"+totalPayableAmt;
		
		return (count==0)?"Corona patient registraction is failed.":result;
	}

}
