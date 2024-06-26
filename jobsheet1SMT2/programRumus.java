import java.util.Scanner;

public class programRumus {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int option;
        do {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");
            System.out.print("Select the option (1/2/3/4) : ");
            option = sc17.nextInt();
            switch (option) {
                case 1:
                System.out.println();
                    hitungKecepatan();
                    System.out.println();
                    break;
                case 2:
                System.out.println();
                    hitungJarak();
                    System.out.println();
                    break;
                case 3:
                System.out.println();
                    hitungWaktu();
                    System.out.println();
                    break;
                case 4:
                System.out.println();
                    System.out.println("Thank u for using this program :) ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (option != 4);
    }

    private static void hitungKecepatan() {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double s = sc17.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = sc17.nextDouble();
        double v = s / t;
        System.out.println("Kecepatan: " + v + " m/s");
    }

    private static void hitungJarak() {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc17.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = sc17.nextDouble();
        double s = v * t;
        System.out.println("Jarak: " + s + " m");
    }

    private static void hitungWaktu() {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc17.nextDouble();
        System.out.print("Masukkan jarak (m): ");
        double s = sc17.nextDouble();
        double t = s / v;
        System.out.println("Waktu: " + t + " s");
    }
}