import java.util.Arrays;
public class ArrayTest
{
   public static void main(String[] args)
   {
      int[][] s = new int[5][10];
      
      for (int[] x : s)
         System.out.println(Arrays.toString(x));
   }
}