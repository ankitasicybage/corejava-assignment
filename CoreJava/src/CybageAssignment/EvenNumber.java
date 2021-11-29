package CybageAssignment;

import java.util.Scanner;

public class EvenNumber{
    public static void main(String args[]) {
        
       Scanner obj = new Scanner(System.in);
       
       System.out.println("Please enter the amount of numbers you want to print");
       int n= obj.nextInt();
     
     
     for (int i=0;i<n;i++)
     {
        System.out.println("Please enter the number you want to print"); 
        int num = obj.nextInt();
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println(num);
     }
     
    }
}
