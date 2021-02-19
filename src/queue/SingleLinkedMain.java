package queue;


public class SingleLinkedMain {
    public static void main(String[] args) {
        QueueLinkedList singleLinked = new QueueLinkedList();
        singleLinked.addNode(1);
        singleLinked.addNode(2);
        singleLinked.addNode(3);

        singleLinked.print();
        System.out.println("---------------");
        System.out.println("Node ID: " + singleLinked.getNodeId(5));
        System.out.println("---------------");
        singleLinked.removeFirstNode();
        System.out.println("-------Removed head--------");
        singleLinked.print();

        System.out.println("-------Empty--------");
        singleLinked.removeFirstNode();
        singleLinked.removeFirstNode();
        singleLinked.print();

        QueueLinkedList singleLinked2 = new QueueLinkedList();
        singleLinked2.addNode(1);
        singleLinked2.addNode(2);
        singleLinked2.addNode(3);
        System.out.println("-------List--------");
        singleLinked2.print();

        System.out.println("-------Remove Last--------");
        singleLinked2.removeLastNode();
        singleLinked2.print();

        System.out.println("-------Add Last--------");
        singleLinked2.addLast(4);
        singleLinked2.print();
       
        System.out.println("-------Add After--------");
        singleLinked2.addAfter(new Node(1), 2);;
        singleLinked2.print();
    }
}
