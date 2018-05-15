import java.io.*;
public class ContestPractice
{
   public static void main(String[] args)throws IOException
   {
      //Padding numbers
      int n = 7;
      int j = 0;
      int r = 2;
      int p = 1;
      
      String npadded = String.format("%02d", n);
      String jpadded = String.format("%02d", j);
      String rpadded = String.format("%02d", r);
      String ppadded = String.format("%02d", p);
      
      System.out.println(npadded);
      System.out.println(jpadded);
      System.out.println(rpadded);
      System.out.println(ppadded);
      System.out.println("********** \n");
      
      //Converting Time to decimal
       String time1 = "01:00";
       String time2 = "12:30";
       String time3 = "15:50";
       
       String[] timeset = {time1, time2, time3};
       for (String time : timeset)
       {
          String time1hour = time.substring(0,time.indexOf(":"));
          String time1minute = time.substring(time.indexOf(":") + 1);
          
          int hour = Integer.parseInt(time1hour);
          int minute = Integer.parseInt(time1minute);
          double newTime = hour + (minute/60.0); 
          
          System.out.println(newTime);
       }
       
       //
   }
}