package CybageAssignment;



public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		try{  
		    
			int data=100/0;  //arithmetic exception
			
		   }
		catch(ArithmeticException e) {
			System.out.println(e);} 
		
		try {
			
			String a = "Hello"; 
            char c = a.charAt(6); 
            System.out.println(c);
		}
		
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException"); }
		
		
		  

	}

}
