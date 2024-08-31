package praktikum2Queue;

import java.util.Scanner;

import praktikum1Queue.queue1;

public class nasabah14 {
public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kapasitas queue: ");
        int Jumlah = sc.nextInt();
        queue1 antri = new queue1(Jumlah);
        sc.nextLine(); // Konsumsi newline

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); // Konsumsi newline setelah memilih menu
            switch (pilih) {
                case 1:
                    System.out.println("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.println("Umur: ");
                    int umur = sc.nextInt(); // Perubahan di sini
                    System.out.println("saldo: ");
                    double saldo = sc.nextDouble(); // Perubahan di sini
                    nasabah14 nb = new nasabah14();// Perubahan di sini
                    antri.Enqueue(pilih);
                    break;
                case 2:
                    if (!antri.IsEmpty()) { // Tambahkan pengecekan antrian kosong
                        nasabah14 data = antri.Dequeue(); // Perubahan di sini
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                                + data.alamat + " " + data.umur + " " + data.saldo);
                    } else {
                        System.out.println("Antrian masih kosong");
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih != 6); // Perubahan di sini
        
        sc.close();
    }

    public static void menu() {
        System.out.println("Masukan operasi yang diinginkan");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. peekRear");
        System.out.println("6. clear");
        System.out.println("---------------------------------");
    }
}

    }

