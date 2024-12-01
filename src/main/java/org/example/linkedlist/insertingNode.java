package org.example.linkedlist;

public class insertingNode {

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

        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        Node head = new Node(arr[0]);
//            System.out.println(head.data + " ");
        Node currentHead = head;
        Node newValue = new Node(x);
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            currentHead.next = newNode;
            currentHead = newNode;
//                printList(currentHead);
        }
//        printList(head);
        currentHead.next = newValue;
        printList(head);

        removeNode(head, 4);
        printList(head);
//        Node removeNode = new Node(4);
//        while (currentHead != null)
//        {
//
//
//            if(currentHead.next == removeNode)
//            {
//                currentHead.next=removeNode.next;
//                currentHead=removeNode.next;
//            }else {
//
////                System.out.println(currentHead.data + " ");
//                currentHead = currentHead.next;
//            }
//        }
//        printList(head);
//    }
    }

    private static Node removeNode(Node head, int i) {

        if(head !=null && head.data==i)
        {
            return head.next;
        }

        Node current = head;

        while (current != null && current.next != null)
        {
            if(current.next.data==i)
            {
                current.next=current.next.next;
                return head;
            }
            current=current.next;
        }
        return head;

    }
}
