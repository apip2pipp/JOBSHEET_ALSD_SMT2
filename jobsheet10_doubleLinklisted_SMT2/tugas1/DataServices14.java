package tugas1;

public class DataServices14 {
    Node14 head;
    int size;

    DataServices14() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item) {
        if (isEmpty()) {
            head = new Node14(null, item, null);
        } else {
            Node14 newNode14 = new Node14(null, item, head);
            head.prev = newNode14;
            head = newNode14;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node14 newNode14 = new Node14(current, item,
                    null);
            current.next = newNode14;
            size++;
        }
    }

    void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("iNDEX OUT OF BOUND");
        } else {
            Node14 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node14 newNode14 = new Node14(null, item,
                        current);
                current.prev = newNode14;
                head = newNode14;
            } else {
                Node14 newNode14 = new Node14(current.prev,
                        item, current);
                newNode14.prev = current.prev;
                newNode14.next = current;
                newNode14.prev.next = newNode14;
                current.prev = newNode14;
            }
        }
        size++;
    }

    void print() {
        if (!isEmpty()) {
            Node14 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nSuccesfull added");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is still empty, cannot remove");
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
            throw new Exception("INDEX OUT OF BOUND");
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

    void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value is out of bound");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node14 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public void searchNode14(int value) throws Exception {
        int i = 0;
        boolean search = false;
        Node14 current = head;

        if (head == null) {
            System.out.println("list stil empty like my heart now");
            return;
        }
        while (current != null) {
            if (current.data == value) {
                search = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (search)
            System.out.println("THE DATA HAS INDEX TO : " + i);
        else
            System.out.println("Data not in the list");
    }

    public void sortList() {
        Node14 current = null, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }
}
