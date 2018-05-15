/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/7/2016
 	PURPOSE	: 	This Direction class stores instances of directions producted by the DirectionS class. 
   Each Direction instance stores the cardinal direction of the directions statement, it's distance, the street name,
   it's reverse direction, and it's left turn direction
 **/

import java.text.DecimalFormat;
public class StevenDirection
{
   private double dis;
   private String dir;
   private String str;
   private String rev;
   private String left;
   private DecimalFormat dformat;
   
   /**
     Constructor for the Direction class. It takes the distance to travel, cardinal direction (in the format "XX" or "NO"),
     Street name as arguments and assigns the appropriate values to each private feild.
     @param distance The distance to travel
     @param direct The cardinal direction
     @param street The name of the street
   */
   public Direction(double distance, String direct, String street)
   {
      dformat = new DecimalFormat();
      dformat.setDecimalSeparatorAlwaysShown(false);
      
      dis = distance;
      str = street;
      
      if (direct.equals("NO"))
      {
         dir = "north";
         rev = "south";
         left = "west";
      }
      else if (direct.equals("WE"))
      {
         dir = "west";
         rev = "east";
         left = "south";
         
      }
      else if (direct.equals("SO"))
      {
         dir = "south";
         rev = "north";
         left = "east";
      }
      else
      {
         dir = "east";
         rev = "west";
         left = "north";
      }
   }

   /**
     Takes no arguments and returns a begining trip statment with directions for this instance.
     @return A formated begining trip statment giving the directions for this instance.
   */
   public String firstToString()
   {   
      String result = "Travel " + dformat.format(dis) + " miles(s) " + dir + " on " + str;
      return  result;
   }
   
   /**
     Takes no arguments and returns a continueing trip statment with directions for this instance.
     @return A formated begining trip statment giving the directions for this instance.
   */
   public String nextToString()
   {
      String result = "Turn " + dir + " and travel " + dformat.format(dis) + " mile(s) on " + str;
      return  result;
   }
   
   /**
     Takes no arguments and returns a begining reverse trip statment with directions for this instance.
     @return A formated reverse trip statment giving the directions for this instance.
   */
   public String firstReverse()
   {
      String result = "Travel " + dformat.format(dis) + " miles(s) " + rev + " on " + str;
      return  result;
   }
   
   /**
     Takes no arguments and returns a begining continuing reverse trip statment with directions for this instance.
     @return A formated reverse trip statment giving the directions for this instance.
   */
   public String nextReverse()
   {
      String result = "Turn " + rev + " and travel " + dformat.format(dis) + " mile(s) on " + str;
      return  result;
   }
   
   /**
     Returns the street name
     @return returns the street name
   */
   public String getStreet()
   {
      return str;
   }
   
   /**
     Returns the travel distance 
     @return distance traveled
   */
   public double getDistance()
   {
      return dis;
   }
   
   /**
     Returns the cardinal direction 
     @return the cardinal direction
   */
   public String getDirection()
   {
      return dir;
   }
   
   /**
     Returns the reverse cardinal direction 
     @return the reverse cardinal direction
   */
   public String getReverse()
   {  
      return rev;
   }
   
   /**
     Returns the cardinal direction that would be this instances left turn 
     @return the left turn cardinal direction
   */
   public String getLeft()
   {
      return left;
   }
}