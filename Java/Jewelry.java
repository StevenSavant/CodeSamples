/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	4/28/2016
 	PURPOSE	: 	This Jewelry class extends Product and includes an instance for karats
 **/
public class Jewelry extends Product
{
   private int karats;
   
   /**
      Creates a new Jewelry instance, taking id, description, Product's price, and the number of initial units and karats.
      @param id The id of the product
      @param description the name or description of the product
      @param price the price of the Product
      @param units the initial number of items this Product id
      @param karats karats in the Jewelry.
     */
   public Jewelry(String id, String description, double price, int units, int karats)
   {
      super(id,description,price,units);
      this.karats = karats;
   }
   
   /**
      Returns the number of karats in this item's Jewel as an Integer. Takes no parameters
      @return the number of karats
     */
   public int getKarats()
   {
      return karats;
   }
   
   /**
      Composes a string of this products information seperated by commas and returns the result. Takes no parameters.
      @return results the result of Concatenating all details of this item.
     */
   public String toString()
   {
      String normal = super.toString();
      return normal += "," + karats;
   }
   
}