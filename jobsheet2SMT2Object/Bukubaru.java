public class Bukubaru {
    public static void main(String[] args) {
        Buku17 bbaru = new Buku17();
        bbaru.judul = "New person for life";
        bbaru.halaman = 30;
        bbaru.pengarang ="The mytichal";
        bbaru.stok = 10;
        bbaru.harga=20000;

        bbaru.hargaPeritem=20000;
        bbaru.jumlahTerjual = 3;

        bbaru.tampilinformasi();
        bbaru.hitungHargaTotal();
        bbaru.pemilihanDiskon();
        bbaru.hargaBayar();
    }
}
