package trees;

public class InOrderTra {

    public static void travesel(Node node) {
        if (node == null) {
            System.out.println("Empty...!");
            return;
        } else {
            if (node.left != null) {

                travesel(node.left);
            }
            System.out.println("Data:" + node.data);

            if (node.right != null) {
                travesel(node.right);
            }
        }
    }
}
