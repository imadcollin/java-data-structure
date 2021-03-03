package trees;

public class RootNode {
    public static Node getRootNodes() {
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

        return root;
    }

}
