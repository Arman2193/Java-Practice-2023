package Class26_ExceptionHandling;

public class TryCatchBlock {

	int age;
	
	public static void main(String[] args) {

		// When we dont have idea -when will the exception come , its a runtime
		// exception as below will throw runtime exception
		// We can have multiple exception in a class as below null and arithmetic exception
		// But we would need to write multiple try catch blocks- which is lengthy 

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj =new TryCatchBlock();
		obj=null;
		try {
			obj.age=20; //null pointer exception
		} catch (Exception e) {
			System.out.println("null pointer exception is coming");
			e.printStackTrace();
		}
		
		
		

		try {
			int i = 9 / 0; // exception
			
			System.out.println("Hello"); //not a good practice to write the code after the expected exception code 
			// int i = 9 / 3; // no exception
		} catch (ArithmeticException e) { // Always write the exception the code might give us

			System.out.println("ArithmeticException is coming");
			e.printStackTrace(); // it will give us where exactly the exception is coming on which line.so we get
									// a proper info where what happened and we can fix the problem
		}

		System.out.println("Bye");

	}

}
