package Class17;

public class Browsers {

	//Note -Java is more faster than python because of the compiler
	
	String name="Arman";
	static String hq= "Banglore";
	
	public int getBrowserVersion() {
		
		System.out.println("get browser version ");
		return 100;
	}
	
	public static String getBrowserVendor() {
		
		System.out.println("get Browser vendor");
		return "Mozilla";
	}
	
	// Main method
	//is entry method
	//runner method
	

	public static void main(String[] args) {
		
		Browsers obj= new Browsers();
		System.out.println(obj.name);
		System.out.println(hq); // We can access static variables directly with variable name
		System.out.println(Browsers.hq);// Using class name as well
		
		
		obj.getBrowserVersion();
		
		getBrowserVendor();// We can access static methods with the name directly
		
		Browsers.getBrowserVendor();// We can access using class name also.
		
		obj.name="Arman";
		obj.hq="Pune";
		obj.getBrowserVendor();
		
		//Object cannot hold static properties (var , method)
		//Static will be stored in CMA - Permanent generation - Metaspace
		// Object can call or access static properties but with a warning
		//But we should always call static with the class name
		// if we create 10 objects - static copies created =1
		// if we create 10 objects - non static copies created =10
		
		// Permanent Generation(JDK1.7) VS Metaspace(came in JDK1.8)
		//
		
		System.out.println("-------------------");
		System.out.println(obj.name);
		System.out.println(obj.getBrowserVersion());
		System.out.println(hq);
		System.out.println(getBrowserVendor());
		
		
		
		
		
		
		
		
		  
		
		
		
		
	}
	
	
	
}
