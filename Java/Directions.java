/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/7/2016
 	PURPOSE	: 	This Directions Class Stack Data Structures to analyze directional input
   from a file, calculate total distance traveled, provide return trip directions
   and calculate the estimated travel time with consideration of left turns.
 **/
 
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class Directions
{
   private double total;
   private Stack<Direction> directionList;
   private Stack<Direction> temp;
   private File inFile;
   private Scanner file;
   Stack<Direction> tempStack = new Stack<Direction>();
   
   /**
      Contstructor for Directions Object, takes no arguments. It initialzes two private global Stacks.
   */
   public Directions()
   {
      directionList = new Stack<Direction>();
      tempStack = new Stack<Direction>();
   }
   
   /**
     Attempts to open the traget file and reads the direcitons while creating Direction ojbects and assemblying
     a Stack of Direction objects. Repetitive/incosistent directions are ignored.
     @param filename the name of the file to be read
     @return true if the file is found, false if the file was not found .
   */
   public boolean readFile(String filename) throws IOException
   {  
      try
      {
         inFile = new File(filename);
         file = new Scanner(inFile);
      }
      catch (FileNotFoundException ex)
      {
         System.out.println("File not Found");
         return false;
      }
      
      loadDirections();  
      return true;
   }
   
   /**
     Takes no arguments and Prints the directions in the reverse order given by the target file, switching the appropriate
     cardinal directions.
     @return the total distance traveled (in Miles)
   */
   public double returnTrip()
   {
      total = 0;
      Direction p;
      
      tempStack.push(directionList.pop());
      p = tempStack.peek();
      
      System.out.println(p.firstReverse());
      total += p.getDistance();
      
      while (!(directionList.isEmpty()))
      {
          tempStack.push(directionList.pop());
          p = tempStack.peek();
          System.out.println(p.nextReverse());
          total += tempStack.peek().getDistance();
      }
      
      while (!(tempStack.isEmpty()))
      {
         directionList.push(tempStack.pop());
      } 

      return total;

   }
   
   /**
     Takes no arguments and Prints the directions in the order given by the target file.
     @return the total distance traveled (in Miles)
   */
   public double getDirections()
   {
      total = 0;
      Direction p;
      
      while (!(directionList.isEmpty()))
      {
          tempStack.push(directionList.pop());
          total += tempStack.peek().getDistance();
      }
      
      p = tempStack.peek();
      System.out.println(p.firstToString());
      directionList.push(tempStack.pop());
      
      while (!(tempStack.isEmpty()))
      {
         p = tempStack.peek();
         System.out.println(p.nextToString());
         directionList.push(tempStack.pop());
         
      }
      
      return total;
   }
   
   /**
     Takes one double as an argument and Prints the directions in the return Trip up to the given distance and returns the total
     distance traveled before reaching the limit.
     @param maxDistance the total distance that should be traveled
     @return the total distance traveled (in Miles)
   */
   public double returnTrip(double maxDistance)
   {
      total = 0;
      tempStack.push(directionList.pop());
      Direction p = tempStack.peek();
      boolean search = true;
      
      System.out.println(p.firstReverse());
      total += p.getDistance();
      
      while (!(directionList.isEmpty()))
      {
          tempStack.push(directionList.pop());
          p = tempStack.peek();
          
          if (total + p.getDistance() <= maxDistance && search)
          {
            System.out.println(p.nextReverse());
            total += p.getDistance();
            continue;
          }
          
          search = false;
      }
      while (!(tempStack.isEmpty()))
      {
         directionList.push(tempStack.pop());
      }
      
      return total;
   }
   
   /**
     Takes one double as an argument and Prints the directions in the original directions up to the given distance and returns the total
     distance traveled before reaching the limit.
     @param MaxDistance the total distance that should be traveled
     @return the total distance traveled (in Miles)
   */
   double getDirections(double MaxDistance)
   {
      total = 0;
      Direction p;
      boolean search = true;
      
      while (!(directionList.isEmpty()))
      {
          tempStack.push(directionList.pop());
      }
      
      p = tempStack.peek();
      System.out.println(p.firstToString());
      total += p.getDistance();
      
      directionList.push(tempStack.pop());
      
      while (!(tempStack.isEmpty()))
      {
         p = tempStack.peek();
         
         if (total + p.getDistance() <= MaxDistance && search)
         {
            System.out.println(p.nextToString());
            total += p.getDistance();
            directionList.push(tempStack.pop());
            continue;
         }
         
         search = false;
         directionList.push(tempStack.pop());
      }
      
      return total;
   }
   
   /**
     This method Takes no arguments and cycles throught the return Trip directions counting left turns and returns the
     estimated travel time at a rate of 1.5 minutes per mile, plus and additional 30 second (0.5) minutes per left turn.
     @return the total distance traveled (in Miles)
   */
   public int returnTripTime()
   {
      int leftTurns = 0;
      total = 0;
      double time;
      
      tempStack.push(directionList.pop());
      total += tempStack.peek().getDistance();
      
      while (!(directionList.isEmpty()))
      {
          total += directionList.peek().getDistance();
          if (tempStack.peek().getLeft().equals(directionList.peek().getDirection()))
          {
            leftTurns++;
          }
          tempStack.push(directionList.pop());
          
      }
      
      while (!(tempStack.isEmpty()))
      {
         directionList.push(tempStack.pop());
      }
      
      time = ((total * 1.5) + (0.5 * leftTurns));
      if (time % 1 >= 0.5)
      {
         return (int)Math.ceil(time);
      }
      else
      {
         return (int)Math.floor(time);
      }
   }
   
   /**
     This method Takes no arguments and cycles throught the original trip directions counting left turns and returns the
     estimated travel time at a rate of 1.5 minutes per mile, plus and additional 30 second (0.5) minutes per left turn.
     @return the total distance traveled (in Miles)
   */
   public int travelTime()
   {
      int leftTurns = 0;
      total = 0;      
      double time;
            
      while (!(directionList.isEmpty()))
      {
          tempStack.push(directionList.pop());
          total += tempStack.peek().getDistance();
      }
      
      directionList.push(tempStack.pop());
      while (!(tempStack.isEmpty()))
      {
         if (directionList.peek().getLeft().equals(tempStack.peek().getDirection()))
          {
            leftTurns++;
          }
          
          directionList.push(tempStack.pop());
      }
      
      time = ((total * 1.5) + (0.5 * leftTurns));
      if (time % 1 >= 0.5)
      {
         return (int)Math.ceil(time);
      }
      else
      {
         return (int)Math.floor(time);
      }
   }
   
   /**
     This private method is called only if the a file is succesfully found. It scans the given file associated with this instance
     creates Direction objects according the information on each line and stores them into a Stack to be used by this instance. repetitive
     instructions are skipped when reading the file.
   */
   private void loadDirections()
   {
      Direction dir;
      double distance = 0.0;
      String direct = "";
      String lastDirect = "";
      String street = "";
      double lastDistance = 0.0;
      
      while (file.hasNext())
      {
         distance = file.nextDouble();
         direct = file.next();
         street = file.nextLine();
         
         if (direct.equals(lastDirect))
         {
            // directionList.peek().addDistance(distance);
            continue;
         }
         
         dir = new Direction(distance, direct, street);
         directionList.push(dir);
         lastDirect = direct;
      }
   }
}