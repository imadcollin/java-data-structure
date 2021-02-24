package trees;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.buildTree(1);
        bt.buildTree(2);
        bt.buildTree(3);
        bt.buildTree(7);
        bt.buildTree(6);
        Node node = new Node(4);
        node.left = new Node(1);
        node.right = new Node(10);
     
        bt.trasverse(node);
    }
}
