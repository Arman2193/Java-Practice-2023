package Class26_ExceptionHandling;

public class MultipleTrycatch {
	int age;

	public static void main(String[] args) {

		// instead of particular exception mention Exception e -the parent class of AE
		// and NPE
		// So we can have multiple catch blocks -whatever exception comes respective
		// catch block would be called -that is better approach multiple catch

		// Immediately as the exception occurs -it will go to the catch block -hence the
		// lines after the try block will not be executed 
		// Scope of reference "e" is particular to that catch block

		// So incase we dont have idea about the exception -then we can run the code
		// without try catch block and then
		// we can copy the same exception in try and catch block
		// Catch block is behaving  like a reporting for me -what exactly is happening in the code
		
		// We cannot have duplicate catch blocks
		// Catch block is mandatory of try block is there
		// Try would through the exception and catch block will catch it 

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int i = 9 / 0; // AE exception

			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.age = 20; // NP exception

		} catch (ArithmeticException e) {

			System.out.println("AE is coming");
			e.printStackTrace();
		} catch (NullPointerException e) {

			System.out.println("NPE is coming");
			e.printStackTrace();
		}

		System.out.println("Bye");

	}
}
