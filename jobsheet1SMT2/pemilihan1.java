import java.util.Scanner;

/**
 * pemilihan1
 */
public class pemilihan1 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Masukan NILAI TUGAS : ");
        int NilaiTugas = sc17.nextInt();

        System.out.print("Masukan NILAI KUIS : ");
        int NilaiKuis = sc17.nextInt();

        System.out.print("Masukan NILAI UTS : ");
        int NilaiUTS =sc17.nextInt();

        System.out.print("Masukkan NILAI UAS :");
        int NilaiUAS = sc17.nextInt();

        Object [] hasil = hitungNilaiAkhir(NilaiTugas, NilaiKuis, NilaiUTS, NilaiUAS);

        if (hasil [0].equals("nilai tidak valid")) {
            System.out.println(""+ hasil[0]);
        }else{
            System.out.println("====================================");
            System.out.println("===PROGRAM MENGHITUNG NILAI AKHIR===");
            System.out.println("====================================");

            System.out.println("NILAI TUGAS  : " + NilaiTugas);
            System.out.println("NILAI KUIS   : " + NilaiKuis);
            System.out.println("NILAI UTS    : " + NilaiUTS);
            System.out.println("NILAI UAS    : " + NilaiUAS);
            System.out.println("====================================");
            System.out.println("Nilai akhir    : " + hasil[0]);
            System.out.println("Nilai huruf   : " + hasil[1]);
            System.out.println("====================================");
            System.out.println(""+ hasil[2]);
            System.out.println("====================================");

        }   
            
        
    }

    public static Object[] hitungNilaiAkhir(int Nilaitugas, int Nilaikuis, int Nilaiuts, int Nilaiuas) {
        Object[] result = new Object[3];

        // Memeriksa apakah nilai masukan valid (0-100)
        if (Nilaitugas < 0 || Nilaitugas > 100 || Nilaikuis < 0 || Nilaikuis > 100 || Nilaiuts < 0 || Nilaiuts > 100 || Nilaiuas < 0 || Nilaiuas > 100) {
            result[0] = "nilai tidak valid";
            return result;
        }

        // Menghitung nilai akhir
        double nilaiAkhir = 0.2 * Nilaitugas + 0.2 * Nilaikuis + 0.3 * Nilaiuts + 0.4 * Nilaiuas;

        // Mengkonversi nilai ke huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Menentukan keterangan LULUS/TIDAK LULUS
        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";

        result[0] = nilaiAkhir;
        result[1] = nilaiHuruf;
        result[2] = keterangan;

        return result;
    }
}