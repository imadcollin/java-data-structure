package stack;

public class Main {
    public static void main(String[] args) {

        StackImpl stack = new StackImpl(5);

        stack.push(1);
        stack.push(2);

        System.out.println(stack.size);
        System.out.println(stack.peek());

        System.out.println("-----------------");
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("-----------------");
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size);
        System.out.println(stack.peek());

        System.out.println("-----------------");
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());

    }
}
