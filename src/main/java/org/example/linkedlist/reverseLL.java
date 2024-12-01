package org.example.linkedlist;

import java.util.Objects;
import java.util.Stack;

public class reverseLL {

    static class Node{
        int data ;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        Node head=new Node(arr[0]);
        Node current =head;

        for(int i=1;i<arr.length;i++)
        {
            Node newNode = new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }
        printList(head);

        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp!=null)
        {
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;

        while (temp!=null)
        {
            temp.data =stack.pop();
            temp=temp.next;
        }
        printList(head);


    }
}
