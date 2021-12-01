package CybageAssignment;

public class CallByValueExample {
	     
	    int a = 10;
	    void func(int a)
	    {
	    
	        a = a+10;
	    }
	     
	    public static void main(String[] args)
	    {
	 
	    	CallByValueExample obj = new CallByValueExample();
	        System.out.println("Before call-by-value: " + obj.a);
	         
	        obj.func(20);
	        System.out.println("After call-by-value: " + obj.a);     
	         
	    }
	
}
