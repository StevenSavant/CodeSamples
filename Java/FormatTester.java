import java.text.DecimalFormat;
public class FormatTester
{
   public static void main(String[] args)
   {
      DecimalFormat dformat = new DecimalFormat();
      dformat.setDecimalSeparatorAlwaysShown(false);
      double x = 2.5;
      double y = 2.0;
      
      System.out.println(dformat.format(x));
      System.out.println(dformat.format(y));
   }
}