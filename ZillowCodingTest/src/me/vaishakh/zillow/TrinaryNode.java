package me.vaishakh.zillow;

public class TrinaryNode 
{
	int data;
	TrinaryNode left;
	TrinaryNode middle;
	TrinaryNode right;
	public TrinaryNode(int i) 
	{
		this.data = i;
		this.left = this.middle = this.right =null;
	}

	public TrinaryNode() 
	{
		
	}

	public TrinaryNode newNode(int data)
	{
		TrinaryNode root = new TrinaryNode(data);
		return root;
	}

	public TrinaryNode insert(int data, TrinaryNode t)
	{
		if(t == null)
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
		if(t.data == data)
		{
			if(t.middle!=null)
			{
				t.middle = null;
			}
			else if((t.left==t.right))
			{
				t = null;
			}
			else if(t.left!=null && t.right!=null)
			{
				TrinaryNode successor = findReplacementNode(t.right);
				t.data = successor.data;
				return t;
			}
			else if(t.left!=null)
			{
				return t.left;
			}
			else if(t.right!=null)
			{
				return t.right;
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

	private TrinaryNode findReplacementNode(TrinaryNode t) 
	{
		if(t.left==null)
		{
			return t;
		}
		else
		{
			return findReplacementNode(t.left);
		}
	}
	
}

	
