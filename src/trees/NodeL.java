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

class BinaryTree {
    NodeL left, right;
    NodeL root;

    public BinaryTree() {

        root = null;
    }

    public void push(String name, int data) {

        NodeL newNode = new NodeL(name, data);
        if (root == null) {
            root = newNode;
            return;
        }
        else {

            Queue<NodeL> queue = new LinkedList<>();
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

}
