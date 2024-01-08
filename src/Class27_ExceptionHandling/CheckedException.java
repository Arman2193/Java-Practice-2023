package Class27_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	//Checked Exception means -compiler will immediately show the exception
	
	
	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		e.printStackTrace();
		}
		
		System.out.println("B");
		
		
		try {
			FileInputStream file =new FileInputStream("c:\\documents\test.xlsx");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
