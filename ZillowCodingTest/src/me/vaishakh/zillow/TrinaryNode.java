package me.vaishakh.zillow;

public class TrinaryNode 
{
	int data;
	TrinaryNode left;
	TrinaryNode middle;
	TrinaryNode right;
	public TrinaryNode newNode(int data)
	{
		TrinaryNode root = new TrinaryNode();
		root.data = data;
		return root;
	}

	public TrinaryNode insert(int data, TrinaryNode t)
	{
		if(t == null || t.data == 0)
			return newNode(data);
		if(data<t.data)
			t.left = insert(data,t.left);
		if(data == t.data)
			t.middle = insert(data,t.middle);
		if(data > t.data)
			t.right = insert(data, t.right);
		return t; 
	}

	public void display(TrinaryNode root) 
	{
		if(root == null)
		{
			return;
		}
			
		else
		{
			System.out.println(root.data);
			display(root.left);
			display(root.middle);
			display(root.right);
		}
	}
	public TrinaryNode delete(TrinaryNode t, int data)
	{
		if(t.data == data || t.data == 0)
		{
			if(t.middle!=null)
			{
				t.middle = null;
			}
			else if(t.middle==t.right)
			{
				t = null;
			}
		}
		else if (t.data < data)
		{
			if(t.right!=null)
				t.right = delete(t.right,data);
		}
		else if(t.data > data)
		{
			if(t.left!=null)
				t.left = delete(t.left,data);
		}
		return t;
	}
	
}

	
