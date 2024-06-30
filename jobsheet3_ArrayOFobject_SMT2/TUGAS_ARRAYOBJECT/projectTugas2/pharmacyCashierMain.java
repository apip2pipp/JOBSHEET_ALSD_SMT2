import java.util.Scanner;

public class pharmacyCashierMain {
    public static void main(String[] args) {
        Scanner obat17 = new Scanner(System.in);
        int jumlahObatdibeli;
        int totalObatdibeli=0;

        System.out.println("Total obat yang di beli: ");
        jumlahObatdibeli = obat17.nextInt();

        obat[] arrayjumlahObats = new obat[jumlahObatdibeli];

        for(int i=0; i< jumlahObatdibeli; i++){
            System.out.println("Beli obat ke-" + (i + 1));
            System.out.print("Nama obat: ");
            String nama= obat17.next();

            System.out.print("Bentuk obat: ");
            String bentuk= obat17.next();

            System.out.print("Consumer obat: ");
            String konsumer = obat17.next();

            System.out.println("Input Harga obat: ");
            int harga = obat17.nextInt();

            arrayjumlahObats[i] = new obat(nama, bentuk, konsumer, harga);
        }

        System.out.println();

        System.out.println("++==============++");
        System.out.println("INFO LENGKAP OBAT");
        System.out.println("++==============++");

        for(obat drugs : arrayjumlahObats ){
            System.out.println("Name Of Drugs: " + drugs.name());
            System.out.println("Drugs From: " + drugs.bentuk());
            System.out.println("Consumer(DEWASA/ANAK KECIL): " + drugs.konsumen());
            System.out.println("Harga obat: " + drugs.hargaObat());
            totalObatdibeli += drugs.hargaObat();
            System.out.println();
        }
        System.out.println();


        int totalbelanjaObat = totalObatdibeli + jumlahObatdibeli;
        System.out.println("TOTAL YANG HARUS DIBAYAR: " +totalbelanjaObat);


        
        Scanner Discount17 = new Scanner(System.in);
        System.out.print("Enter total price: ");
        double totalPrice = Discount17.nextDouble();

        double discountAmount = (totalPrice);
        double discountedPrice = totalPrice - discountAmount;

        System.out.println("Discount: " + discountAmount);
        System.out.println("Discounted Price: " + discountedPrice);

        Discount17.close();
    }
}
    
