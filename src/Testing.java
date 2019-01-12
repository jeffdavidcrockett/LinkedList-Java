import java.util.*;


public class Testing {
	public static void main (String[] args) {
		
		// Creates new LinkedList object
		LinkedList myList = new LinkedList();
		
		// Add list items
		myList.add(15);
		myList.add(13);
		myList.add(99);
		myList.add(13);
		myList.add(13);
		myList.add(13);
		
		// Prints 6
		int answer = myList.size();
		System.out.println("Size of list: " + Integer.toString(answer));
		
		// Prints list
		myList.printList();
		
		// Removes duplicates
		myList.removeDuplicates();
		
		// Prints new list
		System.out.println("New List");
		myList.printList();
		
		// Prints 3
		int answer2 = myList.size();
		System.out.println("Size of list: " + Integer.toString(answer2));
	}
}


