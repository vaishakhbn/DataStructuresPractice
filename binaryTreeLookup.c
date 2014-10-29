#include<stdio.h>
struct node
{
	int data;
	struct node* left;
	struct node* right;
};
struct node* newNode(int data)
{
	struct node* temp = (struct node*) malloc(sizeof(struct node));
	temp->data = data;
	temp->left= NULL;
	temp->right = NULL;
}
void printNodes(struct node* head)
{
	if(head==NULL)
		return;
	else
	{
		printNodes(head->left);
		printNodes(head->right);
		printf("d \n", head->data);
	}
}
void lookUpElement(struct node* head, int target)
{
	if(head == NULL)
		return;
	else
	{
		if(target==head->data)
			printf("%d Target Found\n", head->data);
		else if(target<head->data)
			lookUpElement(head->left,target);
		else
			lookUpElement(head->right,target);
	}
}
	

int main()
{
	struct node* head;
	head = newNode(4);
	head->left = newNode(2);
	head->right = newNode(3);
	head->left->left = newNode(1);
	head->left->right = newNode(0);
	head->right->left = newNode(6);
	head->right->right = newNode(7);
	lookUpElement(head,7);


}