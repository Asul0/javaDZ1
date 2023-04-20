
import java.util.ArrayList;

public class task3 {
   public static void main(String[] args) {
      ArrayList<Integer> result = arrayNotMult(10, 3, 1);
      System.out.println(result);
   }

   public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int j = i - 1; j >= min; j--) {
         if (j % n != 0) {
            list.add(j);
         }
      }
      return list;
   }
}
