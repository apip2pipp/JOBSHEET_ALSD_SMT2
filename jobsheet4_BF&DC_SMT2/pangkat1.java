public class pangkat1 {
    public int nilai, pangkat;

   

    public int PangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 1; i <= n; i++) {
    hasil = hasil * a;
    }
    return hasil;
    }

    public int PangkatDC(int a, int n) {
    if (n == 0) {
    return 1;
    } else {
    if (n % 2 == 1) // bilangan Ganjil
    {
    return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
    } else // bilangan Genap
    {
    return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
    }
    }
    }
}
