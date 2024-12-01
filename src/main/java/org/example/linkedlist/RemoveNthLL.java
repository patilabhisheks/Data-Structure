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
        int arr[] = {1, 2, 3, 4, 5};
        int n=2;
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }
        printList(head);

//        Node currentHead= head;
//
//        Stack<Integer> temp = new Stack<>();
//        while (currentHead!=null)
//        {
//            temp.push(currentHead.data);
//            currentHead=currentHead.next;
//        }
//        currentHead=head;
//        int currentPosition=0;
//        while (currentHead!=null)
//        {
//            if(currentPosition==n)
//            {
//                break;
//            }else {
//                currentHead.data = temp.pop();
//                currentHead = currentHead.next;
//            }
//
//            currentPosition++;
//        }
//        printList(currentHead);
    }
    }
