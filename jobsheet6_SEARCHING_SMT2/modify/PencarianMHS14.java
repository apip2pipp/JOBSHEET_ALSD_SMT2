package modify;

public class PencarianMHS14 {

    Mahasiswa14 ListMHS[];
    int idx;

    void tambah(Mahasiswa14 m) {
        if (idx < ListMHS.length) {
            ListMHS[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa14 m : ListMHS) {
            m.Tampil();
            System.out.println("-----------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < ListMHS.length; j++) {
            if (ListMHS[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + ListMHS[pos].nama);
            System.out.println("Umur\t : " + ListMHS[pos].umur);
            System.out.println("Ipk\t : " + ListMHS[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left,
            int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == ListMHS[mid].nim) {
                return (mid);
            } else if (ListMHS[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, left, right);
            }
        }
        return -1;
    }
}
