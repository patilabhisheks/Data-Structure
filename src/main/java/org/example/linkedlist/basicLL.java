package org.example.linkedlist;

import org.w3c.dom.Node;

public class basicLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static void main(String args[])
    {
        basicLL list = new basicLL();
        Node n = list.new Node(1);
        System.out.println(n);
        System.out.println("Next node: " + n.next);
        System.out.println("Node node: " + n.data);

    }
}
