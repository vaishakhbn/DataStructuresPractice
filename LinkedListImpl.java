package in.vaishakh.one;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head = head.insert(2, head);
		head = head.insert(1, head);
		head = head.insert(3, head);
		head = head.insert(7, head);
		
		head.display(head);
		
		head = head.delete(head);
		head.display(head);
		
	}

}

