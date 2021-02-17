package queue;

public class SingleLinkedMain {
    public static void main(String[] args) {
        QueueLinkedList singleLinked= new QueueLinkedList(); 
        singleLinked.addNode(1);
        singleLinked.addNode(2);
        singleLinked.addNode(3);

        singleLinked.print();
        singleLinked.removeNode(2);
        System.out.println("---------------");
        singleLinked.print();
        System.out.println("Node ID: "+ singleLinked.getNodeId(5));
    }
}
