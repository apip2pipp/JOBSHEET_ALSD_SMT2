package tugas3;

public class Vaksin {
    Node head;
    int size;

    Vaksin() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data, String nama) {
        if (isEmpty()) {
            head = new Node(null, data, nama, null);
        } else {
            Node temp = new Node(null, data, nama,
                    head);
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void addLast(int data, String nama) {
        if (isEmpty()) {
            head = new Node(null, data, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node nn = new Node(current, data, nama,
                    null);
            current.next = nn;
            size++;
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is still empty, cannot be deleted");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.nama + "completed vaccination");
            head = head.next;
            head.prev = null;
            size--;
        }
        // size--;
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Index value outside the limit");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {

                System.out.println("|" + tmp.data + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            size++;
            System.out.println("Remaining Queue : " + (size - 1));
            System.out.println("\nSuccessfully filled");
            size--;
        } else {
            System.out.println("Empty data linkedlist");
        }
    }
}
