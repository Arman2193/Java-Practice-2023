package Class24_BuilderPattern;

public class Shopping {

	//this keyword point to current class object as below
	
	public Shopping login() {
		System.out.println("Login i app");
		return this; // current class (Shopping) object
	}

	public Shopping login(String un, String pwd) {
		System.out.println("Login to the app" + un + "" + pwd);
		return this;
	}

	public Shopping search(String name) {
		System.out.println("product search" + name);
		return this;
	}

	public Shopping addToCart(String name) {
		System.out.println("adding to cart:" + name);
		return this;
	}

	public Shopping dopayment(String cc, int cvv) {
		System.out.println("making payment " + cc + " " + cvv);
		return this;
	}

	public Shopping dopayment(String upi) {
		System.out.println("making payment " + upi);
		return this;
	}

	public Shopping generateOrder() {

		System.out.println("order id is 12345");
		return this;

	}
	public Shopping Logout() {

		System.out.println("Logout");
		return this;

	}
	
	
}
