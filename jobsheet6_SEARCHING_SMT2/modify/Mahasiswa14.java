package modify;

public class Mahasiswa14 {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa14(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void Tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

}
