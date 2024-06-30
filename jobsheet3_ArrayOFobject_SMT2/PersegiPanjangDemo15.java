/**
 * PersegiPanjangDemo15
 */
import java.util.Scanner;
public class PersegiPanjangDemo15 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        persegiPanjang17[] arrayOfPersegiPanjang17 = new persegiPanjang17[3];
        int panjang,  jumlahPP, lebar;

        System.out.println("Masukan jumlah persegi panjang : ");
        jumlahPP = sc17.nextInt();
       


        for (int i =0; i<3; i++){
            System.out.println("persegi Panjang ke-" + (i +1));
            System.out.print("Masukkan panjang: ");
            panjang = sc17.nextInt();

            System.out.print("Masukkan lebar: ");
            lebar = sc17.nextInt();

            arrayOfPersegiPanjang17[i]= new persegiPanjang17(panjang,lebar);
            
        }

        System.out.println("");

        for (int i = 0; i<jumlahPP;i++){
            System.out.println("Persegi Panjang ke:"+ (i+1) + " Panjangnya: "+ arrayOfPersegiPanjang17[i].panjang + " Lebarnya: " + arrayOfPersegiPanjang17[i].lebar + " Luasnya: " + arrayOfPersegiPanjang17[i].hitungLuas() + " Keliling: " + arrayOfPersegiPanjang17[i].hitungKeliling());
        }


        System.out.println("Persegi Panjang ke-1, panjang :" +arrayOfPersegiPanjang17[0].panjang + ",lebar: " + arrayOfPersegiPanjang17[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang :" +arrayOfPersegiPanjang17[1].panjang + ",lebar: " + arrayOfPersegiPanjang17[1].lebar);
        System.out.println("Persegi Panjang ke-1, panjang :" +arrayOfPersegiPanjang17[2].panjang + ",lebar: " + arrayOfPersegiPanjang17[2].lebar);

        // for(int i = 0; i< jumlahPP; i++ ){
        //     System.out.println("Persegi panjang yang ke-" + (i+1));
        //     System.out.println("Masukkan panjangnya: ");
        //     panjang = sc17.nextInt();
        //     System.out.println("Masukkan lebarnya: ");
        //     lebar= sc17.nextInt();

        //     arrayOfPersegiPanjang17[i]= new persegiPanjang17(panjang, lebar);
        //     System.out.println("Luasnya: " + arrayOfPersegiPanjang17[i].hitungLuas()+ "keliling: " + arrayOfPersegiPanjang17[i].hitungKeliling());

            
            
        // }

        // for (int i =0; i<3; i++){
        //     arrayOfPersegiPanjang17[i]= new persegiPanjang17();

        //     System.out.println("persegi panjang ke-" + (i+1));
        //     System.out.println("Masukkan panjang: ");
        //     arrayOfPersegiPanjang17[i].panjang = sc17.nextInt();
        //     System.out.println("Masukkan Lebar: ");
        //     arrayOfPersegiPanjang17[i].lebar = sc17.nextInt();
        // }

        // arrayOfPersegiPanjang17[0] = new persegiPanjang17();
        // arrayOfPersegiPanjang17[0].panjang =110;
        // arrayOfPersegiPanjang17[0].lebar =30;

        // arrayOfPersegiPanjang17[1] = new persegiPanjang17();
        // arrayOfPersegiPanjang17[1].panjang = 80;
        // arrayOfPersegiPanjang17[1].lebar = 40;

        // arrayOfPersegiPanjang17[2] = new persegiPanjang17();
        // arrayOfPersegiPanjang17[2].panjang = 100;
        // arrayOfPersegiPanjang17[2].lebar = 20;

        
        
        
    }
}