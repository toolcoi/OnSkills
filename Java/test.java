import java.util.Arrays;
import java.util.Stack;

public class test {
    public static final char CHAR_55 = 55;
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
        int[] arr = { 8, 2, 7, 1, 4, 9, 5};
        Stack<String> stacks = new Stack<>();
        for(int i = 0; i < arr.length ; i++){
            String temp = test.convertNumber(arr[i],2);
            stacks.add(temp);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(stacks);
        
    }
}
