package practicum3;

import java.util.Scanner;

public class postfixMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan Ekspresi Matematika (infix): ");
        Q = sc14.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        postfix14 post = new postfix14(total);
        P = post.Konversi(Q);
        System.out.println("Postfix: " + P);

    }

}
