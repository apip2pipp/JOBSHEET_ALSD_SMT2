package Buku;

public class bukuMain {
    public static void main(String[] args) {
        bukuA b1A = new bukuA();
        b1A.judul = "New person of my life";
        b1A.pengarang = "LORD APIP ";
        b1A.stok = 10;
        b1A.halaman = 123;
        b1A.harga = 80000;
        
        b1A.tampilInfo();
        b1A.terjual(5);
        b1A.gantiHarga(64000);
        System.out.println();
        b1A.tampilInfo();
        b1A.totBukuTerjual(5);
        b1A.tampilInfo2();
        

        
    }
}
