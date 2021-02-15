package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.size());   // 3

        System.out.println(queue.peek());   // 1
        System.out.println(queue.poll());   // 1
        System.out.println(queue.remove()); // 2
    }

}
