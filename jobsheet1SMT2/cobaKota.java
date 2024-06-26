import java.util.Scanner;

public class cobaKota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array pertama: 
        char[] KODE = new char[10];
        for (int i = 0; i < KODE.length; i++) {
            System.out.print("Masukkan kode plat mobil ke-" + (i + 1) + ": ");
            KODE[i] = scanner.next().charAt(0);
        }

        // Array kedua: 
        String[][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        // Menampilkan hasil
        System.out.print("Masukkan kode plat mobil: ");
        char kode = scanner.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                System.out.println("Nama kota dari kode plat nomor " + kode + " adalah " + KOTA[i][0]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode plat mobil tidak ditemukan.");
        }
    }
}
