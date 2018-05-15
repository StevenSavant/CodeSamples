public class Direction
{
   int dis;
   String dir;
   String str;
   
   public Direction(int distance, String direct, String street)
   {
      dis = distance;
      dir = direct;
      str = street;
   }
   
   public void addDistance(int newDistance)
   {
      dis += newDistance;
   }
   
   public String toString()
   {
      String tdir = "??";
      
      if (dir.equals("NO"))
      {
         tdir = "north";
      }
      else if (dir.equals("WE"))
      {
         tdir = "west";
      }
      else if (dir.equals("SO"))
      {
         tdir = "south";
      }
      else
      {
         tdir = "east";
      }
      
      String result = dis + " miles(s) " + tdir + " on " + str;
      return  result;
   }
   
   public int getDistance()
   {
      return dis;
   }
   
   public String reverse()
   {
      String rev = "??";
      
      if (dir.equals("NO"))
      {
         rev = "south";
      }
      else if (dir.equals("WE"))
      {
         rev = "east";
      }
      else if (dir.equals("SO"))
      {
         rev = "north";
      }
      else
      {
         rev = "west";
      }
      
      String result = dis + " miles(s) " + rev + " on " + str;
      return  result;
   }
}