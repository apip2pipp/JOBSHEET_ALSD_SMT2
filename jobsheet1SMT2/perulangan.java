import java.util.Scanner;

/**
 * perulangan
 */
public class perulangan {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print(" INPUT NIM : ");
        String NIM = sc17.nextLine();
        

        int n = Integer.parseInt(NIM.substring(NIM.length()-2));

        if (n<10) {
            n+= 10;
        }

        System.out.println("===============");
        System.out.println("n : "+ n);

        for (int i =1; i<=n; i++){
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 ==1) {
                System.out.print("* ");
            }else{
                System.out.print(i+ " ");    
            }
        }
        
    }
}