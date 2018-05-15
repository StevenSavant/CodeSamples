public class Book extends Publication
{
   private String publisher;
   private String place;
 
   /** Creates an APA Book Citation
      @param title the title of the book
      @param author the name of the author in "Firstname Lastname" form
      @param year the year the book was published
      @param publisher The name of the publisher
      @param place The location the book was published
   */
   public Book(String title, String name, int year, String publisher, String place)
   {
      super(title, name,year);
      this.publisher = publisher;
      this.place = place;
   }
   
   /** Returns the same toString with HTML tags
      @return The toString value with the appropriate HTML tags
   */
   public String toHTMLString()
   {
      return getLast() + ", " +  getFirst() + " (" + getYear() + "). <I>" + getTitle() + "</I>. " + getPlace() 
                  + ": " + getPublisher() + ".";
   }

   /** Returns the book information in APA fromat.
      @return The APA book citation.
   */
   public String toString()
   {
      return getLast() + ", " +  getFirst() + " (" + getYear() + "). " + getTitle() + ". " + getPlace() 
                  + ": " + getPublisher() + ".";
   }
   /** Returns the name of the Publisher
      @return the Publisher's name
   */
   public String getPublisher()
   {
      return publisher;
   }
   
   /** Returns the location (City) where the book was published
      @return the name of the city, where the book was published
   */
   public String getPlace()
   {
      return place;
   }

}