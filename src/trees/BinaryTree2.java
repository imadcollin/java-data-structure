package trees;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree2 {
    Node left, right;
    Node root;
    Queue<Node> queue;

    public BinaryTree2() {

        root = null;
        queue = new LinkedList<>();

    }

    public void push(int data) {

        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {

            queue.add(root);

            while (true) {
                Node node = queue.remove();
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
        queue.forEach(s -> System.out.println("Data: " + s.data));
    }


}
