public class ProgrammingAssignment extends GradedActivity
{
   private double pointsObtained;
   private double pointsTotal;
   
   /** Constructs a new ProgrammingAssingmnet Object
     * @param pointsO the points obtained
     * @param pointT the total points possible
     */
   public ProgrammingAssignment(double pointsO, double pointsT)
   {
      super();
      setScore((pointsO / pointsT) * 100);
      pointsObtained = pointsO;
      pointsTotal = pointsT;
   }
   
   /** Calculates the Score.
     */
   public void CalculateScore()
   {
      setScore((pointsObtained / pointsTotal) * 100);
   }
   
   /** Sets a new value for pointObtained
     * @param newPoints the new number of points
     */
   public void setPointsObtained(double newPoints)
   {
      pointsObtained = newPoints;
      CalculateScore();
   }
   
   /** Sets a new value for total points
     * @param newTotal the new total number of points
     */
   public void setPointsTotal(double newTotal)
   {
      pointsTotal = newTotal;
      CalculateScore();
   }
   
   /** returns the number of points Obtained
     * @return the number of points obtained.
     */
   public double getPointsObtained()
   {
      return pointsObtained;
   }
   
   /** returns the number of points possible
     * @return the number of points possible.
     */
   public double getPointsTotal()
   {
      return pointsTotal;
   }
   
   /**@Overide*/
   public char getGrade()
   {
      char letter = super.getGrade();
      
      if (letter == 'F' || letter == 'D')
         return 'F';
      
      else
         return 'P';
   }
}