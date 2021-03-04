package trees;

public class BinaryTree2Main {
    public static void main(String[] args) {
        BinaryTree2 binaryTree = new BinaryTree2();
        binaryTree.push(1);
        binaryTree.push(2);
        binaryTree.push(3);
        binaryTree.push(4);

        System.out.println("--------Size----------");
        System.out.println(binaryTree.size());
        
        System.out.println("--------Print----------");
        binaryTree.print();
        
        System.out.println("-------Traversal--------");
        
        InOrderTra.travesel(binaryTree.root);
    }
}
