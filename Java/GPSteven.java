import java.util.*;
public class GPSteven
{
   private double total;
   private Direction p;
   private Stack<Direction> tempStack = new Stack<Direction>();
   
   public GPSteven()
   {
      total = 0;
   }
   
   public double getReTrip(Stack<Direction> directionList)
   {
      Direction p = directionList.peek();  
      System.out.println(p.firstReverse());
      total += p.getDistance();
      
      while (!(directionList.isEmpty()))
      {
          p = directionList.pop();
          System.out.println(p.nextReverse());
          total += p.getDistance();
      }

      return total;
   }
}