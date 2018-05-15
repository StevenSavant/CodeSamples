import java.util.ArrayList;
public class Quiz
{
   public static void main(String[] args)
   {
      ArrayList <Integer> list = new ArrayList <Integer>();
      list.add(5);
      list.add(4);
      list.add(9);
      list.add(4);
      
      System.out.println(list.indexOf(20));
   }
}