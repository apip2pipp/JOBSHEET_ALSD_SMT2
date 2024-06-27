/**
 * Buku17
 */
public class Buku17 {

    String judul, pengarang;
    int halaman, stok, harga;
    int jumlahItem;
    int totalHarga = 0;
    int hargaPeritem;
    int subtotal;
    int jumlahTerjual;

    double hargaTot , diskon , hargaByr;

    void tampilinformasi(){
        
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga : Rp " +harga);
        
        

    }

    void terjual(int jml){
        stok -= jml;
    }

    void restock (int jml){
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }

    public Buku17(){

    }

    public Buku17(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok= stok;
        harga = har;
    }

   
}