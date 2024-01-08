package Class27_ExceptionHandling;

public class UseCaseFinally {

	public static void main(String[] args) {

		// Right practice is to close the DB connection using Finally block
		// When there several connections established as below by the user
		// user might logout from the front end , but in the backend the connection is
		// still established and this could bring the portal DB down for new users to access
		// Hence to close those DB connection -we need to keep the close DB connection
		// under Finally block
		//And the DB is going to same for all users
		//doesnt matter the work is done or not -we need to close the DB connection
		
		
		//final,finally, finalize-GC

		try {

			// Make the connection :use -uname and password ->ip:port
			// hit the sql query
			// getting the result
			// use the result

		} catch (Exception e) {

		}

		// finally {

		// close the DB connection
		// System.out.println("Close the DB connection"); }
	}

}
