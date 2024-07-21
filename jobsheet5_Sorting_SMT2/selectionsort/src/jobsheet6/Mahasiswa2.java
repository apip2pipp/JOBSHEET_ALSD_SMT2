package selectionsort.src.jobsheet6;

public class Mahasiswa2 {
    String nama;
    int thnMasuk, umur;
    double ipk;

    public Mahasiswa2(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void Tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + thnMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("Ipk: " + ipk);
    }

    
}
