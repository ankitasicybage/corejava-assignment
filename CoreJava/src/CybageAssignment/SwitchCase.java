package CybageAssignment;

import java.util.Scanner;
import java.lang.String;

public class SwitchCase{
    
    public static void main(String args[]) {
         Scanner obj = new Scanner(System.in);
       
       System.out.println("Enter the 1st number ");
       int n1= obj.nextInt();
       System.out.println("Enter the 2nd number ");
       int n2= obj.nextInt();
       System.out.println("Enter the operation to be performed : Add, Subtract, Multiply , Divide ");
       String op = obj.next().toUpperCase();
       
     
       switch(op)
        {
            case "ADD": 
                System.out.println("Result is "+(n1+n2));
                break;
            case "SUBTRACT": 
                System.out.println("Result is "+(n1-n2));
                break;
            case "DIVIDE": 
                System.out.println("Result is "+(n1/n2));
                break;
            case "MULTIPLY": 
                System.out.println("Result is "+(n1*n2));
                break;
            default:
            	System.out.println("Wrong operation");
        }
    }   
}
