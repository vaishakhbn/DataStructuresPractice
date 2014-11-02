package me.vaishakh.zillow;
public class TrinaryTree {

	public static void main(String[] args) {
		/*
		  5
		/ | \
		4 5 9
		/ 	/
		2 	7
		|
		2
		 */
		TrinaryNode root = new TrinaryNode();
		root = root.insert(5,root);
		root = root.insert(4, root);
		root = root.insert(5, root);
		root = root.insert(9, root);
		root = root.insert(2, root);
		root = root.insert(7, root);
		root.display(root);
		root = root.delete(root, 7);
		System.out.println("After 1 deletion");
		root.display(root);
		root = root.delete(root, 2);
		System.out.println("After 1 deletion");
		root.display(root);
		root = root.delete(root, 9);
		System.out.println("After 1 deletion");
		root.display(root);
		root = root.delete(root, 5);
		System.out.println("After 1 deletion");
		root.display(root);
		root = root.delete(root, 4);
		System.out.println("After 1 deletion");
		root.display(root);
		root = root.delete(root, 5);
		System.out.println("After 1 deletion");
	}

}
