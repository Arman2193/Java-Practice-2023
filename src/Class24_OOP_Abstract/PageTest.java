package Class24_OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp =new LoginPage(10);
		lp.title();
		lp.url();
		lp.calculatePageTimeLoadTime();
		lp.fgPwd();
		lp.displayLogo();//final method we can inherit and access
		
		Page.footer();// accessing static method using parent class name
		lp.footer();// we can call with the child class name as well
		
		
		
		
		// So we cannot create an object of page class as below 
		// But we can do Topcasting - child class (LoginPage) object can be referred by parent class reference variable 
		System.out.println("------------------------");
		
		Page p= new LoginPage();
		p.title();
		p.url();
		p.calculatePageTimeLoadTime();
		p.displayLogo();//final method we can inherit and access
		
		// Down casting is not allowed as below 
		//LoginPage lp1= new Page();
		
	}
	
	
	
}
