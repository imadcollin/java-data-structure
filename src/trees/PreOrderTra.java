package trees;

import java.util.Stack;

public class PreOrderTra {

    /** This was Recursuive.! */
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);

        }

    }

    public void preOrderIterative(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.data);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
    }
}

class Print {
    public static void main(String[] args) {

        PreOrderTra preOrderTra = new PreOrderTra();

        Node root = new Node(100);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.left = n1;
        root.right = n2;
        root.left.left = n3;
        root.left.left.left = n4;
        root.right.left = n5;
        System.out.println(".......PreOrder Rec......");

        preOrderTra.preOrder(root);
        System.out.println(".......PreOrder Iter......");
        preOrderTra.preOrderIterative(root);

    }
}
