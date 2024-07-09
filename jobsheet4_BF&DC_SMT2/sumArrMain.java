import java.util.Scanner;

public class sumArrMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("Masukkan jumlah Perusahaan : ");
        int perusahaan = sc.nextInt();
        sumArr[] sm = new sumArr[perusahaan];
        for (int k = 0; k < perusahaan; k++) {
            sm[k] = new sumArr(k);

            System.out.println("============================================================");
            System.out.println("Perusahaan ke-" + (k + 1));
            System.out.println("Masukkan jumlah bulan : ");
            sm[k].elemen = sc.nextInt();

            System.out.println("============================================================");
            sm[k].keuntungan = new double[sm[k].elemen];
            for (int j = 0; j < sm[k].elemen; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " = ");
                sm[k].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("============================================================");

        sumArr dat = new sumArr(perusahaan);
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Jumlah Bulan : " + sm[i].elemen);
            System.out.println("");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = %.2f ", dat.totalBF(sm[i].keuntungan));
            System.out.println("\n");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = %.2f ",dat.totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));

            System.out.println("\n============================================================");
        }
    }

    // System.out.println("=====================================================");
    // System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal
    // 5.9)");
    // System.out.println("Masukkan jumlah bulan : ");
    // int elm = sc.nextInt();

    // sumArr sm = new sumArr(elm);

    // System.out.println("=====================================================");
    // for (int i = 0; i < sm.elemen; i++) {
    // System.out.println("Masukkan untung bulan ke-" + (i + 1) + " = ");
    // sm.keuntungan[i] = sc.nextDouble();
    // }

    // System.out.println("=====================================================");
    // System.out.println("Algoritma Brute Force");
    // System.out.println(
    // "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " +
    // sm.totalBF(sm.keuntungan));
    // System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan
    // adalah = %.2f ",
    // sm.totalBF(sm.keuntungan));

    // System.out.println("\n=====================================================");
    // System.out.println("Algoritma Divide and Conquer");
    // System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "
    // bulan adalah = "
    // + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    // System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan
    // adalah = %.2f ",
    // sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

    // System.out.println("=====================================================");
    // System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal
    // 5.9)");
    // System.out.println("Masukkan jumlah bulan : ");
    // int elm = sc.nextInt();

    // sumArr sm = new sumArr(elm);

    // System.out.println("=====================================================");
    // for (int i = 0; i < sm.elemen; i++) {
    // System.out.println("Masukkan untung bulan ke-" + (i + 1) + " = ");
    // sm.keuntungan[i] = sc.nextDouble();
    // }

    // System.out.println("===================================== ================");
    // System.out.println("Algoritma Brute Force");
    // System.out.println(
    // "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " +
    // sm.totalBF(sm.keuntungan));

    // System.out.println("=====================================================");
    // System.out.println("Algoritma Divide and Conquer");
    // System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "
    // bulan adalah = "
    // + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

}
