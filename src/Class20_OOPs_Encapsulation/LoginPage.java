package Class20_OOPs_Encapsulation;

public class LoginPage {

	private String userName;

	private String password;

	// so its not a good practice that we create objects in Amazon login class
	// hence we need to create a constructor as below to restrict object creation

	// Constructor
	public LoginPage(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	// So we need to create getters and setters as below for the above private
	// variables
	// !and this is the best practice to create constructor and maintain getters and
	// setters
	// !and private variables -All this three combinations we have to use

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// We need to create a method also-for business logic under same class
	// So the method is related to login web page -hence it should be created under login 
	// So we need to supply user name and password as below
	
	// Note - We cannot create the business logic in the above constructor 
	// Constructors are only to be used for re initializing the private variables 
	// business logic should be always created under a method
	
	// Note - If we create the logic in the constructor -then any other user try's to create 
	// the object of LoginPage class , they will directly get logged in 
	
	// also POM is the classic example of encapsulation.
 
	public void doLogin(String un, String pwd) {

		System.out.println("Enter username " + un);
		System.out.println("Enter password" + pwd);
		System.out.println("Click on login button");

		if (isUserActive(un)) // We can call private method integrally (encapsulation) 
			{

			System.out.println("User is logged");
		} else {

			System.out.println("User is inactive..account is blocked");
		}

		// System.out.println("user is logged in");

	}

	// below is an internal feature hence its set as private
	private boolean isUserActive(String un) {
		System.out.println("Checking status" + un);
		return true;

	}

}
