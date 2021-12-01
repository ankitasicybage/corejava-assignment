package CybageAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	
	
	public static void main(String args[]){  
	         
		  Scanner s = new Scanner(System.in);
		  
	      ArrayList<String> colour=new ArrayList<String>();  
	      //adding to an arraylist
	      colour.add("Blue");
	      colour.add("Green");
	      colour.add("Yellow");
	      colour.add("Pink");
	      
	      System.out.println("Initial ArrayList:" + colour);
	      
	      System.out.println("Enter a colour to add in the list");
	      String col = s.next();
	      
	      colour.add(col);
	      System.out.println("Updated ArrayList:" + colour);
	      
	      System.out.println("Enter one more colours to add");
	      String col1 = s.next();
	      
	      colour.add(2,col1);
	      System.out.println("ArrayList after adding colour at index 2:" + colour);
	      
	      //removing from an arraylist
	      
	      System.out.println("Enter a colour to remove from the list");
	      String colrem = s.next();
	      
	      colour.remove(colrem);
	      System.out.println("ArrayList after removing element:" + colour);
	 
	      System.out.println("Enter an index to remove the colour from the list on that index");
	      int index = s.nextInt();
	      
	      colour.remove(index);
	      System.out.println("ArrayList after removing element from index entered" + colour);
	   } 
}
