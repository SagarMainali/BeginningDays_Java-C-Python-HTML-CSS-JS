#include <stdlib.h>
#include <string.h>
#include <stdio.h>
struct Student
{
    int rollnumber;
    char name[100];
    char phone[100];
    float percentage;
    struct Student *next;

} * head;
void insert(int rollnumber, char *name, char *phone, float percentage)
{

    struct Student *student = (struct Student *)malloc(sizeof(struct Student));
    student->rollnumber = rollnumber;
    strcpy(student->name, name);
    strcpy(student->phone, phone);
    student->percentage = percentage;
    student->next = NULL;

    if (head == NULL)
    {
        // if head is NULL
        // set student as the new head
        head = student;
    }
    else
    {
        // if list is not empty
        // insert student in beginning of head
        student->next = head;
        head = student;
    }
}
void search(int rollnumber)
{
    struct Student *temp = head;
    while (temp != NULL)
    {
        if (temp->rollnumber == rollnumber)
        {
            printf("\n---Student record found---\n");
            printf("\nRoll Number: %d\n", temp->rollnumber);
            printf("Name: %s\n", temp->name);
            printf("Phone: %s\n", temp->phone);
            printf("Percentage: %0.4f\n", temp->percentage);
            return;
        }
        temp = temp->next;
    }
    printf("---Student with roll number %d has never been recorded---\n", rollnumber);
}
void update(int rollnumber)
{

    struct Student *temp = head;
    while (temp != NULL)
    {

        if (temp->rollnumber == rollnumber)
        {
            printf("\n---Record with roll number %d Found ---\n", rollnumber);
            printf("Enter new name: ");
            scanf("%s", temp->name);
            printf("Enter new phone number: ");
            scanf("%s", temp->phone);
            printf("Enter new percentage: ");
            scanf("%f", &temp->percentage);
            printf("\n---Updated Successfully---\n");
            return;
        }
        temp = temp->next;
    }
    printf("\n---Student with roll number %d is not found ---\n", rollnumber);
}
void Delete(int rollnumber)
{
    struct Student *temp1 = head;
    struct Student *temp2 = head;
    while (temp1 != NULL)
    {

        if (temp1->rollnumber == rollnumber)
        {

            printf("\n---Record with roll number %d Found---\n", rollnumber);

            if (temp1 == temp2)
            {
                // this condition will run if
                // the record that we need to delete is the first node
                // of the linked list
                head = head->next;
                free(temp1);
            }
            else
            {
                // temp1 is the node we need to delete
                // temp2 is the node previous to temp1
                temp2->next = temp1->next;
                free(temp1);
            }

            printf("-----Record Successfully Deleted-----\n");
            return;
        }
        temp2 = temp1;
        temp1 = temp1->next;
    }
    printf("\n---Student with roll number %d is not found---\n", rollnumber);
}
void display()
{
    struct Student *temp = head;
    if (temp != NULL)
    {
        while (temp != NULL)
        {
            printf("\nRoll Number: %d\n", temp->rollnumber);
            printf("Name: %s\n", temp->name);
            printf("Phone: %s\n", temp->phone);
            printf("Percentage: %0.4f\n\n", temp->percentage);
            temp = temp->next;
        }
    }
    else
        printf("\n---No students record added yet---\n");
}
int main()
{
    head = NULL;
    int choice;
    char name[100];
    char phone[100];
    int rollnumber;
    float percentage;
    printf("\n***Student Management System***\n");
    do
    {
        printf("\nPress '1' to insert student details.\nPress '2' to search for student details.\nPress '3' to delete student details.\nPress '4' to update student details.\nPress '5' to display all student details.\nPress '6' to exit.\n");
        printf("\nEnter Choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("------Yor are adding a new student------\n");
            printf("Enter roll number: ");
            scanf("%d", &rollnumber);
            printf("Enter name: ");
            scanf("%s", &name);
            printf("Enter phone number: ");
            scanf("%s", &phone);
            printf("Enter percentage: ");
            scanf("%f", &percentage);
            insert(rollnumber, name, phone, percentage);
            printf("\n---Student record added successfully---\n");
            break;
        case 2:
            printf("Enter roll number to search: ");
            scanf("%d", &rollnumber);
            search(rollnumber);
            break;
        case 3:
            printf("Enter roll number to delete: ");
            scanf("%d", &rollnumber);
            Delete(rollnumber);
            break;
        case 4:
            printf("Enter roll number to update: ");
            scanf("%d", &rollnumber);
            update(rollnumber);
            break;
        case 5:
            display();
            break;
        case 6:
            exit(0);
            break;
        default:
            printf("Invalid choice!!! The choices are ranged from 1 to 6 only.\n");
        }

    } while (choice != 0);
    return 0;
}