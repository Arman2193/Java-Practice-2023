package Class21_OOP_Inheritance;

public class Car extends Vehicle{
	
	//*Final Keyword
	
	// Final keyword is used to prevent inheritance
	// Final keyword is used to prevent method overriding 
	// If a method made Final -we cannot override it
	// if a class is declared as Final -it cannot be a parent class
	// Final keyword is used for constant values
	
	
	public final void service() {
		
		System.out.println("Car ...service");
			
		}
	
public void start() {
		
	System.out.println("Car ...start");
		
	}
public void stop() {
	
	System.out.println("Car ...stop");
}

public void refuel() {
	
	System.out.println("Car ...refuel");
}

@Override
public void petrolengine() {
	
	System.out.println(" Car Petrol -Engine");
	
}


// Can we override static method-> No  we cannot do it
// Can we overload static method-> Yes we can
// Private methods cannot be overridden 
	
// Note - private ,static , final cannot be overridden 


public static void billing() {
	
	System.out.println("Car--billing");
}



}
