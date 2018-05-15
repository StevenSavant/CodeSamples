public class DivingScoreTest
{
public static void main (String args[])
{
DivingScore luke = new DivingScore("SochiPlatform");
System.out.println("***Expecting ***");
System.out.println("Event ID: SochiPlatform Diver ID: Anonymous Dive 1 Scores: no scores");
System.out.println("***Actual \n" + luke);

//Part 2 Get above working first

boolean didItWork = luke.recordScore(2.5);
System.out.println("Expecting true: " + didItWork);

double[] a = new double[11];
a = luke.getScore();
System.out.println("Expecting 2.5: " + a[0]);


//Part 3

DivingScore fred = new DivingScore("LondonSpringboard", "USAfred", 1, 1.5, "8 8.5 8 8 7.5 7.5 7");

double total = fred.totalScore();
System.out.println("Expecting 54.5:  " + total);

System.out.println("Expecting Dropping high score of 8.5 by judge #2");
System.out.println("\tDropping high score of " 
    + fred.highestScore() + " awarded by judge #" + fred.highestJudge());


//Part 4

double totalAdjusted = fred.totalAdjustedScore();
System.out.println("\nExpecting 39.0: " + totalAdjusted);

//Part 5

double score = fred.finalScore();
System.out.println("\n Expecting 58.5: " + score);
//FYI: In actual diving this gets multiplied by another factor


} //end main
} //end class