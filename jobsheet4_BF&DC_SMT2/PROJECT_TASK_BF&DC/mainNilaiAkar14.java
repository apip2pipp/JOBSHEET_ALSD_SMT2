import java.util.Scanner;

public class mainNilaiAkar14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("===========================================");
        System.out.print("Masukkan angka: ");
        int x = sc.nextInt();
        System.out.println("===========================================");
        System.out.println("Akar kuadrat dari " + x + " menggunakan Brute Force: " + NilaiAkar14.sqrtBF(x));
        System.out.println("Akar kuadrat dari " + x + " menggunakan Divide Conquer: " + NilaiAkar14.sqrtDC(x));
        System.out.println("===========================================");
        sc.close();
    }
}
