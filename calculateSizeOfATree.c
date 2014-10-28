#include<stdio.h>

struct node
{
	int data;
	struct node* left;
	struct node* right;
	};
struct node* newNode(int new_data)
{
	struct node* temp = (struct node*)malloc(sizeof(struct node));
	temp->data=new_data;
	temp->left = NULL;
	temp->right = NULL;
	return temp;
	}
int size(struct node* root)
{
	if(root==NULL)
		return 0;
	else
	{
		return size(root->left)+1+size(root->right);
	}
}
int main()
{
	struct node* root = newNode(1);
	root->left = newNode(2);
	root->right = newNode(3);
	root->left->left = newNode(4);
	root->left->right = newNode(5);
	printf("Size of the tree is %d", size(root));
	return 0;
	}


