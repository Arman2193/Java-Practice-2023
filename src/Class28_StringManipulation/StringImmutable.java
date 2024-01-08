package Class28_StringManipulation;

public class StringImmutable {

	// Immutable - Values of string cannot be changed
	// Whenever we concatenate a new entry will created in the scp-> it will not
	// touch the previous duplicate values
	// it will always create new entry

	public static void main(String[] args) {

		String s = "Selenium";
		String t = s + "Hello";

		System.out.println(t);// SeleniumHello
		System.out.println(s);// Selenium

		String st = "Java";//

		System.out.println(st + "Python");

		System.out.println(st);

		st = st + "Automation";
		System.out.println(st); // JavaAutomation -> new entry will be created in scp

		String u = "Java";// in this case Java is already there in st reference , so new entry will not be
							// created and u will point same Java entry

		// So we dont want duplicate values as above. Hence we use the below

		// mutable classes: We can change -update the values of the string

		// StringBuilder(jdk 1.5) and StringBuffer(jdk 1.0)

		// StringBuilder is faster than StringBuffer

		// StringBuilder not applicable for scp.
		// StringBuilder is a class and a particular object needs to be created unlike
		// string literals where we do not need to create an object
		// whenever you have to go with the string manipulations -using string builder class
		
		StringBuilder sb = new StringBuilder("Testing");
		
		sb.append("Automation");
		System.out.println(sb);
		
		String pop ="  Submit  ";
		pop = pop.trim();
		System.out.println(pop); // it will create a new entry 
		

	}

}
