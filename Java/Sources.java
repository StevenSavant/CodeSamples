/**
 	@author Dr C
	
	Short program to test the basic functionality and syntax of classes in the 
	Publication hierarchy.
*/

import java.util.*;
import java.io.*;

public class Sources
{
	public static void main(String [] args) throws IOException  //throws exception
	{
		FileWriter fwriter = new FileWriter ("sources.html");
		PrintWriter outputFile = new PrintWriter(fwriter);
		outputFile.println("<html>" + "\n" + "<body>");

		Publication book    = new Book("The Letters of Mozart", "Emily Anderson", 1985, "Norton", "New York");
		Publication journal = new Journal("Beethoven Sonatas", "Alex Ringer", 1970, "Musical Quarterly", "56", "72-76");
		Publication book2    = new Book("Killing Lincoln", "Bill O'Reilly", 2011, "Norton", "New York");
		Publication journal2 = new Journal("Quicksort Revisited", "Raj Reddy", 1972, "ACM Computing Reviews", "12", "42-54");

		System.out.println(book.toHTMLString());
		System.out.println(journal.toHTMLString());
		System.out.println(book2.toHTMLString());
		System.out.println(journal2.toHTMLString());

		outputFile.print("<P>" + book.toHTMLString() + "</P>");
		outputFile.print("<P>" + journal.toHTMLString() + "</P>");
		outputFile.print("<P>" + book2.toHTMLString() + "</P>");
		outputFile.println("<P>" + journal2.toHTMLString() + "</P>");
		
		outputFile.print("</html>" + "\n" + "</body>");
		outputFile.close();
	}	
}