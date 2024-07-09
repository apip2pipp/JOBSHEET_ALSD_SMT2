public class NilaiAkar14 {
    public static int sqrtBF(int x) {
        if (x < 0)
            return -1; 
        int i = 0;
        while (i * i <= x) {
            i++;
        }
        return i - 1; 
    }

    
public static int sqrtDC(int x) {
    if (x < 0) return -1;
        int start = 0, end = x;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid * mid == x) {
            return mid;
        } else if (mid * mid < x) {
            start = mid + 1;  
        } else {
            end = mid - 1;
        }
    }
    return end ; 
}
}