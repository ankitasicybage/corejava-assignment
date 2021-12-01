package CybageAssignment;

public class ConstructorExample {

	int var1;  
	String var2;
	
	ConstructorExample(int v1,String v2)
	{
		var1=v1;
		var2=v2;
	}
	
	void display()//to display the values set in the constructor
	{
		System.out.println("The value of the data variables are "+var1+" and "+var2);
	}
	
	public static void main(String args[])
	{ 
		ConstructorExample obj = new ConstructorExample(22,"Hi");
		
		obj.display();
		
	}
}

 