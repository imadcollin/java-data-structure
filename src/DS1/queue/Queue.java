package DS1.queue;

public class Queue {
    private int arr[];
    private int front, rear;
    private int capacity;

    public Queue(int size) {
        arr = new int[size];
        capacity = 0;
        front = -1;
        rear = -1;
    }

    public void enqueu(int data) {

        if (!isEmpty()) {
            front = 0;
            arr[rear++] = data;

        } else
            System.out.println("The Queue is Full!");
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1);
    }

}
