package Class20_OOPs_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String city;

	// Lets say we create constructors as well for all private variables

	// Constructor -we are setting up all the values of above private variables
	// with the below public constructors
	// So this also an example of encapsulation

	public Employee(String name, int age, double salary, String city) {

		this.name = name; // this.class variable =local variable
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	// public getter and setter methods
	// right click- > select source - >generate getters and setters
	//

	public String getName() {
		return name; // return- will return the name value to private variable(name)
	} 

	public void setName(String name) {
		this.name = name; // this.class variable =local variable - it will get the name
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
