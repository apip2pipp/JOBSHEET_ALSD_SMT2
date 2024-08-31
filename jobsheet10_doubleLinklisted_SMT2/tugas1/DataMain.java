package tugas1;

import java.util.Scanner;

public class DataMain {
    static void menu() {
        System.out.println("====================================================");
        System.out.println(" DATA MANIPULATION WITH DOUBLE LINKED LIST");
        System.out.println("====================================================");
        System.out.println("1. ADD FIRST");
        System.out.println("2. ADD TAIL");
        System.out.println("3. ADD DATA IN NTH INDEX");
        System.out.println("4. REMOVE FIRST");
        System.out.println("5. REMOVE LAST");
        System.out.println("6. REMOVE DATA BY INDEX");
        System.out.println("7. PRINT");
        System.out.println("8. SEARCH DATA");
        System.out.println("9. SORT DATA");
        System.out.println("10. EXIT");

        System.out.println("===============================");
    }

    public static void main(String[] args) throws Exception {
        DataServices14 Ds = new DataServices14();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int ulang = 0;
        do {
            menu();
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("INPUT THE DATA FIRST");
                    int head = sc.nextInt();
                    Ds.addFirst(head);
                    break;
                case 2:
                    System.out.println("INPUT DATA POSITION TAIL");
                    int tail = sc.nextInt();
                    Ds.addLast(tail);
                    break;
                case 3:
                    System.out.println("INPUT DATA");
                    int a = sc.nextInt();
                    System.out.println("in index : ");
                    int pointer = sc.nextInt();
                    Ds.add(a, pointer);
                    break;
                case 4:
                    Ds.removeFirst();
                    break;
                case 5:
                    Ds.removeLast();
                    break;
                case 6:
                    System.out.println("Pointer");
                    int indeks = sc.nextInt();
                    Ds.remove(indeks);
                    break;
                case 7:
                    // MasukData ad;
                    Ds.print();
                    break;
                case 8:
                    System.out.println("SORT Data: ");
                    int cariData = sc.nextInt();
                    if (cariData != 0) {
                        Ds.searchNode14(cariData);
                    }
                    break;
                case 9:
                    Ds.sortList();
                    break;
            }
            if (pilih == 10) {
                System.out.println("U EXIT IN THIS PROGRAM");
                break;
            }
        } while (ulang != 0 || ulang < 3);
    }
}
