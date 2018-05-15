import java.io.*;
public class InventoryTest
{
   public static void main(String[] args) throws IOException
   {
      Inventory store = new Inventory();
      store.addJewelry ("JW4556", "gold ring", 299.95, 5, 16);
      store.addJewelry ("JW4557", "diamond ring", 499.95, 5, 16);
      store.addJewelry ("JW4558", "silver earrings", 9.95, 10, 2);
      store.addClothing("CL2332", "wool sweater", 39.95, 10, "SM");
      store.addClothing("CL2333", "leather belt", 14.95, 20, "MM");
      System.out.printf("\nTotal inventory value: $%5.2f \n", store.value());
      System.out.println("\nLooking for JW4557 ... " + store.getProduct("JW4557"));
      System.out.println("\nLooking for CL2332 ... " + store.getProduct("CL2332"));
      System.out.println("\nLooking for CL2233 ... " + store.getProduct("CL2233"));
      System.out.println("\nProducts containing 'ring' ... " + store.findProducts("ring"));
      System.out.println("\nLoading input file ... " + store.loadProducts("products2.txt"));
      /*
      System.out.printf("\nTotal inventory value: $%5.2f \n", store.value());
      System.out.println("\nLooking for JW1222 ... " + store.getProduct("JW1222"));
      System.out.println("\nLooking for CL2222 ... " + store.getProduct("CL2222"));
      System.out.println("\nDeleting CL2223 ... " + store.deleteProduct("CL2223"));  
      System.out.println("\nDeleting JW1222 ... " + store.deleteProduct("JW1222"));
      System.out.println("\nProducts containing 'ring' ... " + store.findProducts("ring"));
      System.out.println("\nSubtracting 15 units from CL2222 ... " + store.subtractUnits("CL2222", 15));
      System.out.println("\nAdding 10 units to CL2222 ... " + store.addUnits("CL2222", 10));
      System.out.println("\nSubtracting 15 units from CL2222 ... " + store.subtractUnits("CL2222", 15));
      System.out.println("\nLooking for CL2222 ... " + store.getProduct("CL2222")); 
      System.out.println("\nProducts containing 'watch' ... " + store.findProducts("watch"));   
      */     
   }
}