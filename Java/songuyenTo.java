import java.util.Scanner;

public class songuyenTo{
    private static Scanner scanner = new Scanner(System.in);
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Enter n = ");
        int n = scanner.nextInt();
        System.out.printf("Cac so nguyen to nho hon %d la: \n",n);
        if (n >= 2){
            System.out.print(2);
        }
        for (int i = 3; i < n; i++){
            if(isPrimeNumber(i)){
                System.out.print(" "+ i);
            }
        }
    }
}