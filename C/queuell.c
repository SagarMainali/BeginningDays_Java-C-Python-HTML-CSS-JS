// implementation of queue using linked list
#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node *front=NULL,*rear=NULL;
void enqueue()
{
    struct node *ptr,*temp;
    int data;
    ptr = (struct node*)malloc(sizeof(struct node));
    if(ptr==NULL)
    {

 

        printf("\noverflow\n");
    }
    else
    {
        printf("\nEnter data to be inserted into Q:\n");
        scanf("%d",&data);
        ptr->data=data;
        ptr->next=NULL;
        if(front==NULL && rear==NULL)
        {

 

            front=ptr;
            rear=ptr;
        }
        else
        {
            temp = rear;
            temp->next=ptr;
            rear=ptr;
        }
    }
}
void dequeue()
{
    struct node *temp;
    if(front==NULL)
    {
        printf("\nUnderflow: queue is empty\n ");
    }
    else
    {
        if(front!=rear)
        {

 

            temp = front;
            front = temp->next;
            free(temp);
        }
        else
        {
            temp = front;
            front=NULL;
            rear=NULL;
            free(temp);
        }
    }
}

 

void display()
{
    struct node *temp;
    if(front==NULL && rear==NULL)
    {

 

        printf("\nQueue is empty\n");
    }
    else
    {
        temp = front;
        printf("\nThe Queue contains following elements:\n");
        while(temp!=NULL)
        {
            printf("%d\t",temp->data);
            temp = temp->next;
        }

 

    }
}

 

void main()
{
    int choice;
    char ch='y';
    while(ch=='y')
    {
        printf("\nPRESS 1::ENQUEUE 2::DEQUEUE 3::DISPLAY\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: enqueue();break;
            case 2: dequeue();break;
            case 3: display();break;
            default: printf("\nInvalid operation\n");
        }
        getchar();
        printf("\nDo you want to continue(y or n)\n");
        scanf("%c",&ch);
    }
}