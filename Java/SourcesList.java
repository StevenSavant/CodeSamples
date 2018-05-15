/**
 	@author 
   AUTHOR   : Steven Burell
 	INSTRUCTOR: Dr. Cordova
	COURSE	: 	CSCI 2073
 	DATE   	: 	3/7/2016
 	PURPOSE	: 	A SourceList class that uses an ArrayList to hold bibliographic entries for publications in AP format.
*/
import java.util.ArrayList;
import java.util.NoSuchElementException;
public class SourcesList
{
   private ArrayList<Publication> list;
   
   /**
      Contstructor for the SourceList class. Takes no arguments and only intializes the Array to be used.
   */
   public SourcesList()
   {
       list = new ArrayList<Publication>();
   }
   
   /**
      Adds the given publication object to the Source List if it is not already in the list.
      @param source The publication object to be added to the list
      @return Returns true if the source is successfully added
   */
   public boolean addSource(Publication source)
   {
   
      if (this.contains(source) == false)
         {
         list.add(source);
         return true;
         }
      return false;
      
   }
   
   /**
      Provides a list of sources published by the given author.
      @param lastName The last name of the Author
      @return resultList A list of the publications in the source list by the author.
   */
   public String getSourcesByAuthor(String lastName)
   {
      String resultList = "";
      for (Publication entry : list)
      {
         if (entry.getAuthor().contains(lastName))
         {
            resultList += entry.toString() + "\n";
         }
      }
      
      if (resultList.equals(""))          //no item found
      {
         throw new NoSuchElementException("This Author has no works in the list");
      }
      
      return resultList;
      
   }
   
   /**
      Provides a list of sources that contain the given keyword.
      @param keyword The word to search for.
      @return resultList A list of the publications in the source list that contain the keyword.
   */
   public String getSourcesByTitle(String keyword)
   {
      String resultList = "";
      for (Publication entry : list)
      {
         if (entry.getTitle().contains(keyword))
         {
            resultList += entry.getTitle() + "\n";
         }
      }
      
      if (resultList.equals(""))
      {
         throw new NoSuchElementException("No works in the list contain this keyword");
      }
      
      return resultList;
   }
   
   /**
      Provides a list of all sources in the list in AP format. Takes no arguments.
      @return fullList The full list of sources in within the SourceList object.
   */
   public String toString()
   {
      String fullList = "";
      for (Publication entry : list)
         {
         fullList += entry.toString() + "\n";  //new line before next entry
         }
      return fullList;
   }
   
   /**
      Provides a list of all sources in the list in  HTML AP format. Takes no arguments.
      @return fullList The full list of sources in within the SourceList object (includes HTML line breaks).
   */
   public String toHTMLString()
   {
      String fullHTMLList = "";
      for (Publication entry : list)
         {
         fullHTMLList += entry.toHTMLString() + "<br/>"; //HTML line break before next entry
         }
      return fullHTMLList;
   }
   
   /**
      Provides the total number of publications in the list as an int.
      @return The number of publications in the list
   */
   public int count()
   {
      return list.size();
   }
   
   /**
      Private methode to determine if the list contains a given publication
      @return True if a publications bibliographic entry matches the entry of a publications object already
      within the SourceList object.
   */
   private boolean contains(Publication candidate)
   {
      for (int i = 0; i <= list.size() - 1; i++)
      {
         String value = list.get(i).toString();
         if (candidate.toString().equals(value))
         {
            return true;
         }
      }
      
      return false;
   }
}