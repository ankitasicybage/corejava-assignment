package CybageAssignment;

import java.lang.reflect.Array;
import java.util.List;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		try{  
		    
			int data=100/0;  //arithmetic exception
			
		   }
		catch(ArithmeticException e) {
			System.out.println(e);} 
		
		try {
			
			String a = "Hello"; 
            char c = a.charAt(6); //StringIndexOutOfBoundsException
            System.out.println(c);
		}
		
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException"); }
		
		
		try {
			String s = null;
			String substring = s.substring(0, 2); //NullPointerException. There is no 'NullReferenceException' in Java. 
												//Java has an equivalent class 'NullPointerException'.
		}
		catch(NullPointerException e) {
            System.out.println("NullPointerException");
		} 

	
		
	}

}
