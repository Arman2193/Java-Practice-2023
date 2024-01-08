package Class17;

public class Polymorphism {

	public void search() {
		
		
		
	}
	public void search(String productName) {
		
		System.out.println(productName);
		
	}
	
	public void search(String productName, int price) { 
	
	System.out.println(productName+ " " +price);
	
}
	
	
	// Polymorphism -Poly means "many" and morphism means "forms"
	
	// Method Overloading - Method overloading is compile time polymorphism(Static binding)
	
	// Methods having same name with different types of arguments 
	// Compiler takes the decision which method needs to be called and gives the method options
	// on the basis of given value and then the "interpreter" will run the program
	
	public static void main(String[] args) {
		
		
		Polymorphism obj= new Polymorphism();
		obj.search("macbook");
		obj.search("imac",100);
		
		
		
		
		
		
		
		
		
	//Method Overriding : Runtime Polymorphism( Dynamic Binding)
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
