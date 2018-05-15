/**
 	@author Dr C
	
	Short program to test the basic functionality and syntax of methods in the SourcesList class
*/

import java.util.*;
import java.io.*;

public class SourcesListTest
{
	public static void main(String [] args) throws IOException  //throws exception
	{
		FileWriter fwriter = new FileWriter ("sources.html");
		PrintWriter outputFile = new PrintWriter(fwriter);

		Publication book    = new Book("The Letters of Mozart", "Emily Anderson", 1985, "Norton", "New York");
      Publication newbook  = new Book("Artemis Fowl", "Ion Colfer", 1995, "Norton", "New York");
      
      Publication oldbook    = new Book("The Letters of Mozart", "Emily Anderson", 1985, "Norton", "New York");


		Publication journal = new Journal("Beethoven Sonatas", "Alex Ringer", 1970, "Musical Quarterly", "56", "72-76");
		
		SourcesList sources = new SourcesList();
		System.out.println("\nAdding book ... " + sources.addSource(book));
		System.out.println("\nAdding journal ... " + sources.addSource(journal));
		System.out.println("\nAdding book again... " + sources.addSource(book));
      System.out.println("\nAdding newbook ..... " + sources.addSource(newbook));
		
		try {
			System.out.println("\nSearching works by Ringer ... " + sources.getSourcesByAuthor("Ringer"));
         System.out.println("\nAdding book ... " + sources.addSource(oldbook));
			System.out.println("\nSearching works about Mozart ... " + sources.getSourcesByTitle("Mozart"));
			System.out.println("\nSearching works about the Greatest Band Ever ... " + sources.getSourcesByTitle("Beatles"));
		}
		catch (NoSuchElementException exception)
		{
			System.out.println ("\n" + exception.getMessage());
		}
		
		System.out.println("\nThere are " + sources.count() + " sources: " + sources);
      System.out.println("\nAdding book ... " + sources.addSource(book));
		outputFile.print(sources.toHTMLString());
		outputFile.close();
	}	
}