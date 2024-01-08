package Class25_Doubts_session2;

public class Car {

	
	String name;
	int price;
	
	int min_speed=100;
	

	public void display() {
		
		System.out.println("Car display");
	}
	
	public Car (String name,int price) {
		
		System.out.println(name+ " " + price);
		this.name=name;
		this.price= price;
	}
	
	public Car () {
		System.out.println("Car constructor");
		
	}
	
}
