package WebDriver_Arch;

public class ChromeDriver implements WebDriver {

	// can we create a constructor -yes as below
	
	public ChromeDriver() {
		System.out.println("Launch chrome browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Enter the URL:" +url);
		
	}

	@Override
	public String getTitle() {
		
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on ---:"+element);
		
	}

	@Override
	public void sendKeys(String element, String Value) {
		System.out.println("entering " + Value +"into" +element );
	}

	@Override
	public void close() {
		System.out.println("close browser");
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Finding the element" + element);
		
	}

}
