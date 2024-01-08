package Class27_ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {
		
		String browser= " Chrome";
		
		if(browser.equals("Chrome")) {
			
			System.out.println("Launch Chrome");
		}
		else	if(browser.equals("Firefox")) {
			
			System.out.println("Launch Firefox");
		}
		else	if(browser.equals("Safari")) {
			
			System.out.println("Launch Safari");
		}
		
		else {
			
			System.out.println("Please pass the right browser");
			throw new MyException("Browser not found"); // as we create the object the constructor will be called.
		} 
		
	}
}
