package Class16;

public class Shopping {

	
	//duplicate methods are not allowed , but 
	
	
	// Method -overloading : Within the same class if the number of methods-
	// 1.With the same name
	// 2.With different parameters 
	// 3.With different number of parameters
	// 4.With different order of parameters
	// 5.Return type doesn't matter 
	
	// At the time of coding - explain the above points and explain the real time use cases as below.
	
	public void test() {
		
	}
	public void test(int i) {
		
	}
	
	public int test(double d) {
		
		System.out.println("Test method");
		return 100;
		
	}
	public void test(int i ,int j) {
		
	}
	
	//Different parameters
	public void test(String p) {
		
	}

	public void test(String p ,int q) {
	
		System.out.println(p+q);
	}
	public void test(int p ,String q) {
		System.out.println(p+q);
	}
	
	
	
	
	
	// Use case real time examples
	
	//1.amazon login
	
	public void login(String un , String pwd) {
		
		
	}
	public void login(String un , String pwd, String role) {
		 
		
	}
	
	
	//2. amazon search
	
	
	public void search(String productName) {
		
		
		
		
	}
	
public void search(String productName, int price) {
		
		

		
	}
	public void search(String productName, int price, String colour) {
		
		
		
		
	}
	
	// 3 .Payment mode:Feature using upi, cc, dc ,paypal,stripe. 	
	
	public void dopayment(String upi) {
		
		
		
	}
	
	public void dopayment(String cc, int cvv) {
		
		
		
	}
	
	public void dopayment(String paypal, String Pwd,int otp) {

		
		
		
	}
	
	
	//uber :booking
	
	public void booking(String carType, String fromLocation, String toLocation) {
				 	
		
	}
	public void booking(String carType, String fromLocation, String toLocation,int passenger) {
				 	
		
	}
	
	public void booking(String carType, String fromLocation, String toLocation,String paymentOption) {
				 	
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Shopping shop= new Shopping();
		shop.booking(null, null, null);
		
		
	}
	
	// But these methods look ugly , difficult to write the multiple methods 
	// But its the way we need to write , method with the same name but different parameters
	// Help us to find the 
	
	
	
	
	
	
	
	
	
	
	
}