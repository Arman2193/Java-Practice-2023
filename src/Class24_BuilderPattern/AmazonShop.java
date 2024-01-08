package Class24_BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {
		
		// Method calling in chain pattern as below is called as Builder pattern
		// We can use the same pattern in POM selenium
		//For all the workflow applications a Builder pattern is necessary 
		
		
		Shopping shop =new Shopping();
		
		//sc1:
		// Its more readability code
		
		shop.login("arman@gmail.com","arman21")
					.search("Tshirt")
					.addToCart("Tshirt")
					.dopayment("1212 1212 2345 2345 ", 123)
					.generateOrder()
					.Logout();
		
		
		//sc2:
		shop.login("arman@gmail.com","arman")
			.search("macbook")
			.addToCart("macbook")
			.Logout();
		
		//sc3:	
		shop.login("arman@gmail.com","arman")
		.dopayment("1212 1212 2345 2345 ", 123)
		.generateOrder().Logout();
		
		//sc4 :
		shop.login("arman@gmail.com","arman")
		.Logout();
	
		//sc5:
		shop.login("arman@gmail.com","arman")
		.Logout()
		.login("arman@gmail.com","arman");
		
	}
}
