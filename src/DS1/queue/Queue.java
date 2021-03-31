package DS1.queue;

import java.util.Arrays;

public class Queue {
    private int arr[];
    private int front, rear;
    private int capacity;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    public void enqueu(int data) {

        if (isEmpty()) {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = data;
        } else if (isFull()) {
            System.out.println("The Queue is Full!");
        } else {
            rear++;
            arr[rear] = data;
        }
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty..");
            return -1;
        } else {

            int ele = arr[0];
            arr = Arrays.copyOfRange(arr, 1, arr.length);
            return ele;
        }

    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Is Full: " + queue.isFull());

        queue.enqueu(1);
        queue.enqueu(2);
        queue.enqueu(3);
        queue.enqueu(4);
        queue.enqueu(5);
        queue.enqueu(6);

        queue.print();
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Is Full: " + queue.isFull());

        System.out.println("Deleted: " + queue.dequeue());
        System.out.println("Deleted: " + queue.dequeue());
        System.out.println("Deleted: " + queue.dequeue());
        queue.print();
    }
}
