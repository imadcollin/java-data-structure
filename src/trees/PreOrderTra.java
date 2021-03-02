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

        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.data);
            if (node.left != null) {
                stack.push(temp);
            }
            if (node.right != null) {
                stack.push(temp);
            }
        }
    }
}
