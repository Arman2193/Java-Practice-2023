package Class27_ExceptionHandling;

public class ThrowKeyword {
	
	// Throw Keyword - Helps us in generating our creating our own customized exceptions.
	// Throws Keyword- is used to delegate one exception to another class to handle it.
	
	
	public static void main(String[] args) {
		
		try {
		throw new Exception("user is not found ");
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("-------------------");
		
		String data =null;
		
		if (data==null)// Custom exception
			{
			
			try {
				throw new Exception("Data is not found ");
			} catch(Exception e) {
				
				e.printStackTrace();
			}
			}
		try {
			System.out.println(data.length()); // Not a Custom exception
		}catch(NullPointerException e) {
			System.out.println("Cannot calculate the length");
			
		}
		System.out.println("Bye");
		}
	
	
		
	}
	


