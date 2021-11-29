package CybageAssignment;

import java.util.Scanner;

public class Arrays {
	
	Scanner s = new Scanner(System.in);
	
	void reverse()
	{
		System.out.println("Enter the total count of the array");
		int a = s.nextInt();
		if(a==0)
		{
			System.out.println("You have entered 0, hence terminating");
		}
		else
		{
			System.out.println("Enter the values for the array");
			int arr[] = new int[a];
			for(int i=0;i<a;i++)
			{
				arr[i]=s.nextInt();
			}
		System.out.print("The values of the array in reverse order are : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		}
	}
	
	void sum()
	{
		System.out.println("Enter the total count of the array");
		int a = s.nextInt();
		int sum =0;
		if(a==0)
		{
			System.out.println("You have entered 0, hence terminating");
		}
		else
		{
			System.out.println("Enter the values for the array");
			int arr[] = new int[a];
			for(int i=0;i<a;i++)
			{
				arr[i]=s.nextInt();
			}
		
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
		System.out.print("The sum of the values in the array is "+sum);
		}
	}
	
	void bubblesort()
	{
		System.out.print("Enter the total count of the array ");
		int a = s.nextInt();
		if(a==0)
		{
			System.out.println("You have entered 0, hence terminating");
		}
		else
		{
			System.out.print("Enter the values for the array ");
			int arr[] = new int[a];
			for(int i=0;i<a;i++)
			{
				arr[i]=s.nextInt();
			}
		
			for(int i=0;i<a-1;i++)
			{
				for(int j=0;j<a-i-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.print("The sorted array is ");
			for(int i=0;i<a;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
		
	

	public static void main(String[] args) {
		
		Arrays obj = new Arrays();
	//	obj.reverse();
	//	obj.sum();
		obj.bubblesort();
	}

}
