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

    public void removeNode(int data) {

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