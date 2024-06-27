import javax.sound.midi.Soundbank;

/**
 * bukuMain
 */
public class bukuMain {

    public static void main(String[] args) {
        Buku17 b1 = new Buku17();
        b1.judul = "Today ends tomorrow comes";
        b1.pengarang = "Denanda Pratiwi";
        b1.halaman = 198;
        b1.stok =13;
        b1.harga=71000;


        b1.tampilinformasi();
        b1.terjual(5);
        b1.gantiHarga(60000);
        System.out.println();
        b1.tampilinformasi();

        System.out.println();
        Buku17 b2 = new Buku17("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        b2.terjual(11);
        b2.tampilinformasi();
    }
}