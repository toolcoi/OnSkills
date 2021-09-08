import java.util.*;

public class CAU2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhap vao so thap phan: ");
        int num = in.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nGia tri nhi phan la: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}