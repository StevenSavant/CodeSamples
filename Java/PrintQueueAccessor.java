import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueAccessor
{
   private static Queue<String> hiddenPrintQueue;
   private static Object mutex = new Object();
   private PrintQueueAccessor()
   {
      // restrict public access
   }
   public static void writeToQueue(String msg)
   {
      if(hiddenPrintQueue == null)
      {
    	 synchronized (mutex) {
    		 //System.out.println("Create print Queue");
    		 if (hiddenPrintQueue==null)
    		 {
    			 hiddenPrintQueue = new LinkedList<String>();
    			 System.out.println("Create print Queue");
    		 }
    	 }
      }
      processPrintJob(msg);
   }
   
   private static void processPrintJob(String sampleString)
   {
      // handle print job here
	  System.out.println(sampleString);
   }
   public static boolean isPrintQueueInstantiated()
   {
      return !(hiddenPrintQueue == null);
   }   
}
