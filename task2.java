public class task2 {

   public static int getHighestBit(int num) {
      int highestBit = 0;
      while (num > 0) {
         highestBit++;
         num >>= 1;
      }
      return highestBit;
   }

   public static void main(String[] args) {
      int num = 5; // здесь можно использовать любое целое число
      int highestBit = getHighestBit(num);
      System.out.println("Наибольший бит числа " + num + " равен " + highestBit);
   }
}
