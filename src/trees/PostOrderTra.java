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
            System.out.print(" "+node.data);
        }

    }

}

class PrintOut {
    public static void main(String[] args) {
        PostOrderTra postOrderTra = new PostOrderTra();

        Node root = new Node(100);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.right = n6;

        postOrderTra.postOrder(root);
        System.out.println();
        postOrderTra.postOrderIteraticve(root);

    }
}
