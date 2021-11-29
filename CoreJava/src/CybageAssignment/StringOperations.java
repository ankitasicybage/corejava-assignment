package CybageAssignment;

import java.util.Scanner;

public class StringOperations {

	Scanner obj = new Scanner(System.in);
	
	void palindrome()
	{
		System.out.print("Enter a string to check if its palindrome or not ");
		String s1 = obj.next();
		int i=0,j=s1.length()-1;
		int flag=0;
		for(i=0;i<j;i++,j--)
		{
			if(s1.charAt(i)!=s1.charAt(j))
				flag=1;
			
		}
		if(flag==1)
			System.out.println("The string is not palindrome");
		else
			System.out.println("The string is palindrome");
			
	}
	
	void reverse()
	{
		String s1="World",rev="";
		char ch;
		for(int i=s1.length()-1;i>=0;i--)
		{
			ch = s1.charAt(i);
			rev = rev+ch;
			
		}
		System.out.println("The original string is "+s1);
		System.out.println("The reversed string is "+rev);
		
	}
	
	void vowelsAndConsonants()
	{
		String s1="HelloJava";
		s1=s1.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				v++;
			else
				c++;
			
		}
		System.out.println("The number of vowels are "+v+" and consonants are "+c);
	}
	
	public static void main(String[] args) {

		StringOperations s = new StringOperations();
	//	s.palindrome();
	//	s.reverse();
		s.vowelsAndConsonants();
	}

}
