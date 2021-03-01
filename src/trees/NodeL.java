package trees;

import java.util.LinkedList;
import java.util.Queue;

public class NodeL {
    int data;
    String name;
    NodeL next, left, right;

    public NodeL(String name, int data) {
        this.name = name;
        this.data = data;
        next = null;
        left = right = null;
    }
}

class BinaryTree2 {
    NodeL left, right;
    NodeL root;
    Queue<NodeL> queue;

    public BinaryTree2() {

        root = null;
        queue = new LinkedList<>();

    }

    public void push(String name, int data) {

        NodeL newNode = new NodeL(name, data);
        if (root == null) {
            root = newNode;
            return;
        } else {

            queue.add(root);

            while (true) {
                NodeL node = queue.remove();
                if (node.left != null && node.right != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    if (node.left == null) {
                        node.left = newNode;
                        queue.add(node.left);
                    } else {
                        node.right = newNode;
                        queue.add(node.right);
                    }
                    break;
                }
            }

        }

    }

    public int size() {
        return queue.size();
    }

    public void print() {
        queue.forEach(s -> System.out.println("Name: " + s.name + " Data: " + s.data));
    }

    public void travesel(NodeL node) {
        if (root == null) {
            System.out.println("Empty...!");
            return;
        } else {
            if (node.left != null) {

                travesel(node.left);
            }
            System.out.println("Name: " + node.name + " Data:" + node.data);

            if (node.right != null) {
                travesel(node.right);
            }
        }
    }

}
