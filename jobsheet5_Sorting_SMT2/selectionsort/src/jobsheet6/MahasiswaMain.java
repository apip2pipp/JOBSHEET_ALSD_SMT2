package selectionsort.src.jobsheet6;

public class MahasiswaMain {
    public static void main(String[] args) {
        MahasiswaBerprestasi2 list = new MahasiswaBerprestasi2();
        Mahasiswa2 m1 = new Mahasiswa2("Nusa", 2017, 25, 3);
        Mahasiswa2 m2 = new Mahasiswa2("Rara", 2012, 19, 4);
        Mahasiswa2 m3 = new Mahasiswa2("Dompu", 2018, 19, 3.5);
        Mahasiswa2 m4 = new Mahasiswa2("Abdul", 2017, 23, 2);
        Mahasiswa2 m5 = new Mahasiswa2("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();
        System.out.println("data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
    }
}
