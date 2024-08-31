package tugas2;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        root = insertRekusif(root, data);
    }

    // Fungsi Rekursif untuk memasukkan new data
    Node insertRekusif(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Untuk menaruh leaf apakah di kiri atau kanan
        if (data < root.data)
            root.left = insertRekusif(root.left,
                    data);
        else if (data > root.data)
            root.right = insertRekusif(root.right,
                    data);

        return root;
    }

    int getMin(Node node) {
        if (node == null) {
            System.out.println("Tree Empty");
            return 0;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    int getMax(Node node) {
        if (node == null) {
            System.out.println("Tree Empty");
            return 0;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    void printMinMax(Node node) {
        System.out.println(" ");
        int Min = getMin(node);
        System.out.println("Nilai Min : " + Min);
        int Max = getMax(node);
        System.out.println("Nilai Max : " + Max);
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successor.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Data Tree kosong!");
        }
        // find node(current) itu akan segera dihapus
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {// if there is 1 child(right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                        parent.right = current.left;
                    }
                }
            } else {// if there is 2 childs
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = root;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
