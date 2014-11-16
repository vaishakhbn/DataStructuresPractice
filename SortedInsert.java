package in.vaishakh.one;

public class SortedInsert {
	public static void main(String args[])
	{
		ListNode root = new ListNode(2);
		 root = root.insert(3, root);
		 root = root.insert(4, root);
		 root = root.insert(5, root);
		 root = root.sortedInsert(6,root);
		 root = root.sortedInsert(1, root);
		 root.display(root);
		
	}

}
