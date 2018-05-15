/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/28/2016
 	PURPOSE	: 	This Clothing class extends Product and includes an instance for size
 **/
public class Clothing extends Product
{
   private String size;
   
   /**
      Creates a new Clothing instance, taking id, description, Product's price, and the number of initial units and size.
      @param id The id of the product
      @param description the name or description of the product
      @param price the price of the Product
      @param units the initial number of items this Product id
      @param size the size of this clothing peice.
     */
   public Clothing(String id, String description, double price, int units, String size)
   {
      super(id,description,price,units);
      this.size = size;
   }
   
   /**
      Returns this clothing's size as a String. Takes no parameters
      @return the clothing's size.
     */
   public String getSize()
   {
      return size;
   }
   
   /**
      Composes a string of this products information seperated by commas and returns the result. Takes no parameters.
      @return results the result of Concatenating all details of this item.
     */
   public String toString()
   {
      String normal = super.toString();
      return normal += "," + size;
   }
   
}