package Calss19_ConstructorsConcept;

public class EmployeeTest {

	String name;
	int age;
	double salary;
	
	// Hidden constructor-
	//there is default constructor present which is called when we create an object 
	//and when we don't create an constructor
	
	//hidden constructor will only be created only we don't define a constructor
	
	
		// this . class variable = local variable
		// So constructor can be used to initialize class or global variables using this keyword , so that the 
		// (String name) global variable = public EmployeeTest(String name)
	
	
	
		// What if we have only name and age , or age or salary of an employee
		//in that case we can overload the constructor as below 
			
	// Use case of constructor 
	// we need to create the constructor as per the variables- name, age , salary
	
	
	
	public EmployeeTest(String name)
	{
		
		
		this.name=name;
		
	}
	
	public EmployeeTest(String name ,int age) {
		this.name =name;
		this.age=age;
		
		
	}
	public EmployeeTest(String name ,int age,double salary ) {
		this.name =name;
		this.age=age;
		this.salary=salary;
		
	}
	
	
	
	public static void main(String[] args) {
		
		EmployeeTest e1=new EmployeeTest("Arman");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		EmployeeTest e2= new EmployeeTest("Abs", 34);
		System.out.println(e2.name + " " + e2.age+ " " +e2.salary);
		e2.salary= 25.00;
		System.out.println(e2.name + " " + e2.age+ " " +e2.salary);
		
		
		EmployeeTest e3= new EmployeeTest("Pete", 30, 3000);
		
		System.out.println(e3.name + " " + e3.age+ " " +e3.salary);
		
		
	
		
		

	}

}
