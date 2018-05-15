public class Analysis
{
   public static void main(String Args[])
   {
      for (int i = 12; i <= 22; i++)
      {
            long operations = Analyzer.test(i, 30009331);
            System.out.println(i + "\t" + operations);
      }
   }
}