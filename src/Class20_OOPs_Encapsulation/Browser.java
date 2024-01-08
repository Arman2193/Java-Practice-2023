package Class20_OOPs_Encapsulation;

// So the below methods are of no use to the user except launchBrowser
// Hence we need to make other methods private
//if we make all the unnecessary methods public in the browser class, it will be available to the user 
// hence we need to make it private
	

public class Browser {
	
	public void launchBrowser() {
		
		System.out.println("Launching browser");
		
		//Calling below methods internally-no need to create object
		
		checkBrowserVersion();
		checkOSCompatability();
		checkCPU();
		checkRAM();
		
		System.out.println("Browser has been launched ");
		
		
	}
	
private void checkBrowserVersion() {
		
		System.out.println("Check browser version");
	}
	
private void checkOSCompatability() {
	
	System.out.println("checkOSCompatability ");
}
private void checkRAM() {
	
	System.out.println("checkRAM");
}
private void checkCPU() {
	
	System.out.println("checkCPU");
}

}
