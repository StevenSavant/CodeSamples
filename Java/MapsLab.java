import java.util.*;

public class MapsLab {
   
    public static void main(String[] args) {
       
		  Map<Character,Integer> charCounts = new HashMap<>();
        Map<String,Integer>    wordCounts = new HashMap<>();
       
		  String lyrics1 = "WORDS ARE FLOWING OUT LIKE AN ENDLESS RAIN INTO A PAPER CUP";
        String lyrics2 = "I AM HE AS YOU ARE HE AS YOU ARE ME AND WE ARE ALL TOGETHER";
		  
		  countChars(lyrics1, charCounts);
    	  System.out.println ("Character counts: " + charCounts);       
        wordLengths(lyrics2, wordCounts);
    	  System.out.println ("Character counts: " + wordCounts); 
    }
	 
	 /** Takes characters from a String object and uses them to build the corresponding character counts in a map. 
	     Accepts two arguments:
	 	  @param str - String containing characters to be counted
		  @param map - An (initially empty) Map that will contain each character and the number of times it appears in the string.
	*/
	 public static void countChars (String str, Map<Character,Integer> map)
	 {
      for (char n : str.toCharArray())
        if (map.get(n) == null)
        {
            map.put(n, 1);
        }
        else
        {
            int x = map.get(n);
            x++;
            map.put(n, x);
        }   
	 }
    
    /** Takes words from a String object and uses them to build a map whose keys are the words and whose 
		values are the number of times each word appears. 
	     Accepts two arguments:
	 	  @param str - String containing words to be stored in the map
		  @param map - An (initially empty) Map that will contain each word and its frequency.
	*/
	 public static void wordLengths (String str, Map<String,Integer> map)
	 {

	 }
}