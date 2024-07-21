package src.jobsheet6;

public class MahasiswaBerprestasi {
    Mahasiswa listmhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listmhs.length) {
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listmhs) {
            m.Tampil();

            System.out.println("========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            for (int j = 1; j < listmhs.length - i; j++) {
                if (listmhs[j].ipk > listmhs[j - 1].ipk) {
                    Mahasiswa tmp = listmhs[j];
                    listmhs[j] = listmhs[j - 1];
                    listmhs[j - 1] = tmp;
                }
            }
        }
    }
}
