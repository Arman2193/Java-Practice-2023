package Class25_Doubts_session2;

public class BMW extends Car {

	// Super class
	// 1.BMW is calling super class constructor using super() keyword
	// 2.Super class should be the first statement while calling parent class
	// constructor
	// 3. We can also call the parent class methods and variables as well -if the
	// methods are overloaded -not mandatory it should be the first statement
	// 4.    

	// Difference between this and Super keyword
	// This key word is used to call current class constructor
	// Super keyword is used to call parent class constructor
	// Super and this keyword cannot be together

	// Use case
	// 1. If we want to supply some value to the parent class constructor(calling
	// parent class constructor)

	int min_speed = 200;

	public void spedCal() {
		System.out.println(min_speed); // BMW speed

		int carSpeed = super.min_speed; // car speed
		int diff = min_speed - carSpeed;
		System.out.println(diff);

	}

	@Override
	public void display() {

		System.out.println("BMW  display");
		super.display();
	}

	public BMW() {

		super("bmwx1", 20000);
		System.out.println("BMW constructor");

	}

	public BMW(int price) {

		super("Audi", 30000);
		System.out.println("Audi constructor");

	}
}
