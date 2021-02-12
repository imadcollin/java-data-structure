package stack;

import java.util.Arrays;

public class StackImpl {
    public int size = 0;
    public int capacity = 0;
    public int arr[];

    public StackImpl(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public void push(int el) {
        if (hasScpace())
            arr[size++] = el;
        else {
            increaseCapacity();
            arr[size++] = el;
        }
    }

    public int peek() {
        if (size <= 0)
            throw new IllegalArgumentException();
        return arr[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean hasScpace() {
        return capacity > size;
    }

    public void increaseCapacity() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

}
