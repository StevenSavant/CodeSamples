import java.util.Scanner;
import java.io.*;
			
public class Pr0
{
   public static void main(String [ ] args) throws IOException
   {
      Scanner inputFile = new Scanner(new File("PC14p0.txt"));		
      String animal = inputFile.nextLine();
      System.out.println("My favorite animal is the " + animal +".");
      inputFile.close();
   }
}
