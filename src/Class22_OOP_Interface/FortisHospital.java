package Class22_OOP_Interface;

public class FortisHospital extends Medical implements USMedical ,UKMedical,IndianMedical {

	//int min_fee=50; // this not overriding 
	//US
	@Override
	public void physioService() {
		
		System.out.println("FH - physioService");
	}	

	@Override
	public void cardioService() {
		System.out.println("FH - cardioService");
	}

	@Override
	public void dentalService() {
		System.out.println("FH - dentalService");
	}

	//UK
	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH - pediaServices");
		
	}

	//India
	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
		
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
		
	}

	//common methods
	@Override
	public void emergencyService() {
		System.out.println("FH -- emergency service");
		
	}

	// individual methods of fortishospital
	
	public void medicalTraining() {
		
		System.out.println("FH -----Medical Training");
		
	}
	
public void medicalclaim() {
		
	System.out.println("FH -----Medical Claim");
	
}
	

@Override
public void covidVaccinationCamp() {	
	
	System.out.println("FH -----Medical covidvaccination");
	
}
		
// Same below method is in us medical interface 
//Hence its "Data hiding" not overriding 

public static void billing() {
	
	System.out.println("US Medical billing");
}

@Override
public void medicalTest() {
	
	System.out.println("US medical Test");
}
	
}
