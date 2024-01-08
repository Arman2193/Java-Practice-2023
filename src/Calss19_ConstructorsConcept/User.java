package Calss19_ConstructorsConcept;

public class User {

	String firstName;
	String lastName;
	String emailId;
	String phone; // if we are doing mathematical 
	String password;
	String city;
	
	// Acceptance criteria -Given by BA or PA 
	//users can be created if you have the below:
	// FN,LN
	// FN,LN ,email id 
	// FN
	// FN ,LN, email id,  password, phone
	// FN ,LN, email id, phone, password ,city
	
	
	// So we need to create 5 constructor as per above criteria.
	// doing it manually is a tedious job.
	// Hence we can right click-> Select source -> Generate constructors using fields 
	
	// Method-the business logic should be written in method, where we need to return a value.
	// Eg -tax calculation (int tax) name - business logic 
	
	// Constructor - we cannot return a value , hence never write a business logic in constructor 
	// With constructor -used only for object creation,and restriction of object creation 
	// Constructor is used to initialize the the class variable with the initial values
	
	// Calling methods   
	// Static method -call using class name
	// non static method - call by object reference name
	// constructor - Automatically when we create an object
	
	
	

	public User(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	
	
	
	
public User(String firstName, String lastName, String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}






public User(String firstName) {

	this.firstName = firstName;
}






public User(String firstName, String lastName, String phone, String password) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.password = password;
}






public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.phone = phone;
	this.password = password;
	this.city = city;
}






public static void main(String[] args) {
		
		
		User u1=new User("Arman");
		System.out.println(u1.firstName +" " + u1.lastName);
		u1.lastName="Baig";
		System.out.println(u1.firstName +" " + u1.lastName);
		
		User u2= new User("Abc", "baig","baig@gmail.com", "9699699652","password","pune");
		System.out.println(u2.phone);
		System.out.println(u2.firstName +" " + u2.lastName+ " "+ u2.emailId+ " " +u2.phone+ " "+ u2.city);
		
		u2.city="Banglore";
		u2.phone="8999999";
		u2.password="abs";
		
		System.out.println(u2.firstName +" " + u2.lastName+ " "+ u2.emailId+ " " +u2.phone+ " "+ u2.city);
		
		System.out.println(u2);
		
		
	}
	
}
