public class DiscreteQuiz
{
   public static void main(String[] args)
   {
   int k = 1;
   int sum = 0;
      while (k <= 11)
      {
         sum = sum + (10 * k);
         k = k + 1;
      } 
   int j = 1;
   while (j <= 11)
   { 
      sum = sum + (10 * j); 
      j = j + 1;
   }
   
   System.out.println(sum);
   }
}