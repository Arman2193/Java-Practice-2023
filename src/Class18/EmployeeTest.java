package Class18;

public class EmployeeTest {

	String name;
	int age;

	public void add(int a, int b) // 20 and 30 will be stored in a and b variable from the main method
	{

		System.out.println(a + b);

	}

	public void printMsg() {

		System.out.println("Hello");

	}

	public void getEmp(EmployeeTest t2) // t1= t2 , EmployeeTest object got 2 reference now
	{

		t2.name = "tom";
		t2.age = 20;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		EmployeeTest t1 = new EmployeeTest();

		t1.add(20, 30); // Calling the method by passing the value or argument

		t1.getEmp(t1); // Call by reference

		System.out.println(t1.name);
		System.out.println(t1.age);

		t1.name = "Riya";
		t1.age = 30;

		System.out.println(t1.name);
		System.out.println(t1.age);

		t1.getEmp(t1);

		System.out.println(t1.name);
		System.out.println(t1.age);

		//

	}

}
