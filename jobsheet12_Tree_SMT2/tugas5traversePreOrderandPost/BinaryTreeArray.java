package tugas5traversePreOrderandPost;

public class BinaryTreeArray {

    int[] data;
    int idxlast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data[], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }

    void addData(int value, int temp) {
        data[temp] = value;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + "  ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void preOrder(int idxStart) {
        if (idxStart <= idxlast) {
            System.out.print(data[idxStart] + "  ");
            preOrder(2 * idxStart + 1);
            preOrder(2 * idxStart + 2);
        }
    }

    void postOrder(int idxStart) {
        if (idxStart <= idxlast) {
            postOrder(2 * idxStart + 1);
            postOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
