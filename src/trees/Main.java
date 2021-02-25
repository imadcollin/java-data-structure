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

        boolean check_1 = bt.contian(node, 4);
        boolean check_2 = bt.contian(node, 7);
        boolean check_3 = bt.contian(node, 10);
        System.out.println(check_1 + "\t" + check_2 + "\t" + check_3);
    }
}
