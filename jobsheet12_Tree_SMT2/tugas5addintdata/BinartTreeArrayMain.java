package tugas5addintdata;

import java.util.Scanner;

public class BinartTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input14 = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        while (idxLast < data.length - 1) {
            idxLast += 1;
            System.out.print("Data: ");
            int dat = sc.nextInt();
            bta.populateData(data, idxLast);
            bta.addData(dat, idxLast);
            System.out.print("Apakah Ingin Menginputkan data lagi? (Iya/Tidak) : ");
            String pilihan = input14.nextLine();
            if (pilihan.equalsIgnoreCase("tidak")) {
                break;
            }
        }
        System.out.println("inorder");
        bta.traverseInOrder(0);

    }
}
