package assigment14;

import java.util.Scanner;

public class ReverseMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse14 balik;
        char C;
        System.out.print("Masukkan Kalimat: ");
        String kalimat = sc.nextLine();

        int total = kalimat.length();

        balik = new Reverse14(total);

        for (int i = 0; i < total; i++) {
            C = kalimat.charAt(i);
            balik.push(C);
        }

        System.out.println("Hasilnya: ");
        balik.print();

    }
}
