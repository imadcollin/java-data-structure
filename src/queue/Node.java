package queue;

import java.util.Random;

public class Node {
    int data;
    int id;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.id = new Random().nextInt(1000);
    }

}
