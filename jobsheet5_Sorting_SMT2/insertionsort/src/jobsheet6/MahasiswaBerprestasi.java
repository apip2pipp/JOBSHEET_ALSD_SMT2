package insertionsort.src.jobsheet6;

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

    void selectionSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listmhs.length - i; j++) {
                if (listmhs[j].ipk < listmhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
    }

    void insertionSort(boolean y) {
        for (int i = 1; i < listmhs.length; i++) {
            Mahasiswa temp = listmhs[i];
            int j = i;
            if (y == true) {
                while (j > 0 && listmhs[j - 1].ipk > temp.ipk) {
                    listmhs[j] = listmhs[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && listmhs[j - 1].ipk < temp.ipk) {
                    listmhs[j] = listmhs[j - 1];
                    j--;
                }
            }
            listmhs[j] = temp;
        }
    }

}
