package modify;

import java.util.Scanner;

import searching62.pencarianMHS;

public class MahasiswaMain14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();

        PencarianMHS14 data = new PencarianMHS14();

        System.out.println("----------------------------------------------------");
        System.out.println(" Masukkan data Mahasiswa secara urut dari Nim yang terkecil ");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            Mahasiswa14 m = new Mahasiswa14(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------------");
        System.out.println(" Data kseluruhan Mahasiswa ");
        System.out.println("----------------------------------------------------");
        data.tampil();

        System.out.println("____________________________________________________");

        System.out.println("____________________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("NIM: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("====================================================");
        System.out.println(" Menggunakan Binary Search ");

        System.out.println("====================================================");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
