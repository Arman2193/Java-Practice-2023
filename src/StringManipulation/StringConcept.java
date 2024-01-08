package StringManipulation;

public class StringConcept {

	
	
	public static void main(String[] args) {
		
		//String literals:
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s==s1 );
		System.out.println(s1==s2 );
		
		//String objects with new keyword
		
		String st= new String("Java");
		String st1= new String("Hello");
		
		
		
		
		
		
		// With s comparing with st1 with == operators , it will compare the memory address
		
		System.out.println(s==st1); //False
		
		// With s comparing with st1 with equals method , it will compare the actual value
		// Hence "equals" is the better way to compare the strings
		
		//String are the mostly used every application
		// Hence scp is designed for proper management
		 System.out.println(s.equals(st1)); //true
		 
		 // Conclusion - it always better to use literals to create strings not with the objects
		 
		 String st2= new String("Hello");
		 String test =new String("Selenium");//1.->heap
		 test.intern(); // Purpose of the intern() method is to create a copy of the "Selenium" in the heap scp memory
		
		 String t1 = "Selenium"; // 0
		 
		 //  total number of objects are 2 as above for st2 and test
		 //  if we need the same type of value as a object "Selenium" in the scp -intern methods helps in that
		 
		 String st4= new String();// Always supply the value otherwise there will be unnecessary objects
}
}
