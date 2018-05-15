public class Journal extends Publication
{
   private String name;
   private String vol;
   private String pages;
   
   /** Creates an APA Journal Citation
      @param title the title of the Journal
      @param author the name of the author in "Firstname Lastname" form
      @param year the year the Journal was published
      @param name The name of the Journal
      @param vol The vol the Journal
      @param pages The pages of the Journal being cited
   */
   public Journal(String title, String author, int year,String name, String vol, String pages)
   {
      super(title, author,year);
      this.name = name;
      this.vol = vol;
      this.pages = pages;
   }
   
   /** Returns the same String as the toString method with apprpriate HTML tags
      @return the APA Journal citation with HTML tags
   */
   public String toHTMLString()
   {
      return getLast() + ", " +  getFirst() + " (" + getYear() + "). " + getTitle() + ". " + "<I>" 
         + getName()+ "</I>" + ". " + getVol() + ", " + getPages() + ".";
   }
   
   /** Returns the APA Journal Citation
      @returns the APA Journal Citation
   */
   public String toString()
   {
      return getLast() + ", " +  getFirst() + " (" + getYear() + "). " + getTitle() + ". " + getName() 
                  + ". " + getVol() + ", " + getPages() + ".";
   }
   
   /** Returns the name of the Journal
      @returns the name of the Journal
   */
   public String getName()
   {
      return name;
   }
   
   /** Returns the name of the volume
      @returns the name of the volume
   */
   public String getVol()
   {
      return vol;
   }
   
   /** Returns the pages being cited "00-99"
      @returns the pages being cited.
   */
   public String getPages()
   {
      return pages;
   }

}