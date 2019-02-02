
public class LinkedList {
	private Node head;
	private int sizeOf;
	
	private class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		private int getData() {
			return data;
		}
		
		private Node getNext() {
			return next;
		}
		
		private void setData(int newData) {
			data = newData;
		}
		
		private void setNext(Node newNext) {
			next = newNext;
		}
	}
	
	public LinkedList() {
		this.head = null;
		this.sizeOf = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return sizeOf;
	}
	
	public void printList() {
		Node current = head;
		
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		sizeOf++;
	}
	
	public boolean search(int data) {
		Node current = head;
		boolean found = false;
		
		while (current != null && !found) {
			if (current.getData() == data) {
				found = true;
			} else {
				current = current.getNext();
			}
		}
		
		return found;
	}
	
	public void remove(int data) {
		Node current = head;
		Node previous = null;
		boolean found = false;
		
		if (search(data)) {
			while (!found) {
				if (current.getData() == data) {
					found = true;
				} else {
					previous = current;
					current = current.getNext();
				}
			}
			if (previous == null) {
				head = current.getNext();
			} else {
				previous.setNext(current.getNext());
			}
			sizeOf--;
		}
	}
	
	public void removeDuplicates() {
		Node node1 = head;
		Node node2 = null;
		
		while (node1 != null && node1.getNext() != null) {
			node2 = node1;
			while (node2.getNext() != null) {
				if (node1.getData() == node2.getNext().getData()) {
					node2.setNext(node2.getNext().getNext());
					sizeOf--;
				} else {
					node2 = node2.getNext();
				}
			}
			node1 = node1.getNext();
		}
	}
}