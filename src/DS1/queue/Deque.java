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

    void print(int arr[]) {
        Arrays.asList(arr).stream().forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {

    }
}
