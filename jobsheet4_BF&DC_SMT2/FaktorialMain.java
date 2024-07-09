import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class FaktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        Faktorial1[] fk = new Faktorial1[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial1();
            System.out.print("Masukkan Nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===================================== =============");
        System.out.println("Hasil Faktorial dengan Brute Force");
        System.out.print("Waktu Sebelum eksekusi = ");
        long a = 0;
        long b = 0;
        a = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari Nilai " + fk[i].nilai + " Adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.print("Waktu sesudah eksekusi = ");
        System.out.println(System.currentTimeMillis());

        b = System.currentTimeMillis();
        long sisa = b-a;
        System.out.println("Waktu eksekusi brute force" + sisa);

        //
        System.out.println("==================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        System.out.print("Waktu sebelum eksekusi = ");
        System.out.println(System.currentTimeMillis());
        long c = 0;
        long d = 0;

        c = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari Nilai " + fk[i].nilai + " Adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.print("Waktu sesudah eksekusi = ");
        System.out.println(System.currentTimeMillis());

        d = System.currentTimeMillis();
        long sisa1 = d-c;
        System.out.println("waktu eksekusi Divide and conquer " + sisa1);

        System.out.println("==================================================");
    }

}
