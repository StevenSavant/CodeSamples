//Subset printer
import java.util.*;

public class SubsetPrinter
{
   public static void main(String[] args)
   {
      int[] list = new int[20];
      
      for (int i = 0; i < 19; i++)
      {
         list[i] = i + 1;
      }
      list[19] = 1;
      eleprint(list.length, list);
   }
   
   public static void eleprint(int n, int[] s)
   {
      int min = s[0];
      int max = s[n-1];
      for (int i = 0; i < n-1; i++)
      {
         if (s[i] > max)
            max = s[i];
         else
            if (s[i] < min)
               min = s[i];
      }
      
      System.out.println(max + "----" + min);
      System.out.print(Arrays.toString(s));
   }
}  