package Class26_ExceptionHandling;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException {
		System.out.println("M1 method");
		m2();
	}

	public void m2() throws ArithmeticException {
		System.out.println("M2 method");

		try {
			m3();
		} catch (ArithmeticException e) {

			System.out.println("Ae is coming");
			e.printStackTrace();
		}

	}

	// m3 method throws the exception -we need to mention "throws" keyword
	// So when we don't want to handle the exception we can mention throw keyword
	// so below m2 calling methods responsibility is to handle the exception
	// Ultimately it should be handled by the application -any method m1 m2 m3 but
	// not the main method
	
	//Conclusion -So throws keyword will never handle the exception
	// Practically we will not use in the selenium framework-its a unnecessary dependency on the other methods
	
	

	public void m3() throws ArithmeticException {

		System.out.println("M3 method");
		int i = 9 / 0;
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

		System.out.println("Bye");

	}
}
