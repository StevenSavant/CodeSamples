/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/28/2016
 	PURPOSE	: 	This an abstract Product class the defines the basic characteristics of Products and their shared methods.
 **/
public abstract class Product
{
   private String id;
   private String description;
   private double price;
   private int units;
   
   /**
      Creates a new product instance, taking id, description, Product's price, and the number of initial units
      @param id The id of the product
      @param description the name or description of the product
      @param price the price of the Product
      @param units the initial number of items this Product id
     */
   public Product(String id, String description, double price, int units)
   {
      this.id = id;
      this.description = description;
      this.price = price;
      this.units = units;
   }
   
   /**
      Adds the number of given units to the amount already stored in this Product instance. Returns nothing
      @param additional the number of units to add
     */
   public void addUnits(int additional)
   {
      units = units + additional;
   }
   
   /**
      subtracts the number of given units from the amount already stored in this Product instance. Returns nothing
      @param deductions the number of units to subtract
     */
   public void subtractUnits(int deductions)
   {
      units = units - deductions;
   }
   
   /**
      Composes a string of this products information seperated by commas and returns the result. Takes no parameters.
      @return results the result of Concatenating all details of this object.
     */
   public String toString()
   {
      String result = "";
      result += id + "," + description + "," + price + "," + units;
      return result;
   }
   
   /**
      Returns the number of items with this product id. Takes no parameteres.
      @return the number of items
     */
   public int getUnits()
   {
      return units;
   }
   
   /**
      Returns the description(name) of the item with this product id. Takes no parameteres.
      @return the item description
     */
   public String getDescription()
   {
      return description;
   }
   
   /**
      Returns the price of this product. Takes no parameteres.
      @return the price of the product
     */
   public double getPrice()
   {
      return price;
   }
   
}