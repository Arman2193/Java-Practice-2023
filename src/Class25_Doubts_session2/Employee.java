package Class25_Doubts_session2;

public class Employee {

	String name;
	int age;
	String city;
	
	
	// we create default constructor as well
	
	
	public Employee() {
		this("arman",30);
		System.out.println("Emp");
	}
	
	public Employee(String name, int age) {
	
		this.name = name;
		this.age = age;
	}


	public Employee(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	
	// Calling  constructor from another constructor 
	//but we need to keep the "this keyword " as very first keyword as below 
	//can we call the below default constructor -yes just dont pass any parameters 

	public Employee(String name) {
		
		this();
		//this("Arman",20,"La");
	
		this.name = name;
		this.age=60;
		this.city="Banglore";
	}
	
	
}
