/* 
* Author: Steven Burrell
* Due Date: December 4, 2015
* Class: CSCI 2000 Section: 43078
* Instructor: Dr.Smith
* Program Assignment: Java Program 3
* Program Title: FoodItem
* Program Description: Java class that contains a constructor method and toString method. The class
*   accepts a Food item name as a String, calories as an integer, and fat grams as an integer. This class also has a method to calculate
*   the pecentage of calories from fat and return that as a double.
*
* Plagiarism Statement:
*   I swear that I have not received or given aid on this program
*   beyond guidlines of the course including giving or receiving
*   specific code content.
*/

public class FoodItem
{
   private String name;  //Food item name as String
   private int calories; //Number of calories as int
   private int fatGrams; //Number of Fat Grams as int
   
   //A Constructor method That takes the name, calories, and fat grams or a new Food item
   public FoodItem(String n, int c, int f)
   {
      name = n;
      calories = c;
      fatGrams = f;
   }
   //returns the privaet String name of the Food item
   public String getName()
   {
      return name;
   }
   //returns the privaet String caolories of the Food item
   public int getCalories()
   {
      return calories;
   }
   //returns the privaet String fatGrams of the Food item
   public int getFatGrams()
   {
      return fatGrams;
   }
   //this setName method sets the private String name to the value of the String input n
   public void setName(String n)
   {
      name = n; //has no return statment
   }
   
   //this setCalories method the private integer calories to the value of the integer input c
   public void setCalories(int c)
   {
      calories = c;//has no return statment
   }
   
   //this setFatGrams method the private integer calories to the value of the integer input f
   public void setFatGrams(int f)
   {
      fatGrams = f; //has no return statment
   }
   
   
   
   //Calculates the grams from fat in Food item
   public int caloriesFromFat()
   {
      int fatCal = (fatGrams * 9); //multiply fatGrams by 9 and save the product as local variable fatCal
      return fatCal;
   }
   
   //Calculates and returns the percentage of calories from fat as a double
   public double percentFat()
   {
      //Test to make sure the User does not set calories to zero BEFORE calculating.
      if (calories == 0) { System.out.println("No Calories"); return 0.0;} 
      
      //If colories is not 0, mulitply calories from fat by 100 and divide by calories to get percentage     
      double fatPerc = (caloriesFromFat() * 100 / calories);
      return fatPerc;
   }
   
   //toString method that returns a one line String containing the name, calories, and grams of fat
   public String toString()
   {
      //Declares a local variable to store the String containing the object information.
      String info = "Name: " + name + " Calories: " + calories + " Fat Grams: " + fatGrams;
      return info;
   }
}