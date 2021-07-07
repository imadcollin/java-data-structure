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

    public int pop() {
        if (isEmpty()) {

            System.exit(1);
        }

        return arr[top--];
    }

    public void print(int arr) {
        for (int i : this.arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Size: " + stack.size());
        stack.pop();
        System.out.println("Size after 1 pop: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Emptry: " + stack.isEmpty());
        System.out.println("IsFull: " + stack.isFull());
        System.out.println("Last Pop: " + stack.pop());
        System.out.println("Is Emptry: " + stack.isEmpty());

    }
}
