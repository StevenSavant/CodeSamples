/**
 * Used to test the functionality of the DPKnapsack class
 *
 * @author  J Cordova
 * @version 1.0
 *
 */
 import java.io.*;
   public class DPKTest
	{			
	   public static void main(String[] args) throws IOException
		{
         final int DEFAULT_CAPACITY = 70;
         final int LARGER_CAPACITY = 70;
         
         DPKnapsack dpk = new DPKnapsack(DEFAULT_CAPACITY, "10products.txt");
         
			System.out.println(dpk.optimalWeight());        
			System.out.println(dpk.optimalNumber());       
			System.out.println(dpk.contains("watch"));
         System.out.println(dpk.contains("laptop"));
			System.out.println(dpk.solution());   
			
         System.out.println("----- Everything Good So Far-------");
        
         System.out.println(dpk.optimalWeight(LARGER_CAPACITY));   
			System.out.println(dpk.optimalNumber(LARGER_CAPACITY));       
			System.out.println(dpk.contains("watch", LARGER_CAPACITY));
         System.out.println(dpk.contains("laptop", LARGER_CAPACITY));
			System.out.println(dpk.solution(LARGER_CAPACITY));
                  
        System.out.println((dpk.contains("watch", LARGER_CAPACITY) &&
        !dpk.contains("ring", LARGER_CAPACITY)));
        
        
         
      }
   }