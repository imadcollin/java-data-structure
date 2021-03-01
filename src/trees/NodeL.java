package trees;
public class NodeL {
    int data;
    String name;
    NodeL next;

    public NodeL(String name, int data) {
        this.name = name;
        this.data = data;
        next = null;
    }

}

class BinaryTree {
    BinaryTree left, right;
    int data;
    String name;

    public BinaryTree(String name, int data) {
        this.name = name;
        this.data = data;
        left = right = null;
    }

    public NodeL push(NodeL head, int data) {

        NodeL newNode = new NodeL(name, data);

        newNode.next = head;
        head = newNode;
        return head;

    }

}
