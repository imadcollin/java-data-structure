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

    public void insertEnd(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (isEmpty()) {

            head = tail = newNode;
            size++;
            return;
        }

        DoubleNode current = head;
        while (current != null) {

            current = (DoubleNode) current.next;
        }
        newNode.next = null;
        newNode.prev = tail;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insertAfter(int after, int data) {

        DoubleNode current = head;
        DoubleNode temp = null;
        while (current != null) {
            if (current.data == after) {
                temp = current;
                break;
            }
            current = (DoubleNode) current.next;

        }
        if (temp == null) {
            System.out.println("The poisition was null, no idea where to insert...");
            return;
        }
        DoubleNode newNode = new DoubleNode(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        size++;
    }

    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("Nothing to delete the list is empty..!");
            return;
        }

        tail = (DoubleNode) tail.prev;
        tail.next = null;
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
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