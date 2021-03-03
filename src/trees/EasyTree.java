package trees;

public class EasyTree {

    Node root = null;

    public void traversal(Node node) {
        if (node != null) {

            traversal(node.left);
            System.out.print(" "+node.data);
            traversal(node.right);
        }

    }

}

class Printer {
    public static void main(String[] args) {
        EasyTree easyTree = new EasyTree();
        easyTree.traversal(RootNode.getRootNodes());
    }
}
