import java.util.*;

/**
 * 	Methods to determine if array elements are unique
 *
 */
public class HW1
{

    /**
     * Determine whether the contents of an array are all unique.
     * @param x The array
     * @return true if all elements of x are unique
     */
   public static boolean areUnique1(int[] x) 
   {
    int count = 0;
    
      for (int i = 0; i < x.length; i++)
      {
         for (int j = i + 1; j < x.length; j++)
         {
            count++;
            if (x[i] == x[j]) 
            {
               System.out.println(count);
               return false;
               }
               
          }
               
      }
      
      System.out.println(count);
      return true;
      
   }
   
	
   public static void main(String[] args)
   {
      final int size = 200;
      int[] array1 = new int[size];
      int[] array2 = new int[size];
      for (int i = 0; i < size; ++i)
      {
         array1[i] = i + 1;
         array2[i] = i + 1;
      }
      array2[size - 1] = 1;
      System.out.println(areUnique1(array1) + " " + areUnique1(array2));
   }
}