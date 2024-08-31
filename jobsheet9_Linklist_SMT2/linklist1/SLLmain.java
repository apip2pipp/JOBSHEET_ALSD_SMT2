package linklist1;

public class SLLmain {
    public static void main(String[] args) {
        linkedList myLinkedList = new linkedList();
        myLinkedList.print();
        myLinkedList.addFirst(890);
        myLinkedList.print();
        myLinkedList.addLast(760);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 999);
        myLinkedList.print();
        myLinkedList.insertAt(3, 833);
        myLinkedList.print();
        
        System.out.println("Data pada indeks ke-1=" + myLinkedList.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + myLinkedList.indexOf(760));

        myLinkedList.remove(999);
        myLinkedList.print();
        myLinkedList.removeAt(0);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
    }
}
