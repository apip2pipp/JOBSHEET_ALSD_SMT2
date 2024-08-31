package tugas3;

import java.util.Scanner;

public class VaksinMain {

    public static void main(String[] args) throws Exception {
        Scanner sc14 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Vaksin vs = new Vaksin();

        vs.addLast(123, "APIP");
        vs.addLast(234, "REZI");
        vs.addLast(345, "JACKO");

        int ulang = 0;
        do {

            System.out.println("=================================");
            System.out.println("  QUEUE VAKSIN PEAPOLE PLEASER   ");
            System.out.println("=================================");
            System.out.println("1. Add Vaccine Recipient Data");
            System.out.println("2. Remove Vaccine Recipient Queue");
            System.out.println("3. Delete Vaccine Recipient Queue");
            System.out.println("4. Exit");
            System.out.println("---------------------------------");
            int pilih = sc14.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Enter Vaccine Recipient Data");
                    System.out.println("-----------------------------");
                    System.out.println("Queue Number : ");
                    int antri = sc14.nextInt();
                    System.out.println("Recipient Name : ");
                    String nama = sc1.nextLine();
                    System.out.println("|" + antri + "|" + nama + " \t|");
                    vs.addFirst(antri, nama);
                    break;
                case 2:
                    vs.removeFirst();
                    System.out.println("====================================");
                    break;
                case 3:

                    System.out.println("|No.\t|Name\t|");
                    vs.print();
                    break;
            }
            if (pilih == 4) {
                System.out.println("Exit program!");
                break;
            }
        } while (ulang != 0 || ulang < 3);

    }
}