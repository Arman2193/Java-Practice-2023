package Class17;

public class LoginPage {

	public static boolean ForgotPwdLink() {
		
		System.out.println("Checking forgot pwd link");
		return true;
		
		//We cannot return multiple value
		
	}
	
	public void doLogin(String un, String pwd) {
		
		System.out.println("Login with :" +un +":"+pwd);
		System.out.println("Logged in");
	}
}
