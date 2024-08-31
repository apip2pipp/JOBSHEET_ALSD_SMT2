package tugas5addintdata;

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
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
