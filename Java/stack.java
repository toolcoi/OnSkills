/**
 * https://cafedev.vn/tu-hoc-java-class-stack-trong-java/
 */
// hàm push: add
// hàm pop: delete
// hàm peek: return top
// hàm search: find
// hàm empty: check empty

import java.util.Stack;
public class stack {

    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Stack<String> str = new Stack<>();

        stacks.push(1);
        stacks.push(3);
        stacks.push(2);
        stacks.push(5);
        System.out.println("Stack: " + stacks);
        System.out.println("Stack pop: " + stacks.pop());

        str.add("Ta");
        str.add("Van");
        str.add("Trong");
        System.out.println("Stack chuỗi: " + str);


    }
}