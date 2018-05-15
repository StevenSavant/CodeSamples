/** 
   @author Steven Burrell
   03/05/2017
   DPKnapsack - A Class that takes and Integer capacity and
   input from a file to create 'Item' Objects, storing them into an arry
   The provided methods return the optimal subset of items considering their weight
   which maximizes overall value.
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

public class DPKnapsack
{
   //instance variables
   private int[][] P;
   private boolean[][] keep;
   private ArrayList<Item> itemList;
   private int itemCount;
   private int capacity;
   private ArrayList<Item> subset;
   
   /**
      Constructor for DPKnapsack, creates items from text file, storing the objects in a list
      and then initializing a 2d Array Value Table(P) and a 2D boolean table(Keep)
      @param cap the default maximum capacity of the knapsack
      @param itemFile the name of the textFile which holds the item descriptions
   */
   public DPKnapsack(int cap, String itemFile) throws IOException
   {         
      itemList = new ArrayList<Item>();
      try 
      {
         File textFile = new File(itemFile);
         Scanner s = new Scanner(textFile);
         String info = "";
         while(s.hasNextLine())
         {
            info = s.nextLine();
            itemList.add(new Item(info));
            itemCount++;
         }
      }
      catch (FileNotFoundException e)
      {  System.out.println("File Not Found"); }
      
      this.capacity = cap;  
      initTables();                          //initialize subset array, and  'P' and Keep Tables
      knapsack();                            //compute and populate P and Keep tables
   }
   
   /**
      Initialize (or reset) the 2D arrays that will be used to compute and store optimal values
   */
   private void initTables()
   {
      P = new int[itemCount + 1][capacity + 1];
      keep = new boolean[itemCount + 1][capacity + 1];
      subset =new ArrayList<Item>(itemCount);  
   }
   
   /**
      Calculates and Populates the 2D Integer array 'P' with optimal values for each capacity up to the maximum
      capacity for each item. It also records weather or not the item was included in the 2D booelan array 'keep'
   */
   private void knapsack()
   {  
      int n = itemCount; //simplify varialbe name for computing
      int previousValue;
      int nextValue;
      
      for (int i = 1; i <= itemCount; i++)
         for (int j = 1; j <= capacity; j++)
         {  
            if(itemList.get(i-1).getWeight() > j)  // the item does not fit
            {
               P[i][j] = P[i-1][j];
            }
            else
            {
               previousValue = P[i-1][j];
               nextValue =  itemList.get(i-1).getValue() + P[i-1][j - itemList.get(i-1).getWeight()];
               
               if (previousValue >= nextValue)     // the item is not used
               {
                  P[i][j] = previousValue;
               }
               else                                //the item should be kept
               {
                  P[i][j] = nextValue;
                  keep[i][j] = true;
               }
            }
            
         }
          
      findSubset();
   }
   
   /**
      Uses the current capacity and populated boolean keep[][] talbe to find every item that was used to create the
      optimal Value and cascades from the bottom right of the table to the left side, according to the weight of each value.
   */
   private void findSubset()
   {
      int x = itemCount;
      Item ite;
      for (int y = capacity;( y > 0 && x > 0 ); x--)  // continue until there are no items or no values
      {
         if (keep[x][y])
         {
            ite = itemList.get(x-1);
            subset.add(ite);
            y -= ite.getWeight();
         }
         //else, the last item was not used
      }
   }
   
   /**
      This method loops through the established subset list, totaling the weights of each item
      @return the total weight of all items in the optimal subset   
   */
   public int optimalWeight()
   {
      
      int total = 0;
      for (Item ite : subset)
         total += ite.getWeight();
      
      return total;
   }
   
   /**
      This method loops through the established subset list, couting each item
      @return the number of items in the optimal subset   
   */
   public int optimalNumber()
   {
      int total = 0;
      for (Item ite : subset)
         total++;
      
      return total;
   }
   
   /**
      This method loops through the established subset list, to find an item with the given name
      @param item the name of the item to search for
      @return true if the item is in the optimal subset
   */
   public boolean contains(String item)
   {
      String iteName;
      for (Item ite : subset)
      {
         iteName = ite.getName();  
         if (item.equals(iteName))
         {   return true;   }
      }
      
      return false;
   }
   
   /**
      Composes a solution string of each item in the optimal set for the previously defined maximum capacity
      @return a list of items (name, weight, and value) that compose the optimal subset  
   */
   public String solution()
   {  
      String result = "";
      for (Item ite : subset)
         result += ite.toString() + "\n";
      
      return result;
   }
   
   
   //Overloaded Methods--------------------------------------
   /**
      Changes the maximum capacity to new given value, resets all relevant tables and array, recalculates values
      and finally calls the original optimalWeight() method.
      @param maxWeight the new maximum capacity
      @return the total weight of optimal subset   
   */
   public int optimalWeight(int maxWeight)
   {
      capacity = maxWeight;
      initTables();
      knapsack();
      
      return optimalWeight(); 
   }
   
   /**
      Changes the maximum capacity to new given value, resets all relevant tables and array, recalculates values
      and finally calls the original optimalNumber() method.
      @param maxWeight the new maximum capacity
      @return the number of items of optimal subset   
   */
   public int optimalNumber(int maxWeight)
   {
      capacity = maxWeight;
      initTables();
      knapsack();
      
      return optimalNumber();
   }
   
   /**
      Changes the maximum capacity to new given value, resets all relevant tables and array, recalculates values
      and finally calls the original contains() method.
      @param item, the item to search for
      @param maxWeight the new maximum capacity
      @return true if the given item is in the new subset   
   */
   public boolean contains(String item, int maxWeight)
   {
      capacity = maxWeight;
      initTables();
      knapsack();
      
      return contains(item);
   }
   
   /**
      Changes the maximum capacity to new given value, resets all relevant tables and array, recalculates values
      and finally calls the original solution() method.
      @param maxWeight the new maximum capacity
      @return the contents of the new optimal subset   
   */
   public String solution(int maxWeight)
   {
      capacity = maxWeight;
      initTables();
      knapsack();
    
      return solution();
   }
   
}