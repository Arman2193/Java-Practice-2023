package Class17;

public class StaticMethodOverloading {

	//Static method can be overloaded
	// its stored in CMA
	
	public static void login() {
		
		
	}
	
	public static void login(int i) {
		
		
	}
	
	public static void login(int i, int j) {
	
	
}
	
	// Can we overload main method -> Yes
	// But Jvm will check public static void main(String[] args) and will call that main method
	// and will execute that main method -which has psvm and string with arrays parameters
	// But we dont need main method overload itself , even while creating framework we will use 
	// testng and we wont require main method
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		}
	public static void main(int a) {
		
		System.out.println("main method " +a);
	}
	
	public static void main(int a , int b) {
		
		System.out.println("main method" +a +b);
	}

	
	

	
	
}
