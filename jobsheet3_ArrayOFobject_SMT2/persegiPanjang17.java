public class persegiPanjang17 {
    public int panjang;
    public int lebar;

    public persegiPanjang17(int p1, int l){
        panjang = p1;
        lebar = l;
    }

    public void cetakInfo(){
        System.out.println("panjang: " + panjang +", lebar: " + lebar);
    }

    public int hitungLuas(){
        return panjang*lebar;
    }

    public int hitungKeliling(){
        return 2*(panjang+lebar);
    }
}


