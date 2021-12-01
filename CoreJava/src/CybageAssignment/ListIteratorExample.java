package CybageAssignment;

import java.util.LinkedList;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> str = new LinkedList<>();
		str.add("One");
		str.add("Two");
		str.add("Three");
		str.add("Four");


		java.util.ListIterator<String> strIterator = str.listIterator();

		while (strIterator.hasNext()) {
			System.out.println(strIterator.next());
		}

	}
}
