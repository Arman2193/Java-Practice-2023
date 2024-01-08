package Class24_OOP_Abstract;

public class LoginPage extends Page {

	// so here as well we are implementing abstract method from Page abstract class as we did in interface
	
	//hidden constructor is available 
	
	//Own default constructor 
	public LoginPage() {
		
		System.out.println("LoginPage constructor");
	}
	
public LoginPage(int i) {
		
		System.out.println("LoginPage constructor"+i);
	}
	@Override
	public void title() {
		System.out.println("title");
		
	}

	@Override
	public void url() {
		System.out.println("url");
		
	}
	
	// We can override from Page abstract class
	@Override
	public void calculatePageTimeLoadTime() {
		System.out.println("Page time out ---5secs");
		
	}
	
	//individual method
	public void fgPwd() {
		 
		System.out.println("fgpwd");
	}
	
}
