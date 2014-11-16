package in.vaishakh.one;

public class ListNode 
{
	int data;
	ListNode next;
	ListNode(int data)
	{
		this.data = data;
		this.next = null;
	}
	public ListNode insert(int data, ListNode head)
	{
		ListNode temp = new ListNode(data);
		temp.next=head;
		head = temp;
		return head;
		
	}
	public void display(ListNode head)
	{
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public ListNode delete(ListNode head)
	{
		ListNode temp = head;
		ListNode cur = head;
		temp = head.next;
		while(temp.next!=null)
		{
			cur = cur.next;
			temp = temp.next;
		}
		cur.next = null;
		return head;
	}
	public ListNode sortedInsert(int i, ListNode root) 
	{
		ListNode cur = root;
		ListNode temp = new ListNode(i);
		if(root==null)
		{
			return temp;
		}
		else if(temp.data > root.data)
		{
			temp.next = root;
			root = temp;
			return root;
		}
		else
		{
			while(cur.next!=null && temp.data<cur.next.data)
			{
				cur = cur.next;
			}
			temp.next = cur.next;
			cur.next = temp;
			return root;
		}
		
	}
	
}
