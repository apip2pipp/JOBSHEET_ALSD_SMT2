package assigment214;

public class Belanja14 {
    String tanggal, barang, nomorTransaksi;
    int totalHarga, jumlahBarang;

    Belanja14(String tgl, String b, String nt, int th, int jml) {
        tanggal = tgl;
        barang = b;
        nomorTransaksi = nt;
        totalHarga = th;
        jumlahBarang = jml;
    }
}

public class Belanja14 {
    int size;
    int top;
    Belanja14 data[];

    void BelanjaServices14(int size) {
        this.size = size;
        data = new Belanja14[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Belanja14 bk) {
        if (!IsFull()) {
            top++;
            data[top] = bk;
        } else {
            System.out.println("Isi Stack penuh");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Belanja14 x = data[top];
            top--;
            System.out.println("id struk nama barang jumlah Barang Total harga Tanggal");
            System.out.println(x.nomorTransaksi + " " + x.barang + " \t\t" + x.jumlahBarang + " \t" + x.totalHarga + " "
                    + x.tanggal);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        System.out.println("id struk nama barang jumlah Barang Total harga Tanggal");
        System.out.println(data[top].nomorTransaksi + " " + data[top].barang + " \t\t" + data[top].jumlahBarang + " \t"
                + data[top].totalHarga + " " + data[top].tanggal);
    }

    public void print() {
        System.out.println("Isi stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println("id struk nama barang jumlah Barang Total harga Tanggal");
            System.out.println(data[i].nomorTransaksi + " " + data[i].barang + " \t\t" + data[i].jumlahBarang + " \t"
                    + data[i].totalHarga + " " + data[i].tanggal);
        }
        System.out.println("---------------------------------------------------------------------");
    }

    void namaBubbleSortAZ() {
        BelanjaServices14 bl;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j].barang.compareTo(data[j-1].barang) < 0) {
                    Belanja14 tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    void tampil() {
        BelanjaServices14 bl;
        System.out.println("no Rekening Nama NamaIbu Phone Email");
        for (int i = 0; i < data.length; i++) {
            System.out.println("id struk tanggal nama barang total harga");
            System.out.println(data[i].nomorTransaksi + " " + data[i].barang + " " + data[i].jumlahBarang + " "
                    + data[i].totalHarga + " " + data[i].tanggal);
        }
    }

}
