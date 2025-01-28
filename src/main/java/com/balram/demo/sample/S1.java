package com.balram.demo.sample;

public class S1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class CircularLoopDetector {
        public static boolean hasLoop(Node head) {
            Node slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;        // Move slow by 1 step
                fast = fast.next.next;  // Move fast by 2 steps

                if (slow == fast) {
                    return true; // Loop detected
                }
            }
            return false; // No loop
        }

        public static void main(String[] args) {
            // Example linked list
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; // Creates a loop

            if (hasLoop(head)) {
                System.out.println("The linked list contains a loop.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }
        }
    }
}
