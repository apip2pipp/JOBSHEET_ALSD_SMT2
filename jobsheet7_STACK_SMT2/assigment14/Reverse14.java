package assigment14;

public class Reverse14 {
    char[] data;
    int top;
    int size;

    public Reverse14(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi Stack penuh");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            char x = data[top];
            top--;
            System.out.println("Data yang keluar: " +
                    x);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        System.out.println("elemen Teratas: " +
                data[top]);
    }

    public void print() {
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + "");
        }
        System.out.println("");
    }

    public void clear() {
        if (IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack Sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack Masih Kosong");
        }
    }

}
