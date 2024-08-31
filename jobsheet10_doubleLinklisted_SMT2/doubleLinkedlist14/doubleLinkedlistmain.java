package doubleLinkedlist14;

public class doubleLinkedlistmain {
    public static void main(String[] args) throws Exception {
        //praktikum3
        doubleLinkedlist dll = new doubleLinkedlist();
        dll.print();

        System.out.println("==================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("==================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("==================================================");
        System.out.println("Data awal dari linked list adalah : " + dll.getFirst());
        System.out.println("Data akhir dari linked list adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada linked list adalah : " + dll.get(1));

        System.out.println("==================================================");

        // praktikum2
        // doubleLinkedlist dll = new doubleLinkedlist();
        // dll.print();

        // System.out.println("==================================================");
        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
        // dll.removeLast();
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
        // dll.remove(1);
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");

        // praktikum1
        // doubleLinkedlist dll = new doubleLinkedlist();
        // dll.print();
        // System.out.println("size : " + dll.size());

        // System.out.println("==================================================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
        // dll.add(40, 1);
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : " + dll.size());

        // System.out.println("==================================================");
    }

}
