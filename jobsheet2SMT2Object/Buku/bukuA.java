package Buku;

public class bukuA {
    String judul, pengarang;
    int halaman, stok;
    int harga;
    double  diskon, HargaBayar;
    int hargaTot;
    int terjual;

    void tampilInfo(){
        System.out.println("=====================================");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga Buku: " + harga);
        System.out.println("=====================================");
    }

    void tampilInfo2(){
        System.out.println("Harga total: "+ hitungHargaTotal() );
        System.out.println("Total Diskon: " + pemilianDisc());
        System.out.println("Total Pembayaran: " + hargaBayar());
    }

    void totBukuTerjual(int jml){
        terjual = jml;
    }

    void restock (int jml){
        stok += jml;
    }
    
    void gantiHarga (int hrg){
        harga = hrg;
    }

    void terjual(int jml){
        if(stok >= jml){
            stok -= jml;
            System.out.println();
            System.out.println("=====================================");
            System.out.println("Anda baru saja menjual " + jml + " buku");
            System.out.println("=====================================");
        } else {
            System.out.println("======================================================");
            System.out.println("Maaf, kami hanya memiliki " + stok + " buku yang tersisa");
            System.out.println("======================================================");
        }
    }

    public int hitungHargaTotal(){
        return harga * terjual;
    }

    public double pemilianDisc(){
        hargaTot = hitungHargaTotal();
        diskon = 0;
        if (hargaTot>150000) {
            diskon = 0.12;
        }else if (hargaTot >= 750000 && hargaTot <=150000){
            diskon = 0.05;
        }
            return diskon;
        
    }

    public int hargaBayar(){
        return (int) (hitungHargaTotal() - (hitungHargaTotal()*pemilianDisc()));
    }

    
}

