/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/28/2016
 	PURPOSE	: 	This Inventory class is used to store product information, manage a collection of products,
      calculate changes in Invertory from transactions. The Inventory Class can load infromation from a given file and 
      add clothing or jewelry to the Inventory.
 **/
import java.util.*;
import java.io.*;

public class Inventory
{
   private Map<String,Product> inventory;
   private File readFrom;
   private Scanner inFile;
   
   /**
      Contructor for the Inventory Object. It only initializes the inventory HashMap object. Takes no Arguments.
     */
   public Inventory()
   {
      inventory = new HashMap<String, Product>();
   }
   
   /**
      This method  creates a new Clothing item according the givin parameters and adds the item to the Inventory collection
      (if it is not already in the Inventory). 
      @param id The product ID
      @param description The product name or description
      @param price the price of the product
      @param units the number of this product that is in stock.
      @param size the size of the clothing item.
      @return True if the item was added, False it is already in the Inventory.
     */
   public boolean addClothing(String id, String description, double price, int units, String size)
   {
      Product vevo = inventory.get(id);
      if (vevo == null) 
      {
      inventory.put(id, new Clothing(id, description, price, units, size));
      return true;
      }
      return false;
   }
   
   /**
      This method  creates a new Jewelry item according the givin parameters and adds the item to the Inventory collection
      (if it is not already in the Inventory). 
      @param id The product ID
      @param description The product name or description
      @param price the price of the product
      @param units the number of this product that is in stock.
      @param karats the number of karats in the Jewelry item.
      @return True if the item was added, False it is already in the Inventory.
     */
   public boolean addJewelry(String id, String description, double price, int units, int karats)
   {
      if (inventory.get(id) == null) 
      {
      inventory.put(id, new Jewelry(id, description, price, units, karats));
      return true;
      }
      return false;
   }
   
   /**
      Increases the number of unints corresponding the the given Product ID to the given units.
      @param id the Product ID to increase
      @param units the number of units to add
      @return True if the item is in the Inventory, False if not.
     */
   public boolean addUnits(String id, int units)
   {
      if (inventory.get(id) != null)
      {
      inventory.get(id).addUnits(units);
      return true;
      }
      return false;
   }
   
   /**
      Decreases the number of unints corresponding the the given Product ID to the given units.
      @param id the Product ID to decrease
      @param units the number of units to subtract
      @return True if the item is in the Inventory and has enough to subtract, or False if not.
     */
   public boolean subtractUnits(String id, int units)
   {
      if (inventory.get(id) != null && inventory.get(id).getUnits() >= units)
      {
      inventory.get(id).subtractUnits(units);
      return true;
      }
      return false;
   }
   
   /**
      Remove the product associated with the given id from the Inventory.
      @param id the id of the product to be removed
      @return True if the item was in the Inventory.
     */
   public boolean deleteProduct(String id)
   {
      if (inventory.get(id) != null)
      {
      inventory.remove(id);
      return true;
      }
      return false;
   }
   
   /**
      Searches the Inventory to find discriptions that contain the given keyword. and return search results as a list of
      the products' information.
      @param keyword the word or phrase to search for
      @return a list of products whose descriptions contain the given keyword.
     */
   public String findProducts(String keyword)
   {
      String searchResult = "\n";
      for (Product item : inventory.values())
      {
         if (item.getDescription().contains(keyword))
         {
         searchResult += item.toString() + "\n";
         }
      }
      if (searchResult == "")
      {
         searchResult = "No Results Found";
      }
      return searchResult;
   }
   
   /**
      Retrives the product infromation correspoding to the given Product ID. If the item is not in the inventory "NOT FOUND"
      will be returned.
      @param id the product id of the item to find.
      @return the information for the retrieved item.
     */
   public String getProduct(String id)
   {
      if (inventory.get(id) != null)
      {
         return inventory.get(id).toString();
      }
      return "NOT FOUND";
   }
   /**
      Adds the total price values of all Products in the inventory and returns the total
      @return the total price value of all items in inventory. Takes no parameters.
      
     */
   public double value()
   {
      double total = 0;
      for (Product item : inventory.values())
      {
         total += (item.getUnits() * item.getPrice());
      }
      return total;
   }
   
   /**
      Takes a file name as input and Fills the inventory object with products listed in the File. 
      @param inputFile the name of the file to read from
      @return True if a File with the given name was is found and False otherwise.
     */
   public boolean loadProducts(String inputFile)throws IOException
   {
      try {
         readFrom = new File(inputFile);
         inFile = new Scanner(readFrom);
      }
      catch (Exception ex)
      {
         return false;
      }
      
      inFile.useDelimiter(",");
      while (inFile.hasNext())
      {
         String pid = inFile.next().trim();
         if (pid.equals("")) { break; }
         
         String pname = inFile.next().trim();
         String ptype = inFile.next().trim();
         double pprice = inFile.nextDouble();
         int punits = inFile.nextInt();
         if (ptype.equals("clothing"))
         {
            String sp = inFile.next().trim();
            addClothing(pid, pname, pprice, punits, sp);
         }
         else
         {
            int sp = inFile.nextInt();
            addJewelry(pid, pname, pprice, punits, sp);
         }            
      }
      return true;
   }
   
   
}