package com.qa.hospitaltest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.Hospital.Doctor;
import com.qa.Hospital.Patient;



public class HospitalTest {

	@Test
	
	public void checkTreatment() {
	
	Patient patient2 = new Patient("Ian", "paracetamol", 4);
	
	assertEquals("error is here", "paracetamol", patient2.getMedicine() );
	
	}
	
	@Test
	
	public void recordTreatment() {
//	
//		
//	Patient patient2 = new Patient("Ian", "paracetamol", 4);
	Patient patient2 = new Patient("Ian", "paracetamol", 4);
	patient2.set(int 5, );

//	
//	
	assertEquals("error is here", "paracetamol", patient2.getMedicine() );
//	
}
	
	
	@Test
	
	public void admitPatients() {
		
		Hospital hospital = new Hospital();
		Patient p = new Patient();
		p.setLocation("Ward 5");
		hospital.admitPatient(p);
		assertEquals("error", "Ward 5", p.get(Location));
		

		
	}
	
	}
	
