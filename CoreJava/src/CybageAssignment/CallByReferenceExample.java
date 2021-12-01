package CybageAssignment;

public class CallByReferenceExample {

	    int a = 10;
	    void call(CallByReferenceExample obj) {
	        obj.a = obj.a+10;
	    }
	     
	    public static void main(String[] args) {
	 
	    	CallByReferenceExample obj = new CallByReferenceExample();
	        System.out.println("Before call-by-reference: " + obj.a);
	         
	        obj.call(obj);
	        System.out.println("After call-by-reference: " + obj.a);
	         
	         
	    }
	
}
