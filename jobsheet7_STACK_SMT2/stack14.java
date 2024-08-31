public class stack14 {
    int size;
    int top;
    int data[];

    public stack14(int size) {
        this.size = size;
        data = new int[size];
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

    public void push(int dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Remove data: " + x);
        } else {
            System.out.println("Stack still empty");
        }
    }

    public void peek() {
        System.out.println("Top elemen: " + data[top]);
    }

    public void print() {
        System.out.println("Stack content : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Now stack is empty");
        } else {
            System.out.println("Failed! Stack is still empty");
        }
    }

}