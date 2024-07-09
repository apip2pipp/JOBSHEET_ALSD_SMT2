/**
 * Faktorial
 */
public class Faktorial1 {

    public int nilai;

    // public int faktorialBF(int n) {
    //     int fakto = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fakto = fakto * i;
    //     }
    //     return fakto;
    // }

        public int faktorialBF(int n) {
        int fakto1 = 1;
        int x=1;
        while (x<n) {
            fakto1 = fakto1*x;
            ++x;
        }
        return fakto1;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}

