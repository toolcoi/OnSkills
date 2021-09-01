import java.util.Scanner;

public class ConvertNumber {
    public static final char CHAR_55 = 55;
    private static Scanner sc = new Scanner(System.in);
       
    //n là số nguyên , b là hệ cơ số
    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16 ) {
            return "";
        }
         
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;
         
        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.println("So " + n + " trong he co so 2 = "
                + ConvertNumber.convertNumber(n, 2));
        System.out.println("So " + n + " trong he co so 16 = "
                + ConvertNumber.convertNumber(n, 16));
        System.out.println("So " + n + " trong he co so 8 = "
        + ConvertNumber.convertNumber(n, 8));
        System.out.println("So " + n + " trong he co so 8 = "
        + ConvertNumber.convertNumber(n, 10));
    }
    
}