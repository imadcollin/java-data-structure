package stack;

import java.util.Arrays;

public class StackImpl {
    public int size;
    public int top;
    public int arr[];

    public StackImpl(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int el) {
        if (hasSpace()) {
            arr[++top] = el;
        } else {
            increaseCapacity();
            arr[++top] = el;
        }
    }

    public int peek() {
        if (size <= 0)
            throw new IllegalArgumentException();
        return arr[top];
    }

    public int size() {
        return size;
    }

    public boolean hasSpace() {
        return top < size - 1;
    }

    public void increaseCapacity() {
        size *= 2;
        arr = Arrays.copyOf(arr, size);
    }

}
