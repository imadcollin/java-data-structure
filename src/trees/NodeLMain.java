package trees;

public class NodeLMain {
    public static void main(String[] args) {
        BinaryTree2 binaryTree = new BinaryTree2();
        binaryTree.push("First_node", 1);
        binaryTree.push("Second_node", 2);
        binaryTree.push("Third_node", 3);
        binaryTree.push("Forth_node", 4);

        System.out.println(binaryTree.size());
        binaryTree.print();
    }
}
