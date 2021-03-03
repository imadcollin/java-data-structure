package trees;

import java.util.Stack;

public class PostOrderTra {
    static Stack<Node> s1, s2;

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.data);
        }

    }

    public void postOrderIteraticve(Node root) {
        s1 = new Stack<>();
        s2 = new Stack<>();
        if (root == null)
            return;

        s1.push(root);
        while (!s1.empty()) {
            Node node = s1.pop();
            s2.push(node);

            if (node.left != null)
                s1.push(node.left);
            if (node.right != null)
                s1.push(node.right);

        }
        while (!s2.empty()) {
            Node node = s2.pop();
            System.out.print(" " + node.data);
        }

    }

}

class PrintOut {
    public static void main(String[] args) {
        PostOrderTra postOrderTra = new PostOrderTra();

        System.out.println("-------PostOrder Rec--------");
        postOrderTra.postOrder(RootNode.getPostOrderRootNode());
        System.out.println();
        System.out.println("-------PostOrder Iter--------");
        postOrderTra.postOrderIteraticve(RootNode.getPostOrderRootNode());

    }
}
