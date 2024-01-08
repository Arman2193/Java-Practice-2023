package Class17;

public class LoginTest {

	public static void main(String[] args) {
		
		if(LoginPage.ForgotPwdLink())
		{
			System.out.println("change the pwd");
		}
		
		LoginPage lp= new LoginPage();
		lp.doLogin("arman.baig8@gmail.com", "21@Armanbaig"); 
		
		
		
		
		
	}
	
	
}
