#include<stdio.h>
struct node
{
	int data;
	struct node* next;
	};
void printReverse(struct node * head)
{
	if(head==NULL)
		return;
	printReverse(head->next);
	printf("%d ", head->data);
}

void push(struct node** head_ref, int data)
{
	struct node* new_node = (struct node*) malloc(sizeof(struct node));
	new_node->data = data;
	new_node->next = (*head_ref);
	(*head_ref)= new_node;
}

int main()
{
	struct node* head= NULL;
	push(&head, 1);
	push(&head,2);
	push(&head,4);
	push(&head,10);
	printReverse(head);


	}
