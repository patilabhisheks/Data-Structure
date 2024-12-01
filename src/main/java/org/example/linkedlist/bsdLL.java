package org.example.linkedlist;

 public class bsdLL {
   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
        public static void main(String[] args) {

            int[] arr = {1,2,3,4,5};

            Node head = new Node(arr[0]);
//            System.out.println(head.data + " ");
            Node currentHead = head;

            for(int i=1;i<arr.length;i++)
            {
                Node newNode = new Node(arr[i]);
                currentHead.next=newNode;
                currentHead=newNode;
//                printList(currentHead);
            }
            printList(head);

        }
    }

