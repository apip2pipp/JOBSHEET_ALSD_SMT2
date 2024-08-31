    package linklist1;

    import org.w3c.dom.Node;

    public class linkedList {
        node14 head; // posisi awal linked list
        node14 tail; // posisi akgir linked list

        public boolean isEmpty() {
            return head == null;
        }

        public void print() {
            if (!isEmpty()) {
                node14 tmp = head;
                System.out.print("Isi Linked List:\t");
                while (tmp != null) {
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println("");
            } else {
                System.out.println("Linked List Kosong");
            }
        }

        public void addFirst(int input) {
            node14 ndInput = new node14(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                ndInput.next = head;
                head = ndInput;
            }
        }

        public void addLast(int input) {
            node14 ndInput = new node14(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
        }

        public void insertAfter(int key, int input) {
            node14 ndInput = new node14(input, null);
            node14 temp = head;
            do {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == null)
                        tail = ndInput;
                    break;
                }
                temp = temp.next;
            } while (temp != null);
        }

        public void insertAt(int index, int input) {
            if (index < 0) {
                System.out.println("indeks salah");
            } else if (index == 0) {
                addFirst(input);
            } else {
                node14 temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = new node14(input, temp.next);
                if (temp.next.next == null)
                    tail = temp.next;
            }
        }

        public int getData(int index) {
            node14 currnetNode14 = head;

            for (int i = 0; i < index; i++) {
                currnetNode14 = currnetNode14.next;
            }
            return currnetNode14.data;
        }

        public int indexOf(int key) {
            node14 currentNode14 = head;
            int index = 0;
            while (currentNode14 != null && currentNode14.data != key) {
                currentNode14 = currentNode14.next;
                index++;
            }

            if (currentNode14 == null) {
                return -1;
            } else {
                return index;
            }
        }

        public void removeFirst() {
            if (isEmpty()) {
                System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }

        public void removeLast() {
            if (isEmpty()) {
                System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
            } else {
                node14 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }

        public void remove(int key) {
            if (isEmpty()) {
                System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
            } else {
                node14 temp = head;
                while (temp != null) {
                    if ((temp.data == key) && (temp == head)) {
                        this.removeFirst();
                        break;
                    } else if (temp.next.data == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }

        public void removeAt(int index) {
            if (index == 0) {
                removeFirst();
            } else {
                node14 temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }