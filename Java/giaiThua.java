import java.util.Scanner;
public class giaiThua{
    private static Scanner sc = new Scanner(System.in);
    public static long tinhGT(int n){
        int kq = 1;
        if (n==1){
            return kq;
        }else{
            for(int i = 2; i <= n; i++){
                kq *= i;
            }
            return kq;
        }
    }
    public static long tinhGTdequy(int n) {
        if (n > 0) {
            return n * tinhGTdequy(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args){
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.printf("Ket qua cua %d giai thua la: %d \n",n,giaiThua.tinhGT(n));
        System.out.printf("Ket qua cua %d giai thua de quy la: %d \n",n,giaiThua.tinhGTdequy(n));

    }
}