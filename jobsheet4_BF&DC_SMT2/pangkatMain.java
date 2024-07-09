import java.util.Scanner;

/**
 * pangkatMain
 */
public class pangkatMain {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int ulang = 0;

        do {
            System.out.println("");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Memunculkan Brute Force ");
            System.out.println("2. Memunculkan Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.print("Pilihah menu :");
            int pilih = sc.nextInt();
            if (pilih == 1) {
                BruteForce();
                continue;
            } else if (pilih == 2) {
                DivideandConquer();
                continue;
            } else if (pilih == 3) {
                System.out.println("Anda telah keluar dari program");
                System.exit(0);
                break;
            } else {
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        } while (ulang != 0 || ulang < 3);
    }

    public static void BruteForce() {

        System.out.println("==================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        pangkat1[] png = new pangkat1[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat1();
            System.out.print("Masukkan Nilai yang akan dipangkatkan ke- " + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pemangkat ke- " + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("==================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari Nilai" + png[i].nilai + " Adalah : "
                    + png[i].PangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("==================================================");
    }

    public static void DivideandConquer() {

        System.out.println("==================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen1 = sc.nextInt();
        pangkat1[] png2 = new pangkat1[elemen1];
        for (int i = 0; i < elemen1; i++) {
            png2[i] = new pangkat1();
            System.out.print("Masukkan Nilai yang akan dipangkatkan ke- " + (i + 1) + " : ");
            png2[i].nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pemangkat ke- " + (i + 1) + " : ");
            png2[i].pangkat = sc.nextInt();
        }

        System.out.println("==================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen1; i++) {
            System.out.println("Faktorial dari Nilai" + png2[i].nilai + " Adalah : "
                    + png2[i].PangkatDC(png2[i].nilai, png2[i].pangkat));
        }

        System.out.println("==================================================");
    }
}
