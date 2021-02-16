package queue;

public class QueueLinkedList {
    private Node front, rear;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {

    }

    public void removeNode(int data) {

    }

    public void print() {

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