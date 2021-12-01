package CybageAssignment;

public class StringFunctions {

	public static void main(String[] args) {
		
		String s = "StringExample";
		String str = new String("Example"); 
		
		System.out.println("Character at index 4 is " + s.charAt(5));
		
		System.out.println("Length of the string is " + s.length());
		
		System.out.println("Comparing the two strings and the answer is " + s.compareTo(str));
		
		System.out.println("Using the equals with ignore case function and the answer is " + s.equalsIgnoreCase(str));
		
		System.out.println("Using the endsWith function and the answer is " + s.endsWith("pl"));
		
		System.out.println("Using the to lower case function and the answer is " + str.toLowerCase());
		
		System.out.println("Concatenating the two strings and the answer is " + s.concat(str));
		
		System.out.println("Using the contains function and the answer is " + s.contains(str));
		
		System.out.println("Using the equals function and the answer is " + s.equals(str));
		
		System.out.println("Using the replaceAll function and the answer is " + str.replaceAll("e","t"));
		
		System.out.println("Using the replace function and the answer is " + str.replace('a','r'));
		
		System.out.println("Using the isEmpty function and the answer is " + str.isEmpty());
		
		
	}

}
