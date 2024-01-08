package Class22_OOP_Interface;

public interface USMedical extends WHO {

	
	// in an interface a variable is static and final in nature by default
	// so we need to call it with interface name(us.min_fee)
	// We cannot change the value of the variable
	// Interface is abstract in nature
	
	int min_fee=10;
	boolean isapproved=true;
	
	

	// Interface cannot have a method body  
	// Only method declaration /method prototype /no business logic is there
	// Methods in interface are just declared, no logic is to be there
	// and these methods are called abstract methods
	// cannot create an object of interface
	// cannot create the constructor 
	// One-Interface cannot have a parent class.
	// We can have multiple interface and one parent of all those interfaces 
	
	//Abstraction -we cannot see the actual implementation of the method in the interface
	// the actual implementation is in the class
	// below methods are called as abstract methods(do not have body) and feature is abstraction
	
	
	//* after jdk1.8
	// 1.we can have static method with body(static method are allowed)
	// 2. that means we cannot have static abstract method
	
	
	public static void billing() {
		
		System.out.println("US Medical billing");
	}
	
	// 3. We can have default method as well with method body
	//		We can override the default method -but need to remove default from the class
	//		we can only keep default keyword in interface as below
	// 		We cannot make default with static
	//		
	
	default void medicalTest() {
		
		System.out.println("US medical Test");
	}
	
	
	
	
	// Below are the abstract method
	// So we can say Interface follows 100% abstraction- OOP - unlike abstract class where theres combination 
	// of abstract and normal methods 
	
	public void physioService();

	public void cardioService();

	public void dentalService();
	
	public void emergencyService();
	
	
	
	// Interface are more better -100% abstraction
	// when we are designing a different systems ie - webdriver(interface) , chromedriver (class)
	// when we need to design a whole web page we need to use abstract class.
	
	// Interface -we use it when we dont have any idea about the business logic, or how to decide the business logic
	// Abstract class- we can use when we know the business logic -or any common utilities we need to define for 
	//	common pages.

}
