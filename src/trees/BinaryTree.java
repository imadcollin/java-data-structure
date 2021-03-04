package trees;

public class BinaryTree {
    Node root;
    Boolean visit = false;

    public Node addToRoot(Node current, int data) {

        if (current == null) {
            return new Node(data);
        }
        if (current.data > data) {
            current.right = addToRoot(current.right, data);
        }

        else if (current.data < data) {
            current.left = addToRoot(current.left, data);
        } else {
            return current;
        }
        return current;
    }

    public void buildTree(int data) {
        root = addToRoot(root, data);
    }

    public boolean contian(Node node, int data) {

        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        }
        if (node.data > data)
            return contian(node.left, data);
        else
            return (contian(node.right, data));

    }

    public Node removeNOde(Node node, int data) {

        if (node == null) {
            return null;
        }

        if (node.data > data) {
            node.left = removeNOde(node.left, data);
            return node;
        }
        if (node.right == null) {

            node.right = removeNOde(node.right, data);
            return node;
        }

        if (node.left == null && node.right == null) {
            return null;
        }
        if (node.left == null)
            return node.right;
        if (node.right == null)
            return node.left;
        return null;

    }

}
