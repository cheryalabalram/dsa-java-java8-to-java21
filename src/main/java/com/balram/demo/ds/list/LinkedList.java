package com.balram.demo.ds.list;

public class LinkedList {

    private Node headNode;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node node = headNode;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.setNext(headNode);
        headNode = node;
    }

    public void insertWithIndex(int index, int data) {
        Node node = new Node(data); //13
        Node n = headNode;
        for (int i = 0; i < index - 1; i++) {
            n = n.getNext();
        }
        node.setNext(n.getNext()); //0, 12 13
        n.setNext(node);
    }

    public void removeIndexAt(int index) {
        if (index == 0) {
            headNode = headNode.getNext();
        } else {
            Node actualHead = headNode;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                actualHead = actualHead.getNext();
            }
            temp = actualHead.getNext();
            actualHead.setNext(temp.getNext());
        }
    }

    public void reverseIteratively() {
        Node prev = null;
        Node current = headNode;
        Node next = null;

        while (current != null) {
            next = current.getNext();  // Save the next node
            current.setNext(prev);  // Reverse the link
            prev = current;       // Move prev to current
            current = next;       // Move to next node
        }

        headNode = prev; // prev becomes the new head
    }

    public void print() {
        Node node = headNode;
        while (node != null && node.getNext() != null) {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        }
        System.out.println();
    }

}
