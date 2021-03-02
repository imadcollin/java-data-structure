package trees;


public class EasyTree {

    Node root = null;

    public void traversal(Node node) {
        if (node != null) {

            traversal(node.left);
            System.out.print(" -> "+ node.data);
            traversal(node.right);
        }

    }

}
// Already Defined. 

// class Node {
//     int data;
//     Node left;
//     Node right;

//     public Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

class Printer{
    public static void main(String[] args) {
        EasyTree easyTree = new EasyTree(); 
        easyTree.root= new Node(1); 
        easyTree.root.left= new Node(2); 
        easyTree.root.left.left= new Node(3); 
        easyTree.root.left.right= new Node(5);
        
        easyTree.traversal(easyTree.root);
    }
}
