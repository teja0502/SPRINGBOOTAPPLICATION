package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Patient;
import com.nt.service.IPatientMgmtService;
@Controller("coronaPatientController")
public class CoronaPatientRegistration {
	@Autowired
	private IPatientMgmtService patientService;
	
	public String registerPatientDetails(Patient patient) throws Exception{
		String result=patientService.registerPatient(patient);
		return result;
	}

}
