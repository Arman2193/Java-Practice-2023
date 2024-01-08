package Class21_OOP_Inheritance;

// So we need to mention "extends" keyword to show the relation between Car and BMW class
//IS -A Relationship

//Always 
public class BMW extends Car {

	// Method overriding -When you have a method in parent class and same method in
	// child class.
	// with the same name
	// with the same number of parameters
	// with the sequence of parameters
	// with the exact same return

	// Purpose of method overriding (use case)- So it gives the flexibility to the
	// child class
	// to override ,any parent class method
	// Purpose of inheritance (use case)- Re usability of the methods from the
	// parent class
	// which common for both the child and parent class

	// Method overriding - Its also called poly + morphism(Dynamic). when the same
	// method is available in
	// parent class and child class ( same name many forms)

	// Its a Run time polymorphism - At the time of execution , compiler will not be
	// able to decide
	// which start() method to execute during compile time .Hence at the run time
	// the preference
	// is given to child class start() method at the run time

	// its a good practice to write @Override annotation on the over ridden method

	@Override // Over ridden from parent class(Car) -
	public void start() {
		System.out.println("BMW ...start");

	}

	@Override // Over ridden from grand parent class(Vehicle)
				// in case both vehicle and car have petrolengine methods ,it will be Over
				// ridden from parent class(car)
	public void petrolengine() {

		System.out.println(" BMW-Petrol -Engine");

	}

	public void autoParking() {
		System.out.println(" autoParking ");
	}

	public void theftSafety() {

		System.out.println("Audi -theftsafety");

	}

	// If a method made Final -we cannot override it
	// public final void service() {

	// System.out.println("Car ...service");

	// }

	// Method Hiding - When you have a static method in parent class and the same
	// method in child class
	// its not overriding ,static method cannot be overridden

	public static void billing() {

		System.out.println("BMW--billing");
	}

}
