package Class27_ExceptionHandling;

// Always create a custom separate class as below for custom exception using throw keyword


public class MyException extends RuntimeException  {

	public MyException(String msg) {
		
		super(msg); // We dont need to mention multiple try catch block in the frame work -it will be handled internally 
					// And we are throwing our own exception 
	}
	
}
 