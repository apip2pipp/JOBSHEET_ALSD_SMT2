package practicum2;

public class book {
    String title, authorName;
    int publishedYear, pageAmount, price;

    public book(String tt, String nm, int yr, int pam, int pr) {
        this.title = tt;
        this.authorName = nm;
        this.publishedYear = yr;
        this.price = pr;
    }

    int size;
    int top;
    book data[];

    public book(int size) {
        this.size = size;
        data = new book[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(book dt) {
        if (!Isfull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            book x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.title + " " + x.authorName + " " + x.publishedYear + " "
                    + x.pageAmount + " " + x.price);
        } else {
            System.out.println("Stacl is empty");
        }
    }

    public void peek() {
        System.out.println("Top element :" + data[top]);
    }

    public void print() {
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title + " " +
                    data[i].authorName + " "
                    + data[i].publishedYear + " " +
                    data[i].pageAmount + " " + data[i].price);
        }
        System.out.println("");
    }
}
