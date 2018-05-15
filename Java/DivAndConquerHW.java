/**
 * Contains two methods for finding the smallest value in an array.
 *
 * @author    Jose Cordova
 * @version   1.5
 *
 */
 
import java.util.Arrays;
 
public class DivAndConquerHW {
      
   /**
	 * Iteratively finds the smallest value in an array of numbers.
    *
    * @param list  array containing int values to be processed
    * @return      the smallest value
    *
    */
   public static int minUsingLoop (int[] list) 
   {
      int min = list[0];
      for (int n: list)
         if (n < min)
            min = n;
      return min;
   }
   
   
    /**
    *
	 * Using the divide-and-conquer technique, uses recursion to 
    * find the smallest value in an array of numbers.
	 * 
    * @param list  array containing int values to be processed
    * @return      the smallest value
    *
    */
   public static int minUsingDaC (int[] list) 
   {
      return findMin(list, 0, list.length - 1);
   }

    /**
    *
	* Finds the middle of the array defined by the low and high indices.
	* Makes a recursive call to process the first half of the array and
	* another recursive call to process the second half of the array.
	*
    * @param list  array containing int values to be processed
	* @param low   lowest index of the array to be processed
    * @param high  highest index of the array to be processed
	* @return the smaller of the two values returned by the recursive calls
    *
    */
   public static int findMin (int[] list, int low, int high) 
   {
      if ( low == high   )
         return list[low];
      int mid = (low + high) / 2;
      int min1 = findMin(list, low , mid   );
      int min2 = findMin(list, mid + 1  ,  high   );
      return Math.min(  min1  , min2  );
   }

   
   public static void main(String[] args) 
   {
      int[] a1 = {0, 2, 8, 8, 3, 3, 3, 8};
      int[] a2 = {10, 2, 3, 3, 8, 14, 21, 4, 7};
   
      System.out.println(minUsingLoop(a1) == 0);        // 0 expected
      System.out.println(minUsingLoop(a2) == 2);       // 2 expected
   		
   //   System.out.println(minUsingDaC(a1) == 0);    // 0 expected
   //   System.out.println(minUsingDaC(a2) == 2);    // 2 expected
   }
}