// https://cafedev.vn/tu-hoc-java-queue-interface-trong-java/
import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);
        // Access elements of the Queue tra ve phan tu dau tien
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue xoa phan tu dau tien
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);


        System.out.println("Updated Queue: " + numbers);
    }
}
