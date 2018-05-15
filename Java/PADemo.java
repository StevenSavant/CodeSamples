
/**
   This program demonstrates the Programming Assignment class,
   which extends the GradedActivity class.
*/

public class PADemo
{
   public static void main(String[] args)
   {
     	ProgrammingAssignment p1 = new ProgrammingAssignment(28,30);
		GradedActivity p2 = new ProgrammingAssignment(0,30);
   
      System.out.println (p1.getPointsObtained());
		System.out.println (p1.getPointsTotal());
		System.out.println (p1.getScore());  
      System.out.println (p1.getGrade());  
      
		System.out.println (p2.getScore());  
      System.out.println (p2.getGrade());  
		
      p1.setPointsObtained(20);
		p1.setPointsTotal(40);
		System.out.println (p1.getScore());  
      System.out.println (p1.getGrade());  
	}  
}
