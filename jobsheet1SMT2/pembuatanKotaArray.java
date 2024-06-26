import java.util.Scanner;

public class pembuatanKotaArray {
    public static void main(String[] args) {
        char[] codePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {{"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"}};

        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor : ");
        char kode = sc17.next().charAt(0);

        for (int i = 0; i < codePlat.length; i++) {
            if (codePlat[i] == kode) {
                System.out.println("Nama kota dari kode plat nomor " + kode + " adalah " + KOTA[0][i]);
                break;
            }
        }
    }
}