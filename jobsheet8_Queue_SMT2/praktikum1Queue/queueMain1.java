package praktikum1Queue;

import java.util.Scanner;

/**
 * queueMain1
 */
public class queueMain1 {

    public static void menu() {
        System.out.println("Masukkan Operasi yang di inginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------");
    }

    public static void Main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();
        queue1 Q = new queue1(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 ||
                pilih == 4 || pilih == 5);

    }

    public static void main(String[] args) {
        Main();
    }
}