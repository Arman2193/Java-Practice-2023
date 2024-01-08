package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		
		//Chrome:
		//ChromeDriver driver=new ChromeDriver();
		
		//FireFox
		//FirefoxDriver driver=new FirefoxDriver();
		
		//Safari
		//SafariDriver driver =new SafariDriver();
		 
		//so we need to comment -uncomment the below drivers -but it needs to be smooth 
		//without commenting
		
		//So let say below string browser is coming from some excel or txt file
		
		
		//So below is the cross browser logic
		String browser ="Chrome";
		WebDriver driver=null; // Just a reference created  
		
		if(browser.equals("Chrome"))
		{
			driver =new ChromeDriver(); // topcasting
		}
		else if(browser.equals("Firefox")){
			driver =new FirefoxDriver(); // topcasting
		}
		else if(browser.equals("Safari")){
			driver =new SafariDriver();	// topcasting
		}
		else {
			System.out.println("Please pas the corect browser");
		}
		
		
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println("Page title"+title);
		
		driver.findElement("emailId");
		driver.sendKeys("emailId", "arman.baig@gmail.com");
		driver.findElement("password");
		driver.sendKeys("password", "arman123");
		driver.findElement("Login button");
		driver.click("Loginbutton");
		driver.close();
	}
	
	
	
}
