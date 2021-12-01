package CybageAssignment;

import java.util.Properties;

public class GetSetPropertiesExample {

	public static void main(String[] args){  
		  
		Properties obj = new Properties();  
		obj.setProperty("lang","JAVA");  
		obj.setProperty("email","cybage.com");  
		  
		System.out.println(obj.getProperty("lang"));  
	    System.out.println(obj.getProperty("email"));  
		  
		}  
		
}
