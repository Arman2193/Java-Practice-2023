package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "This is my java code i a so happy";

		int len = s.length();
		System.out.println(len);

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		// System.out.println(s.charAt(20)); // Exception String index out of bound
		// exception (SIOB)

		// System.out.println(s.charAt(-1));// Exception String index out of bound
		// exception (SIOB)

		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf("i"));// 1st occurrence of i

		// so the below code looks hard coded , if the string is changed or updated it
		// will not work

		System.out.println(s.indexOf("i", 3));// 2nd occurrence of i

		// So we can use the below code

		// interview question -Give me the 1st 2nd 3rd occurrence of a string

		System.out.println(s.indexOf('i', s.indexOf('i') + 1));

		// Start from 15.00

		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("Testing")); // if the value is not available it will give -1 .

		String mesg = "welcome admin";
		if (mesg.indexOf("admin") == 8) {

			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		// not a good validation
		if (mesg.indexOf("admin") >= 0) {

			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		//
		String test = "  Hello World   ";
		System.out.println(test.trim());

		//

		String t = "hello this a jave code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());

		//
		String dob = "01-01-1990";// 01/01/1990
		System.out.println(dob.replace('-', '/'));

		String test1 = "   hello world   ";
		System.out.println(test1.replace(" ", "")); // removes all spaces

		// two reference would be created below , and one value "hello world" in the scp
		// as duplicate values are not allowed
		String st = "hello world";
		String st1 = "hello World";

		System.out.println(st == st1);
		System.out.println(st.equals(st1)); // always use .equals method for string comparison.

		System.out.println(st.equalsIgnoreCase(st1));// it will ignore the case( upper ,lower) for comparison

		System.out.println("-------------");

		String browser = "CHROME    ";
		if (browser.trim().equalsIgnoreCase("chrome")) // Trim- helps to remove spaces

		{

			System.out.println("Pass");
		}

		// we can use the below contains methods in selenium to check element
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));

		// split:
		// array 0 1 3 4
		String lang = "JAVA_PYTHON_DOTNET_RUBY"; // it will split in an return it in an array - converting the string in
													// an array. Split method will always return the string array
		String l[] = lang.split("_");

		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(Arrays.toString(l)); // All the values will be printed

		// interview question

		String pop = "xXseleniumxXXtestingXxXJavaXxXpythonX";
		String d[] = pop.split("xX");

		System.out.println(d[0].length()); // gives us whether its blank(0) or space value ,for a space
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		// System.out.println(d[5]);
		System.out.println(Arrays.toString(d));

		// in selenium we iterate the below details and the send it to the elements in
		// the form
		String empInfo = "madhav|singh|pune|india|ibm|sdet";
		String emp[] = empInfo.split("\\|"); // mention two back slash if the correct split is not happening

		for (String e : emp) {

			System.out.println(e);
		}

		// let say below value is given by the webpage and we need to perform some
		// arithmetic operation
		String x = "100";
		System.out.println(x + 20);

		// so we need to convert String to int :using integer.parseInt method
		// in integer class theres a static method parseInt
		int i = Integer.parseInt(x); // it will give the exact value of x ->100

		System.out.println(i + 20);

		// Try to remove A from 100A using split

		// String to double:
		String v = "12.33";
		System.out.println(v + 10);
		double d1 = Double.parseDouble(v);
		System.out.println(d1 + 10);

		//int to string:
		int k= 	1100;
		System.out.println(k+20);
		String k1=String.valueOf(k);//1100
		System.out.println(k1+20);
		
		//string to boolean
		String flag= "true";
		boolean b1=Boolean.parseBoolean(flag);//true 
		if(b1) {
			
			System.out.println("run my test cases");
		}

	}

}
