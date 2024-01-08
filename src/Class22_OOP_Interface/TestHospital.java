package Class22_OOP_Interface;

public class TestHospital {
public static void main(String[] args) {
	
	FortisHospital fh =new FortisHospital();
	
	fh.cardioService();
	fh.dentalService();
	fh.emergencyService();
	fh.medicalclaim();
	fh.neuroServices();
	fh.medicalTraining();
	fh.oncologyServices();
	fh.orthoServices();
	fh.medicalRD();
	fh.medicalTest(); // we can call default method from us medical interface
	
	System.out.println(USMedical.min_fee);
	System.out.println(fh.min_fee);
	System.out.println(FortisHospital.min_fee);
	
	System.out.println(USMedical.isapproved);
	
	

	//Top casting- child class object can be referred by parent interface reference variable
	// if referring to USMedical interface reference - those methods will only be called
	//else it will give typecast error
	
	USMedical us = new FortisHospital();
	us.physioService();
	us.dentalService();
	us.cardioService();
	us.emergencyService();
	
	us.medicalTest(); // with top casting as well we can call default method
	
	WHO wh= new FortisHospital();
	wh.covidVaccinationCamp();
	
	// Down casting :N/A 

// calling static method -using the class name as below
	USMedical .billing();
	FortisHospital.billing();
	
	
}
	
}
