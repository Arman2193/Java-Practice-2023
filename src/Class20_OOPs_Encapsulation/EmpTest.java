package Class20_OOPs_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		// We cannot access private variables of employee class from emptest class-main
		// method.
		// Hence it needs to re initialized with a public method and then the
		// private variables can be accessed through the same public method
		// it can be private variables also and method also
		// and Getters and Setters helps in doing that
		// So We need to create public Getters and Setters methods to access the private
		// variables

		// *Which in all we can say it is Encapsulation

		// here constructor is passing the values through object instead of setter
		// so we cannot avoid setters but in case if we need to update the values , then
		// we cannot create multiple objects , its not a good practice
		// hence the only option left is "setter"

		// Post - Create
		Employee e1 = new Employee("Arman", 25, 12.24, "Pune");// We have passed it through constructor

		// e1.setName("Arman"); // We have passed it through setters method
		// e1.setAge(25);
		// e1.setCity("Pune");
		// e1.setSalary(12.33);

		// GET - Retrieve
		System.out.println(e1.getName()); // We got the values through getters method
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());

		System.out.println("--------------------");

		// Put- update
		e1.setAge(26);
		e1.setSalary(11.33);

		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());

	}

}
