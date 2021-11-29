package CybageAssignment;

import java.util.Scanner;

public class Functions {

	Scanner s = new Scanner(System.in);
	void swap(int a,int b)
	{
		System.out.println("The value of a and b before swapping is " +a+ " and "+b);
		int x = a+b;
		a=x-a;
		b=x-a;
		System.out.println("The value of a and b after swapping is " +a+ " and "+b);
		
	}
	
	void primeNumbers()
	{
		System.out.println("Enter a number to see the prime numbers occuring before that");
		int n = s.nextInt();
		if(n==0)
			System.out.println("No prime numbers found");
		else if(n==1)
			System.out.println("1 is the only prime number");
		
		System.out.print("The prime numbers before "+n+ " are : 0 1 ");
		for(int j=2;j<=n;j++)
		{
			
			int flag=0;
			for(int i=2;i<=j/2;i++)
			{	
				int temp = j%i;
				if (temp==0)
				{
					flag=1;
				 break;
				}
			}
			if(flag==0)
				System.out.print(j+" ");
		}
		}
		
	
	public static void main(String args[])
	{
		Functions obj = new Functions();
		obj.swap(8, 3);
		obj.primeNumbers();
	}
	
}
