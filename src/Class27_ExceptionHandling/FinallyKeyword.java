package Class27_ExceptionHandling;

public class FinallyKeyword {
	
	//Finally - Will always be running 
	//Doesn't matter exception is coming or not -the code will be executed
	// under the finally block 
	//We cannot have multiple finally blocks
	
	// We cannot have try block without catch block
	//but if try and finally block are there then its not mandatory to mention catch block
	// We can write try without catch block using finally -but it will not handle the exception
	
	//We can write have one try and multiple catch blocks
	
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		try {
			int i=9/0;
			
		} 
		catch(Exception e) {
			System.out.println("AE is coming");
		}
		
		finally {
			System.out.println("Bye.....");
		}
	}
	

}
