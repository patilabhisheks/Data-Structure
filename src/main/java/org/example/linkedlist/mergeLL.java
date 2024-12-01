package org.example.linkedlist;

public class mergeLL {

    static class Node{
        int val;
        Node next;

        Node(int data)
        {
            this.val=data;
            this.next=null;
        }
    }

    public static Node createLinkedList(int[] arr) {
        // If the array is empty, return null
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Create the head node using the first element of the array
        Node head = new Node(arr[0]);
        Node current = head;

        // Create the rest of the nodes and link them
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;  // Move to the new node
        }

        return head;  // Return the head of the linked list
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();  // Print a new line after printing the list
    }
    public static Node mergeTwoLL(Node head1,Node head2)
    {
        Node newNode = new Node(0);
        Node current=newNode;

        while(head1!=null && head2!=null)
        {
            if(head1.val< head2.val)
            {
                current.next=head1;
                head1=head1.next;
            }else {
                current.next=head2;
                head2=head2.next;
            }
            current=current.next;
        }

        if(head1!=null)
        {
            current.next=head1;
        }else if (head2!=null){
            current.next=head2;
        }
        return newNode.next;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5};
        int arr2[]={2,4,5};

        Node head1=createLinkedList(arr1);
        Node head2=createLinkedList(arr2);
        printList(head1);
        printList(head2);
        Node mergeTwo=mergeTwoLL(head1,head2);
        printList(mergeTwo);
    }
}

