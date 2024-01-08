package Class21_OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Car c2= new Car();
		c2.petrolengine();
		
		BMW b = new BMW();
		b.start(); 	// Its a Overridden method (Runtime Polymorphism)
		b.stop();	// Its a inherited method
		b.refuel();	// Its a inherited method
		b.autoParking(); // Its a individual method
		
		b.engine();// Its a inherited method -we can inherit grandparent class - methods from grand child class
		
		
		b.petrolengine();// Its a individual method / /Its a Overridden method(in case vehicle and car have petrolengine methods)
		
		
		BMW.billing();
		Car.billing();
		// in case both vehicle and car have petrolengine methods , preference will be given
		// to parent class method(Car) , and not grandparent(Vehicle) class method
		
		// siblings( BMW - audi) cannot inherit or override. they can have their individual method with the same name
		b.theftSafety();
		
		
		System.out.println("---------------");
		
		// Creating  method of parent class(Car)
		// Child class can take any property of parent , but parent cannot take from the child class
		// Hence we cannot call autoparking() method with parent method(Car) object reference(c)
		
		Car c= new Car();
		c.start(); 	// Its a individual method
		c.stop();	// Its a individual method
		c.refuel();	// Its a individual method
		c.engine(); // Its a inherited method -we can inherit grandparent class - methods from grand child class
		c.petrolengine();//Its a Overridden method (Runtime Polymorphism)
		
		
		
	
		// Can we give parent class reference to child class object - Yes
		// Child class object can be referred by parent class reference variable
		// the above concept is Called as "Top Casting" in Java.
		// Top casting is allowed in Java
		// with the top casting , we can access methods which are coming from the same class(Car) or which got overridden 
		// So with the top casting- we can access only overridden and inherited methods 
		// Below is the example 
		
		System.out.println("---------------");
		Car c1=new BMW(); 
		c1.start();			// BMW start method will be called (coming from car (overridden))
		c1.stop();			// Coming from the car class	(coming from car (individual method))
		c1.refuel();		//	Coming from the car class	(coming from car (individual method))
	 
		// c1.autoparking -   individual method is not allowed	(coming from BMW)
		// c1.theftSafety - 	individual method is not allowed (coming from BMW)
		// *Reference type check* -Fails in the above two individual  methods for Top casting
		
		
		//* Down casting
		// Parent class object can be referred by child class reference variable
		// Down casting is allowed in compile time but Run time it will give you an Exception.
		
		//BMW b1= (BMW) new Car(); // We will get a runtime(ClassCast Exception)
		
		//BMW b2= (BMW) new Vehicle();// We will get a runtime(ClassCast Exception)
		
		
		//Child class object can be referred by grand parent class reference variable as well
		Vehicle v1 =new BMW();
		
		
		
		
	}

}
