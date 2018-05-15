import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
/**
	Simple class to practice with ArrayList methods.
*/
public class ArrayListLab {
   
   public static void main(String[] args) 
   {          
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(17);
      list.add(45);
      list.add(23);
      list.add(48);  
      list.add(11);      
      System.out.println("Original list is " + list);
      System.out.println("The smallest value is " + minimum(list));
      modifyList(list, 5);
      System.out.println("The new list is " + list);
      System.out.println("The smallest value is " + minimum(list));
      rotate(list, 1);
      System.out.println("The rotated list is " + list);
   }
   
/**
	Method to add a value to each element in a List.
	@param list containing values to be modified
   @param value to be added to each list element
*/
   public static void modifyList(List<Integer> list, int value)
   {
      for (int i = 0; i <= list.size() - 1; i++)
      {
         int newValue = list.get(i) + value;
         list.set(i, newValue);
      }
   }
   
/**
	Method to find the smallest value in a List.
	@param list containing values to be searched
   @return the smallest value on the list
*/
   public static int minimum(List<Integer> list)
   {
      int smallest = list.get(0);
      for (int i = 0; i <= list.size() - 1 ; i++)
      {
         if (list.get(i) < smallest)
         {
            smallest = list.get(i);
         }
      }
      return smallest;
   }

/**
	Method to rotate n values in a list.  Each rotated
   value is removed from the front and added to the end
   of the list.  For instance, if the list is [3, 6, 7],
   the method call rotate(list, 2) would result in list
   containing the values [7, 3, 6].  Assume list has
   enough values.
	@param list containing values to be rotated
   @param n number of values to rotate in list
*/
   public static void rotate(List<Integer> list, int n)
   {
      for(int i = n; i > 0; i--)
      {
         int temp = list.get(0);
         list.remove(0);
         list.add(temp);
      }

   }
}