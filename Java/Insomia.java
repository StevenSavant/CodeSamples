import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Insomia
{
   private static ArrayList<Character> seen;
   private static boolean sleep;
   
   public static void main(String[] args)
   {
      seen = new ArrayList<Character>(10);
      File infile = new File();
      Scanner keyboard = new Scanner(System.in);
      int N;
      int T = keyboard.nextInt();
      
      while ( > T)
      {
         N = keyboard.nextInt();
         sleep = false;
         System.out.print("Case #" + T  + ":");
         if (N == 0)
         {
            System.out.println("INSOMNIA");
            sleep = true;
         }
         
         int multiple = 2;
         
         while (!(sleep))
         {
            addDigitsof(N * multiple);
            multiple++;
         }
         
         T--;
      }
      
   }
   
   public static void addDigitsof(int digits)
   {
      String dString = "" + digits;
      for (int i = 0; i < dString.length(); i++)
      {
         if (!(hasSeen(dString.charAt(i))))
         {
            seen.add(dString.charAt(i));
         }
      }
      
      if (seen.size() == 10)
      {
         System.out.println(digits);
         seen.clear();
         sleep = true;
      }
   }
   
   public static boolean hasSeen(char y)
   {
      for (int x = 0; x < seen.size(); x++)
      {
         char s = seen.get(x);
         if (s == y)
         {
            return true;
         }
      }
      
      return false;
   }

}