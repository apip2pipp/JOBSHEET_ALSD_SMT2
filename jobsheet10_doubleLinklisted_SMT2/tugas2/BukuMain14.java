package tugas2;

import java.util.Scanner;

public class BukuMain14 {
    static void menu() {

        System.out.println("************************");
        System.out.println("    LIBRARY DATA BOOK   ");
        System.out.println("************************");
        System.out.println("1. Add new book");
        System.out.println("2. Get book from top");
        System.out.println("3. Peek book title from top");
        System.out.println("4. Info all of book");
        System.out.println("5. Exit");
        System.out.println("------------------------");
        System.out.print("Select Menu : ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        book14 ds = new book14();

        int ulang = 0;
        do {
            menu();
            int pilih = sc.nextInt();
            System.out.println("------------------------");
            switch (pilih) {
                case 1:
                    System.out.println("Enter book title : ");
                    String jb = sc1.nextLine();
                    ds.addLast(jb);
                    break;
                case 2:
                    System.out.println("Book on top has been removed");
                    ds.removeFirst();
                    break;
                case 3:
                    ds.peek();
                    break;
                case 4:
                    ds.print2();
                    break;
            }
            if (pilih == 5) {
                System.out.println("EXIT FROM PROGRAM");
                break;
            }
        } while (ulang != 0 || ulang < 3);
    }
}
