package DS1.queue;

import java.util.Arrays;

public class CircularQueue {
    private int arr[];
    private int front, rear, capacitiy;

    public CircularQueue(int size) {
        arr = new int[size];
        front = rear = -1;
        capacitiy = size;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        if (front == 0 && rear == capacitiy - 1)
            return true;
        if (front == rear + 1)
            return true;
        return false;
    }

    public void enqueu(int el) {
        if (isEmpty()) {
            front = 0;
            rear++;
            arr[rear] = el;

            System.out.println("Element: " + el + " is added");
        } else if (isFull()) {
            rear = 0;
            arr[rear] = el;

        } else {
            rear++;
            arr[rear] = el;
            System.out.println("Element: " + el + " is added");
        }
    }

    public void dequeue() {
        int el = -1;
        if (isEmpty()) {
            System.out.println("The queue is Empty the operation is not possible...!");
            System.exit(-1);

        } else if (front == capacitiy - 1) {
            el = arr[front];
            front = 0;
        } else if (front == rear) {
            el = arr[front];
            front = rear = -1;
        } else {

            el = arr[front];
            arr = Arrays.copyOfRange(arr, 1, capacitiy + 1);
        }
        System.out.println("Element: " + el + " is deleted...!");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The queue is Empty nothing to print...!");

        } else

            for (int i : arr) {
                System.out.print(i + " ");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.print();
        circularQueue.enqueu(1);
        circularQueue.enqueu(2);
        circularQueue.enqueu(3);
        circularQueue.enqueu(4);
        circularQueue.enqueu(5);
        circularQueue.print();

        circularQueue.dequeue();
        circularQueue.print();

        circularQueue.enqueu(1);
        circularQueue.enqueu(2);
        circularQueue.enqueu(3);
        circularQueue.enqueu(4);
        circularQueue.enqueu(5);

        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.print();

    }
}
