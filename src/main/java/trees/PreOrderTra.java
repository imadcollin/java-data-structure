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

        System.out.println("-------PreOrder Rec--------");

        preOrderTra.preOrder(RootNode.getRootNodes());

        System.out.println("-------PreOrder Iter--------");
        preOrderTra.preOrderIterative(RootNode.getRootNodes());

    }
}
