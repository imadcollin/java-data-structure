package queue;

import java.util.Random;

public class QueueLinkedList {
    private Node front, rear;
    private int size;

    private class Node {
        int data;
        int id;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.id = new Random().nextInt(1000);
        }

    }

    public int getNodeId(int data) {
        if (front.data == data)
            return front.id;
        else {
            Node node = front;
            while (node.next != null) {
                if (node.data == data)
                    return node.id;
                node = node.next;
            }
        }
        return -1;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        }

        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void addLast(int data) {
        if (front == null)
            front.data = data;
        else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(data);
            current.next = newNode;
        }
    }

    public void removeFirstNode() {
        if (front != null)
            front = front.next;
        else
            System.out.println("Queue is Empty");

    }

    public void removeLastNode() {
        if (rear == null)
            System.out.println("Only Front found");
        else if (front == null && rear == null)
            System.out.println("Queue is empty ");

        else {
            Node currNode = front;
            Node temp = front;
            while (currNode.next != null) {
                temp = currNode;
                currNode = currNode.next;
            }
            currNode = temp;
            currNode.next = null;
        }
    }

    public void print() {

        if (front == null) {
            System.out.println("List is emply");
            return;
        } else {
            Node current = front;
            while (current != null) {
                System.out.println(current.data + " " + current.id);
                current = current.next;
            }
        }
    }

    public QueueLinkedList() {
        rear = null;
        front = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}