import java.util.*;

public class LabListIterators {
   
    public static void main(String[] args) {
       
        List<String> list = new LinkedList<String>();
       
        // Add items to the List
		  String [] array = {"Words", "are", "flowing", "out", "like", "endless", "rain", "into", "a", "paper", "cup"};
		  for (int i = 0; i < array.length; ++i)
		  		list.add (array[i]);
        System.out.println(list + ", size = " + list.size());
        capitalize(list);
        System.out.println(list);
        System.out.println(concatenateBackwards(list));      
    }

   /*
      FOR THIS METHOD, YOU ARE REQUIRED TO USE A ListIterator
      Concatenate all elements in a linked list of strings backwards, 
      starting at the end of the list. For example, if a linked list 
      contains the strings

      Mary, had, a, little, lamb

      you should return the string "lamblittleahadMary"
   */
	public static String concatenateBackwards(List<String> words)
   {
      String result = "";
      ListIterator<String> iter = words.listIterator();
      while (iter.hasNext())
      {
         iter.next();
      }
      
      while (iter.previousIndex() != -1)
      {
         result += iter.previous();
      }
      
      return result;  
   }
	
   /*
      FOR THIS METHOD, YOU ARE REQUIRED TO USE A ListIterator
      Convert the first letter of each element to its uppercase equivalent.
      For example, if a linked list contains the strings

      Mary, had, a, little, lamb
      
      When the method terminates, the list should contain
      
      Mary, Had, A, Little, Lamb

   */
	public static void capitalize(List<String> words)
   {
      String newString = "";
      ListIterator<String> iter = words.listIterator();
      while (iter.hasNext())
      {
         newString = iter.next();
         iter.set(Character.toUpperCase(newString.charAt(0)) + newString.substring(1));
      }
   }
}