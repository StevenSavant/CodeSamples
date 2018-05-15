
	/**
    * This program can be used to test the Directions class methods.
  	 *
	 * @author Dr.C.
    */
import java.io.*;
public class DirectionsTest
{
   public static void main(String[] args) throws IOException
   {    
      Directions route = new Directions();
  		
      System.out.println("File opened correctly? " + route.readFile("directions.txt"));
      
      System.out.println("\nDirections from source to destination:");
      double total = route.getDirections();
      System.out.printf("Total miles: %.1f \n", total);
      System.out.println("Total time: " + route.travelTime() + " minutes");
      
      System.out.println("\nDirections from destination to source:");
      total = route.returnTrip();
      System.out.printf("Total miles: %.1f \n", total);
      System.out.println("Total time: " + route.returnTripTime() + " minutes");
      
      System.out.println("\nDirections from source to destination not exceeding 10 miles:");
      double actual = route.getDirections(10);
      System.out.printf("Actual miles: %.1f \n", actual);
      System.out.println("\nDirections from destination to source not exceeding 10 miles:");
      actual = route.returnTrip(10);
      System.out.printf("Actual miles: %.1f \n", actual);     
   }
}