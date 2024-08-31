package practicum2;

import java.util.Scanner;

public class bookMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book st = new book(8);
        char pilih;
        do {
            System.out.print("Title: ");
            String judul = sc.nextLine();
            System.out.print("Author name: ");
            String nama = sc.nextLine();
            System.out.print("Published year : ");
            int tahun = sc.nextInt();
            System.out.print("Pages amount : ");
            int jml = sc.nextInt();
            System.out.print("Price: ");
            int harga = sc.nextInt();

            book bk = new book(judul, nama, tahun, jml, harga);
            System.out.println("Do you want to add new data to stack(y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (pilih == 'y');
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}
