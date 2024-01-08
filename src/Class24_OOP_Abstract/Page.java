package Class24_OOP_Abstract;

public abstract class Page {
	
	// People are confused what should we use Interface or abstract class because both look similar 
	
	// 	We cannot create an object of abstract class -
	//	but we can create constructor of abstract class / and we cannot create it in interface
	// Constructor will be called -when we create the object of the child class
	// 	We need to mention abstract keyword in the method and class as well 
	
	//Constructor
	
	//if there are multiple constructors as below
	//Doesnt matter if you are calling the parameterized constructor from the child class(LoginPage) object
	//always the default constructor will be called of the parent class 
	// But when we pass value 10 in child class object the parameterized constructor will be called
	
	// So this is 100% abstraction
	// if we remove or comment abstract methods -it will be 0% abstraction
	// So we achieve abstraction 0% to 100% - combination of normal methods and abstract methods
	// Its not mandatory to write abstract method -in an abstract class .ie its abstraction 0% to 100% 
	//But in iterface - 
	
	
	public Page() {
		System.out.println("Page constructor");
	}
	public Page(int i) {
		System.out.println("Page constructor"+i);
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void calculatePageTimeLoadTime() {
		System.out.println("Page time out ---10secs");
		
	}
	
	public final void displayLogo() {
		
		System.out.println("Display Logo");
	}
	
	public static void footer() {
		
		System.out.println();
		
	}
}
