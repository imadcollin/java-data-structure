package trees;

public class PostOrderTra {

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.data);
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

    }
}
