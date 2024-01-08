package Class27_ExceptionHandling;

public class Student {

	// if we have mentioned return keyword with value in finally block - it will
	// Override the other return values as below "return 90 to return 50"
	// interview question- can we use break in try catch- No
	// break will only be used in loops and switch case
	// We cannot return two values from the function

	// also we need to mention try block with finally-else finally will not work
	// System.exit(1) -will terminate all the code after the

	// Use case of finally block- whenever we are doing exception handling-we can
	// Execute it regardless of the exception is coming or not
	//
	

	public static int getMarks(String name) {

		System.out.println("Getting marks for :" + name);

		if (name.equals("Arman")) {
			try {
				int i = 9 / 3;
				return 90;
			} catch (Exception e) {

				System.out.println("AE is coming");
				System.exit(1); // Shuts down the JVM -which will help not to execute the finally block
				return 80;
			} finally {
				System.out.println("Final marks");
				return 50;
			}

		} else if (name.equals("abx")) {
			return 90;

		} else if (name.equals("xyz")) {
			return 80;

		} else {

			System.out.println("Student not found");
			throw new MyException("StudentNotFound"); // Whenever we want to throw custom exception then only we use
														// myexception

		}
	}

	public static void main(String[] args) {
		int m = getMarks("xyz");
		System.out.println(m);

	}

}
