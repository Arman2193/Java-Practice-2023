package Calss19_ConstructorsConcept;

public class Employee {

	
	String name;
	int age;
	double salary;
	
	//Constructor:
	
	//name is same as the class name
	//cannot have a return value , it cannot return anything - void , int or string as we used to specify previously
	//Function/ Method can return something (integer , string)
	//But constructor there is not return type
	//Note - Constructor restricts unnecessary object creation
			
	//Constructor will be called when we create an object
	//its a 0 parameter 
	//it can be overloaded
	
	
	public Employee() {
		
		System.out.println("Constructor");
	}
	
	public Employee(int i ) { // 1 parameter
		
		System.out.println("Constructor" +i);
	}
	
	public Employee(int i,String p ) { // 2 parameter
		
		System.out.println("Constructor" +i +p);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Employee obj = new Employee();
		obj.name="Arman";
		obj.age=20;
		obj.salary=3000;
	
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20,"Testing");
		
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		System.out.println(obj.salary);
		
		
		
		
		// We are able to create unnecessary objects .to solve this java has introduced constructors.
		
		
		
	}
	
}
