package Practice;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "abs";

		switch (browser) {

		case "chrome":

			System.out.println("Launch chrome");
			break;

		case "safari":
			System.out.println("Launch safari");
			break;

		case "IE":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("Please pass the right browser");
			break;

		}

		System.out.println("------------");

		String envName = "qA  ";

		switch (envName.toLowerCase().trim()) {

		case "qa":

			System.out.println("Run on QA");
			break;
		case "stage":
			System.out.println("run on stage");
			break;
		default:
			System.out.println("Please pass the right env");
			break;

		}
		
		
		String stname="tom";
		
		int marks=0;
		switch (stname) {
		case "tom":
			System.out.println("Tom passed");
			marks=100-20;
			break;
			
		case "Naveen":
		System.out.println("Naven passed");
		marks=100;
		break;
		}
		if(marks>=0) {
			
			System.out.println("Print marksheet");
		}
		else
		{
			System.out.println("no need to print");
		}
		
	}

}
