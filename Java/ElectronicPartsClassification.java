import java.util.StringTokenizer;
import java.util.ArrayList;
public class ElectronicPartsClassification
{
   String[] result;
   int productCount = 0; //number of products analyzed
   //Definition of "Special Product"
   
   
   public String[] classifyParts(String[] trainingData, String[] testingData)
   {  
      train(trainingData);
      return result;
   }
   
   public void train(String[] data)
   {
      
      String productNumber = "";
      Integer region;
      double quantityPurchased;
      float productCost;
      int productrecords = 0;
      String temp;
      String SP;
      ArrayList<Integer> costSetr1 = new ArrayList<Integer>();
      ArrayList<Integer> CostSetr2 = new ArrayList<Integer>();
      
      for (String record : data)
      {
          StringTokenizer token = new StringTokenizer(record, ",");
          
          temp = token.nextToken();
          if (!(productNumber.equals(temp)))
          {
            // calculateProduct(productNumber, reg1info, reg2info); 
            productNumber = temp;
            productrecords = 1;
          }
          
          productrecords++;
          for (int x = 0; x < 5; x++)
              token.nextToken();
          region = Integer.parseInt(token.nextToken());
          for (int x = 0; x < 16; x++)
              token.nextToken();
          
          quantityPurchased = Double.parseDouble(token.nextToken());
          productCost = Float.parseFloat(token.nextToken());
          
          for (int x = 0; x < 3; x++)
               token.nextToken();
          
          SP = token.nextToken();
          
          System.out.println(productNumber);
          System.out.println(region);
          System.out.println(quantityPurchased);
          System.out.println(productCost);
          System.out.println(SP);
          
          if (region == 1)
          {
            costSetr1.add(productCost);
          }
          else
          {
            costSetr2.add(productCost);
          }
       
       
       
     }
  //   calculateProduct(productNumber, reg1info, reg2info);
   }
   
   public void Test(String[] testData)
   {
      for (int v = 1; 1 > testData.length; v++)
      {
      
      }
   }
   
   public void calculateProduct(String productID, int param1, int param2, int param3, int param4)
   {  

   }
}