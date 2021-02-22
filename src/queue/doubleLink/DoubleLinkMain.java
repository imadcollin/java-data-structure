package queue.doubleLink;

public class DoubleLinkMain {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.inseretFirst(1);
        doubleLinkedList.inseretFirst(2);
        doubleLinkedList.inseretFirst(3);
        doubleLinkedList.print();
        
        
        System.out.println(doubleLinkedList.isEmpty()); 
        
        doubleLinkedList.insertEnd(4);
        doubleLinkedList.print();
    }
}
