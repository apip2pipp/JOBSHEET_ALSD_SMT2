import java.net.Socket;
import java.util.Scanner;

/**
 * mahasiswaMain
 */
public class mahasiswaMain {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int jumlahMahasiswa;
        double totalip=0;
        System.out.println("Jumlah mahasiswa: ");
        
        jumlahMahasiswa = sc17.nextInt();
        tugasArrayObj17[] arrauOfMahasiswa17 = new tugasArrayObj17[jumlahMahasiswa];

        for (int i=0; i<jumlahMahasiswa; i++){
            System.out.println("Mahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama: ");
            String nama= sc17.next();
            System.out.print("Masukkan NIM: ");
            String NIM = sc17.next();
            System.out.print("Jenis kelamin: ");
            String JenisKelamin = sc17.next();
            System.out.print("IPK: ");
            double ip = sc17.nextDouble();

            arrauOfMahasiswa17[i] = new tugasArrayObj17(nama, NIM, JenisKelamin, ip);

            
        }
        System.out.println();

        System.out.println("================");
        System.out.println("INFO MAHASISWA");
        System.out.println("================");
        for (tugasArrayObj17 mahasiswa : arrauOfMahasiswa17){
            System.out.println("Nama: " + mahasiswa.Firstnama());
            System.out.println("NIM: " + mahasiswa.FirstNim());
            System.out.println("Jenis Kelamin: "+ mahasiswa.FirstJenisKelamin());
            System.out.println("IPK: " + mahasiswa.firstIPK());
            totalip += mahasiswa.firstIPK();
        }

        System.out.println();

        double rataIPK = totalip / jumlahMahasiswa;
        System.out.println("Rata - rata IPK : " + rataIPK);

    }
}