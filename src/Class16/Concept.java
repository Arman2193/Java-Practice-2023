package Class16;
import java.util.ArrayList;

public class Concept {

	//WAf 
	//Supply a browser name:String :Chrome/ff/safari/
	//business logic:launch browser
	//return true
	
	public boolean launchBrowser(String browserName){

		System.out.println(("browser name:" +browserName));
		boolean flag=true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;
		case "Firefox":
			System.out.println("Launch firefox browser");
			break;				
		case "Safari":
			System.out.println("Launch Safari browser");
			break;			
		case "IE":
			System.out.println("Launch IE browser");
			break;
			
		
		default:
			System.out.println("Please pass the browser:" +browserName);
			flag=false;
			break;
			
		}
		return flag;
		
		
	}
	
	
	
	
	  
	//We can return blank return as well in the case of void as below
	
	public void test()
	{
		System.out.println("Testong");
		return;
	}
	
	
	
	// Write a function :(Returning array list to tje function)
	//1.Supply input parameters : Company name:Ibm,google, microsoft
	//2.Return : the list of employee of the company:Arraylist<String>
	
	public ArrayList<String> getEmplist(String comName) {
		
		System.out.println("company name is : "+comName);
		
		ArrayList<String> emplist= new ArrayList<String>();
		
		if(comName.equalsIgnoreCase("IBM")) {
			
			emplist.add("Arman");
			emplist.add("Ravi");
			emplist.add("tom");
			
		}
		else if(comName.equalsIgnoreCase("Microsoft")) {
			
			emplist.add("Abhi");
			emplist.add("noman");
			emplist.add("lids");
			
		}
		else if(comName.equalsIgnoreCase("IBM")) {
			
			emplist.add("jenner");
			emplist.add("jamie");
			
			  
		}
		else {
			
			System.out.println("Company not found..Please pass the correct company name");
		}
		
		return emplist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Concept c= new Concept ();
		
		ArrayList<String> ibmList=c.getEmplist("IBM");
		System.out.println(ibmList);
		
		ArrayList<String> microsoft=c.getEmplist("microsoft");
		System.out.println(microsoft);
		System.out.println(microsoft.size());
		

		ArrayList<String> clist=c.getEmplist("ctlist");
		System.out.println(clist.size());
		
		
		
		
		
		
		
		boolean islaunched =c.launchBrowser("Opera");
		
		if(islaunched) {
			
			System.out.println("Enter Url");
			
		}else {
			
			System.out.println("dont enter the url");
		}
		
		
		
		
	}
	
	// create the same logic using switch statement
}
