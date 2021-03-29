package DS1.stack;

public class Stack {
    private int arr[];
    private int top;
    private int capacitiy;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacitiy = size;

    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top >= capacitiy;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            arr[top] = data;
        } else
            System.out.println("Can't push not space!");
    }

}
