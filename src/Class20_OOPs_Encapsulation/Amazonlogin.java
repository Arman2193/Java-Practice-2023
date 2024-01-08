package Class20_OOPs_Encapsulation;

public class Amazonlogin {

	public static void main(String[] args) {

		// Registration
		LoginPage lp = new LoginPage("Arman.com", "21arman");

		// login
		lp.doLogin(lp.getUserName(), lp.getPassword());

		// reset password
		// Will use set as below to reset the password
		// Getter means get the value and setter means set the value

		lp.setPassword("22Arman");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		// new user-abhishek(is a Seller) and wants to login
		// We would need to create object for all the users individual 
		//below lp1 object we have created for other user -abhishek(Seller)
		// if 10 users are there we would need to create 10 objects.
		// as many users, we would need to create that many objects we need to create
		
		LoginPage lp1 = new LoginPage("abhishek.com", "21abhishek");
		lp1.doLogin(lp1.getUserName(),lp.getPassword());
		
		
		
		
		
		
		

	}

}
