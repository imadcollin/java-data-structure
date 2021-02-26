package trees;

import java.util.ArrayList;
import java.util.List;

public class NodeL<T> {
    int data;
    String name;
    NodeL left;
    NodeL right;
    private NodeL<T> parent = null;
    private List<NodeL<T>> childern = new ArrayList<>();

    public NodeL(String name, int data) {
        this.name = name;
        this.data = data;
        left = right = null;
    }

    public NodeL addChild(String name, int data) {
        NodeL newNodeL = new NodeL(name, data);
        if (parent == null) {
            parent = newNodeL;
        } else {
            if (data < parent.data) {
                parent.left = newNodeL;
                return newNodeL;
            }
            parent.right = newNodeL;
            return newNodeL;

        }

        this.childern.add(newNodeL);
        System.out.println("test");
        return newNodeL;
    }

    public void print() {

        this.childern.stream().forEach(node -> System.out.println("Name: " + node.name + " \t ID:" + node.data));
    }

    public int size() {
        return childern.size();
    }
}
