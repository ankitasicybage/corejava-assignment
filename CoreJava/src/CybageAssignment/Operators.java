package CybageAssignment;

public class Operators {
	
	public static void main(String[]val1rgs) {
	    	    
	    int val1= 3, val2= 2,var=1;
	    String tern;

	    //arithmetic operators
	    System.out.println("Arithmetic Operators");
	    System.out.println("val1 + val2= " + (val1+val2));
 
	    System.out.println("val1 - val2= " + (val1-val2));

	    System.out.println("val1 * val2= " + (val1*val2));

	    System.out.println("val1 / val2= " + (val1/val2));

	    System.out.println("val1 % val2= " + (val1%val2));
	 
	    //val1ssignment operators
	    System.out.println("Assignment Operators");
	    System.out.println("variable using =: " + (var =val1));
    
	    System.out.println("variable using +=: " + (var +=val1));

	    System.out.println("variable using -=: " + (var -=val1));
	    
	    System.out.println("variable using *=: " + (var *=val1));
	    
	    System.out.println("variable using /=: " + ( var /=val1));
	    
	    System.out.println("variable using %=: " + (var %=val1));
	    
	    // relational operators	    
	    System.out.println("Relational Operators");
	    System.out.println(val1==val2); 

	    System.out.println(val1!=val2);

	    System.out.println(val1>val2);

	    System.out.println(val1<val2); 

	    System.out.println(val1>=val2); 

	    System.out.println(val1<=val2);
	    
	    
	    // logical operators	
	    System.out.println("Logical Operators");
	    System.out.println((5 > 3) && (8 > 5));   

	    System.out.println((5 < 3) || (8 > 5));  

	    System.out.println(!(5 == 3));
	    
	    // unary operators
	    System.out.println("Unary Operators");
	    System.out.println("After increment: " + ++val1);

	    System.out.println("After decrement: " + --val2);
	    
	    //ternary operators
	    tern = (val1== 4) ? "Square" : "Not Square";
	    System.out.println(tern);
	} 

}
