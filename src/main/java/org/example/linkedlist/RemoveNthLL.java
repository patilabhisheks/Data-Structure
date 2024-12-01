package org.example.linkedlist;

import java.util.Stack;

public class RemoveNthLL {
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
        int arr[] = {1, 2, 3, 4, 5,6};
        int n=4;
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        Node dummy = new Node(0);
        dummy.next=head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=0;i<n;i++)
        {
                fast=fast.next;
        }
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        printList(dummy.next);
    }
    }
