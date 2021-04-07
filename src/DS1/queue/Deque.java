package DS1.queue;

import java.util.Arrays;

public class Deque {
    private int arr[];
    private int front, rear, size;

    public Deque(int size) {
        arr = new int[size];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1);
    }

    void insertFront(int data) {
        if (isFull()) {
            System.out.println("The Deque is full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        arr[front] = data;
    }

    void insertRear(int data) {
        if (isFull()) {
            System.out.println("The Deque is full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear + 1;
        }
        arr[rear] = data;
    }

    void print(int arr[]) {
        Arrays.asList(arr).stream().forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {

    }
}
