package Calss19_ConstructorsConcept;

// eg- no one should create a create a object the below class , hence we can create the 

public class Testing {
	
	// We can create static methods in case of common utilities to be used in the framework
	
	// We use private constructor in case of singleton pattern
	// We cannot create a object of private constructor from another class
	// System() method has a default constructor.
	
	// interview question- which is inbuilt class in java having private constructor -> its System() class
	// all the methods are static in System class
	
	private Testing()
	{
		
		System.out.println("Testing");
	}
	
 public static void getInfo() {
	System.out.println("get Info");
 	
 }
	

}
