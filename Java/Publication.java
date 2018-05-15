public abstract class Publication
{
   private String title;
   private String first;
   private String last;
   private int year;
   
   /** Constructor for Publications.
      @param title the title of the publication
      @param name the name of the author in "Firstname Lastname" form
      @param year the year it was published
   */
   public Publication(String title, String name, int year)
   { 
      this.title = title;
      this.first = name.substring(0,name.indexOf(" "));
      this.last = name.substring(name.indexOf(" ") + 1, name.length());
      this.year = year;
   }
   
   /** Abstract method returns the toString with HTML tags
      @return The toString value with the appropriate HTML tags
   */
   public abstract String toHTMLString();
   
   /** Returns the title of the work
      @return the title as a String
   */
   public String getTitle()
   {
      return title;
   }
   
   /**Returns the author's full name
      @return the author's full name in "First Last" format
   */
   public String getAuthor()
   {
      return first + " " + last;
   }
   
   /** Returns the year the work was published
      @return the publication year
   */
   public int getYear()
   {
      return year;
   }

   /** Returns the author's first name
      @return the author's first name.
   */
   public String getFirst()
   {
      return first;
   }

   /** Returns the author's last name
      @return the author's last name.
   */
   public String getLast()
   {
      return last;
   }
}