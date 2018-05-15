import java.util.*;
public class Homework
{
   public static void main(String[] args)
   {
      Hashtable<Integer, LinkedList> set = new Hashtable<Integer, LinkedList>(17);
      String input = "10014115 10079225 17697572 17680581 30004618 17693277 10076848 10015384 17695023 10110732";
      String[] s = input.split(" ");
      for (String r : s)
      {
         int index = hash(r) % 17;
         System.out.println(r + " , " + index );
         
         if (set.get(index) != null)
         {
            set.get(index).add(r);
            continue;
         }
         
         LinkedList<String> L = new LinkedList<String>();
         L.add(r);
         set.put(index, L);
      }
      System.out.println("------------");
      double used = 0;
      
      for (int x = 0; x < 17; x++)
      {
         if (set.get(x) == null)
         {
            System.out.println("NULL");
            continue;
         }
         used++;
         System.out.println(set.get(x));
      }
      
      System.out.print(used / 17.00);
     
   }
   
   public static int hash(String x)
   {
      int z = Integer.parseInt(x);
      return z % 17;
   }
}