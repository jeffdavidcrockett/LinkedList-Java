import java.util.*;


public class Testing {
	public static void main (String[] args) {
		
		LinkedList myList = new LinkedList();
		
		myList.add(15);
		myList.add(13);
		myList.add(99);
		myList.add(13);
		myList.add(13);
		myList.add(13);
		
		int answer = myList.size();
		System.out.println("Size of list: " + Integer.toString(answer));
		
		myList.printList();
		
		myList.removeDuplicates();
		
		System.out.println("New List");
		myList.printList();
		
		int answer2 = myList.size();
		System.out.println("Size of list: " + Integer.toString(answer2));

		
		
	}
}


