/**
 * tugasArrayObj17
 */
public class tugasArrayObj17 {
    String nama, nim, jenisKelamin;
    double ip;
    
    public tugasArrayObj17(String nama, String nim, String jeniskelamin, double ip){
        this.nama = nama;
        this.nim=nim;
        this.jenisKelamin = jeniskelamin;
        this.ip = ip;
    }

    public String Firstnama(){
        return nama;
    }
    
    public String FirstNim(){
        return nim;
    }

    public String FirstJenisKelamin(){
        return jenisKelamin;
    }

    public double firstIPK(){
        return ip;
    }
}


