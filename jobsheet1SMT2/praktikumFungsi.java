import java.util.Scanner;

/**
 * praktikumFungsi
 */
public class praktikumFungsi {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int [][] stok = new int [4][4];
        stok [0][0]=10;
        stok [0][1]=5;
        stok [0][2]=15;
        stok [0][3]=7;
        stok [1][0]=6;
        stok [1][1]=11;
        stok [1][2]=9;
        stok [1][3]=12;
        stok [2][0]=2;
        stok [2][1]=10;
        stok [2][2]=10;
        stok [2][3]=5;
        stok [3][0]=5;
        stok [3][1]=7;
        stok [3][2]=12;
        stok [3][3]=9;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("              |   AGLONEMA  |   KELADI   |   ALOCASIAL|   MAWAR    |");
        for(int i = 0; i<4; i++){
            System.out.print("Royal Garden"+ (i+1)+ " | ");
            for (int k =0;k<4; k++)
            {
                System.out.printf("%6d      |",stok[i][k]);
            }
            System.out.println();
        }

        int jumlahAglo = stok [0][0] + stok [1][0] + stok [2][0] + stok [3][0];
        int jumlahKeladi = stok [0][1] + stok [1][1] + stok [2][1] + stok [3][1];
        int jumlahAlocia = stok [0][2] + stok [1][2] + stok [2][2] + stok [3][2];
        int jumlahMawar = stok [0][3] + stok [1][3] + stok [2][3] + stok [3][3];
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Jumlah Aglonema: "+ jumlahAglo);
        System.out.println("Jumlah keladi: "+ jumlahKeladi);
        System.out.println("Jumlah alocia: "+ jumlahAlocia);
        System.out.println("Jumlah Mawar: "+ jumlahMawar);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("stok bunga berkurang akibat mati");
        System.out.println("|Aglonema|Keladi|Alocasial|Mawar|");
        System.out.println("|   -1   |  -2  |   -0    | -5  |");

        int [][] stokBarang = new int[4][4];
        stokBarang[0][0]= 10-1;
        stokBarang[0][1]= 5-2;
        stokBarang[0][2]= 15-0;
        stokBarang[0][3]= 7-5;
        stokBarang[1][0]= 6;
        stokBarang[1][1]= 11;
        stokBarang[1][2]= 9;
        stokBarang[1][3]= 12;
        stokBarang[2][0]= 2;
        stokBarang[2][1]= 10;
        stokBarang[2][2]= 10;
        stokBarang[2][3]= 5;
        stokBarang[3][0]= 5;
        stokBarang[3][1]= 7;
        stokBarang[3][2]= 12;
        stokBarang[3][3]= 9;

        System.out.println("--------------------------------------------------------");
        System.out.println("               |       Aglonema      |       Keladi       |       Alocasial    |       Mawar        |");
        for (int i = 0; i<4; i++){
            System.out.print("Royal Garden "+ (i+1) + " | ");
            for(int k=0;k<4; k++)
            {
                System.out.printf("%6d              |",stokBarang[i][k]);
            }
            System.out.println();
        }
        int aglonema = 75000;
        int keladi = 50000;
        int alocasial = 60000;
        int mawar = 10000;
        int totalAglonema = stokBarang[0][0]*aglonema;
        int totalKeladi = stokBarang[0][1]* keladi;
        int totalAlocasial = stokBarang[0][2]* alocasial;
        int totalMawar = stokBarang[0][3] * mawar;
        int totalSeluruh = totalAglonema + totalKeladi +totalAlocasial +totalMawar;
        System.out.println("---------------------------------------------------");
        System.out.println("Total Pnedapatan royal Garden 1 sebesar Rp "+ totalSeluruh);
    }
}