package tugas2;

public class book14 {
    Node14 head;
    int size;

    book14() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String item) {
        if (isEmpty()) {
            head = new Node14(null, item, null);
        } else {
            Node14 newNode = new Node14(null, item,
                    head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(String item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node14 newNode1 = new Node14(current, item,
                    null);
            current.next = newNode1;
            size++;
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, Tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai Index diluar batas");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node14 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void peek() {
        Node14 tmp = head;
        System.out.println("The data in the top position are " + head.data);
    }

    void print2() {
        if (!isEmpty()) {
            Node14 tmp = head;
            int a = 0;
            while (tmp != null) {
                System.out.println((a + 1) + ". " + tmp.data);
                tmp = tmp.next;
                a++;
            }
            size++;
            System.out.println("\nSuccesfully in");
        } else {
            System.out.println("Empty data");
        }
    }
}
