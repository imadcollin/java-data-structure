package queue;

import java.util.Random;

public class Node {
    public int data;
    public int id;
   public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.id = new Random().nextInt(1000);
    }

}
