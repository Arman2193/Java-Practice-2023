package Class25_Doubts_session2;

public class Selenium implements Google {

	@Override
	public void search() {

		System.out.println("Selenium search");
		// super.count - we cannot access because "count" variable because its static
		// and final as well in the interface
		
		System.out.println(Google.count);
		
		
		

	}

}
