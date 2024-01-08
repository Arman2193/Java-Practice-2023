package Practice;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int number =90;
		
		if(number>100) {
			
			System.out.println("calculating");
		
		
		}
		
		if(number >=90) {
			
			System.out.println("Grade A");
		}
	if (number==100) {
		
		System.out.println("got passed");
	}
	
	else {
		
		System.out.println("Plz pass the right marks");
	}
	
	System.out.println("----------------");
	
	// if ,else if
	
	String browser= "chrome";
	
	if(browser.equals("chrome")) {
		
		System.out.println("Launch chrome ");
	}
	
	else if(browser.equals("safari")) {
		
		System.out.println("Lanuch safari");
	}
	
	
	else {
		System.out.println("Please pass right name ");
		
	}
	}
}


