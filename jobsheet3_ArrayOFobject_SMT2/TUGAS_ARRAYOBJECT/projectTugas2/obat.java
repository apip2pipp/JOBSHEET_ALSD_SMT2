public class obat {
    int harga;
    String namaObat, bentukObat,konsumenObat;

    public obat(String nameDrugs, String drugFrom, String consumer, int priceDrugs ){
        namaObat = nameDrugs;
        bentukObat = nameDrugs;
        konsumenObat = consumer;
        harga = priceDrugs;
    }

    public String name(){
        return namaObat;
    }

    public String bentuk(){
        return bentukObat;
    }

    public String konsumen(){
        return konsumenObat;
    }

    public int hargaObat(){
        return harga;
    }
}
