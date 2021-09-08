import java.util.*;

public class minMax {
   public int minArr(int []arr){
      int min = arr[0];
      for(int i =1; i< arr.length; i++){
         if(arr[i] < min){
            min = arr[i];
         }
      }
      return min;
   }
   public int maxArr(int []arr){
      int max = 0;
      for(int i =1; i< arr.length; i++){
         if(arr[i] > max){
            max = arr[i];
         }
      }
      return max;
   }
   public static void main(String[] args) {
      int[] numbers = { 8, 2, 7, 1, 4, 9, 5};
      minMax m = new minMax();
      System.out.println("Max:"+m.maxArr(numbers));
      System.out.println("Min:"+m.minArr(numbers));
      
      
      
   }
}