package queue.doubleLink;

import queue.Node;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;

    }

    public void inseretFirst(int data) {
        DoubleNode newDoubleNode = new DoubleNode(data);
        if (head == null) {

            head = tail = newDoubleNode;
            head.prev = null;
            tail.next = null;
        }

        else {
            tail.next = newDoubleNode;
            newDoubleNode.prev = tail;
            tail = newDoubleNode;
            tail.next = null;
        }
        size++;

    }

    public void print() {
        if (head == null) {

            System.out.println("Empty...");
            return;
        } else {
            DoubleNode current = head;
            while (current != null) {
                System.out.println("id:" + current.id + " - data:" + current.data);
                current = (DoubleNode) current.next;
            }
        }

    }
}

class DoubleNode extends queue.Node {
    Node prev;

    public DoubleNode(int data) {
        super(data);
        this.prev = null;
    }

}