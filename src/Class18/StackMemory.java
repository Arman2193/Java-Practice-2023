package Class18;

public class StackMemory {

	// Summary - Method chaining Concept
	// m1 m2 m3 can interact with each other without creating the object
	// main method has to create an object of class to call m1() method to start the
	// calling of method.because its a non static member

	// t1() method is static method hence

	// To understand the calling we need to go through the stack memory diagram .
	// as we call the main-> m1->m2->m3 method ,we don't need to create object hence
	// it will get stored in stack memory

	// but in heap objects will be stored and , garbage collector will be used to
	// deallocate
	// the space. Hence heap is very complex than stack memory

	// non static method- calling non static method -Yes (No object creation needed)
	// static method -calling static method-Yes (No object creation needed)
	// non static method- calling static method - Yes(Directly or by using class
	// name,No object creation needed)
	// static method -calling non static method- Yes(Need object creation)
	// stack -> LIFO
	// Queue -> FIFO
	// Stack goes out of memory -> "Stack overflow error"

	// Assignment -
	// 3 static methods
	// 3 non static methods
	// static to static
	// static to non static
	// non static to static
	// non static to non static

	// static methods - these will go to the cma -meta space
	// hence we can call them directly without object
	// it will also be allocated in the stack memory for execution
	public static void t1() {

		System.out.println("t1");
		t2();
	}

	public static void t2() {

		System.out.println("t2");

		t3();
	}

	public static void t3() {

		System.out.println("t2");
		StackMemory o2 = new StackMemory();
		o2.m1();

	}

	public void m1() {
		System.out.println("m1");
		int i = 10;
		m2();

	}

	public void m2() {
		System.out.println("m2");
		int p = 20;
		m3();

	}

	public void m3() {

		System.out.println("m3");
		// m1();
		StackMemory.t1();

	}

	public static void main(String[] args) {

		StackMemory obj = new StackMemory();
		obj.m1();
	}
}
