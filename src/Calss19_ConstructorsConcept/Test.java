package Calss19_ConstructorsConcept;

public class Test {

	public static void main(String[] args) {

		// Testing t1 = new Testing(); // creating private constructor in Testing class
		// ,it will not allow to create a
		// object in test class
		// As we make private it cannot be accessed outside the class

		Testing.getInfo();

		// System s1= new System(); not allowed having as its having private constructor
		// all the methods are static in System class

	}

}
