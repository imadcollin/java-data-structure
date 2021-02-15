package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // queueUtil();
        QueueImpl();
    }

    private static void QueueImpl() {
        QueueImpl queue = new QueueImpl(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.size()); // 3
        System.out.println(queue.poll()); // 1
        System.out.println(queue.remove()); // 2
        System.out.println(queue.peek()); // 3

    }

    public static void queueUtil() {
        Queue queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.size()); // 3
        System.out.println(queue.poll()); // 1
        System.out.println(queue.remove()); // 2
        System.out.println(queue.peek()); // 3
    }

}
