public class stackMain14 {

    public static void main(String[] args) {
        stack14 stc = new stack14(5);
        stc.push(15);
        stc.push(27);
        stc.push(13);
        stc.print();
        stc.push(11);
        stc.push(34);
        stc.pop();
        stc.peek();
        int a= 18;
        int b= 40;
        System.out.println("Data yang ditambah:  ("+a+")("+b+")");
        stc.push(a);
        stc.push(b);
        stc.print();
    }
}