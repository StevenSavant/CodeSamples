public class Firewall implements CommDevice
{
   private String permittedReceiver;
   private String buffer;

   public Firewall(String pRecieve)
   {
      permittedReceiver = pRecieve;
   }
   
   public String getBuffer()
   {
      return buffer;
   }
   
   public void transmit(String destination, String message)
   {
      permittedReceiver = destination;
      buffer = message;
   }
   
   public boolean receive (String source, String message)
   {
      if (source.equals(permittedReceiver))
      {
         buffer = message;
         return true;
      }
      else
      {
         System.out.println("Attempted breach of firewall by " + source);
         return false;
      }
   }
}