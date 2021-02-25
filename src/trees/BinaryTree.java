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

    public void trasverse(Node node) {
        if (node != null) {
            trasverse(node.left);
            System.out.println("The data is :" + node.data);
            trasverse(node.right);
        }
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

}
