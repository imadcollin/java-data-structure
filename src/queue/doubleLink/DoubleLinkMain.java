package queue.doubleLink;

public class DoubleLinkMain {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.inseretFirst(1);
        doubleLinkedList.inseretFirst(2);
        doubleLinkedList.inseretFirst(3);
        doubleLinkedList.print();
        
        
        System.out.println(doubleLinkedList.isEmpty()); 
        
        System.out.println("------- Insert End -------"); 
        doubleLinkedList.insertEnd(4);
        doubleLinkedList.print();
        System.out.println("------- Insert After -------"); 

        doubleLinkedList.insertAfter(2, 7);
        doubleLinkedList.print();

        doubleLinkedList.insertAfter(50, 7);
        doubleLinkedList.print();
        
        System.out.println("------- Delete End -------"); 
        doubleLinkedList.deleteEnd();; 
        doubleLinkedList.print();
        
        System.out.println("------- Delete First -------"); 
        doubleLinkedList.deleteFirst();; 
        doubleLinkedList.print();


    }
}
