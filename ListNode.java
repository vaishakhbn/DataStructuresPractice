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
	
}
