package selectionsort.src.jobsheet6;

public class MahasiswaBerprestasi2 {
    Mahasiswa2 listmhs[] = new Mahasiswa2[5];
    int idx;

    public void tambah(Mahasiswa2 m) {
        if (idx < listmhs.length) {
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    public void tampil() {
        for (Mahasiswa2 k : listmhs) {
            k.Tampil();
            System.out.println("========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            for (int j = 1; j < listmhs.length - i; j++) {
                if (listmhs[j].ipk > listmhs[j - 1].ipk) {
                    Mahasiswa2 tmp = listmhs[j];
                    listmhs[j] = listmhs[j - 1];
                    listmhs[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listmhs.length; j++) {
                if (listmhs[j].ipk < listmhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa2 tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
    }
}
