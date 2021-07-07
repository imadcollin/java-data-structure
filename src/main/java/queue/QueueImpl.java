package queue;

import java.util.Arrays;

public class QueueImpl {
    private int size;
    private int top;
    private int arr[];

    public QueueImpl(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void add(int el) {
        if (hasCapacitiy()) {
            arr[++top] = el;
        } else {
            doubleCapacity();
            arr[++top] = el;
        }
    }

    private void doubleCapacity() {
        int newLength = arr.length * 2;
        arr = Arrays.copyOf(arr, newLength);
    }

    public boolean hasCapacitiy() {
        return top < size;
    }

    public boolean isEmpty() {
        return size == 0 || top == -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else
            throw new IllegalArgumentException("No elements");
    }

    public int remove() {
        int temp = arr[0];
        if (!isEmpty()) {
            arr = Arrays.copyOfRange(arr, 1, arr.length);
            top--;
            return temp;
        } else
            throw new IllegalArgumentException("Nothing to remove");

    }

    public int poll() {
        int temp = arr[0];
        if (!isEmpty()) {
            arr = Arrays.copyOfRange(arr, 1, arr.length);
            top--;
            return temp;
        } else
            return (Integer) null;

    }

    public int size() {
        return arr.length;
    }

}
