import java.util.*;

public class DivingScore
{
   private String diverID = "";
   private String eventID = "";
   private int diveNumber;
   private double tariff;
   private double[] scores = new double[11];
   
   public DivingScore(String eID)
   {
       /** This is a constructor method that takes only the event ID (eID)*/
       /* and assign variables: 1 to diveNumber, 0 to tariff, and "Anonymouse" to the diverID */
      diverID = "Anonymous";
      diveNumber = 1;
      tariff = 0;
      eventID = eID;
   }
   
   public DivingScore(String eID, String dID, int dNumber, double tar, String in_scores)
   {
      eventID = eID;
      diverID = dID;
      diveNumber = dNumber;
      tariff = tar;
      this.setScores(in_scores);
   }

   
   public void setScores(String in_scores)
   {
      String rScore = "";
      
      for (int i = 0; i < 11; i++)
      {
         if (in_scores.indexOf(" ") == -1 )
          { 
          scores[i] = Double.parseDouble(in_scores);
          break; 
          }
         else
         {
            rScore = in_scores.substring(0,in_scores.indexOf(" "));
            scores[i] = Double.parseDouble(rScore);
            in_scores = in_scores.substring(in_scores.indexOf(" ")+1,in_scores.length());
         } 
      }
   }
   
   public boolean recordScore(double new_score)
   {
      for (int z = 0; z < 11;z++)
      {
         if (scores[z] == 0)
         {
         scores[z] = new_score;
         return true;
         }
      }
      return false;
   }
   
   public void setTariff(double tar)
   {
      tariff = tar;
   }
   
   public double totalScore()
   {
      double Total = 0;
      
      for (int x = 0; x < 11; x++)
      {
         Total += scores[x];
      }
      
      return Total;
   }
   
   public double totalAdjustedScore()
   {
      double max = 0;
      double min = 10;
      
      for (double score : scores)
      {
         //this for Loop sets the MAX and MIN values
         if (score == 0) {continue;} //skip blank slots
         if (max < score)
         {
            max = score;
         }
         if (min > score)
         {
            min = score;
         }
      }
      
      double adjTotal = 0;
      
      for (double score : scores)
      {
         if (min < score && max > score)
         {
         // if not the min or max value
         adjTotal += score;
         }
      }
      
      return adjTotal;
      
   }
   
   public double finalScore()
   {
      double finalscore = this.totalAdjustedScore() * tariff;
      return finalscore;
   }
   
   public double highestScore()
   {
      double max = 0;
      
      for (double score : scores)
      {
         //similar loop, with min romoved
         if (score == 0) {continue;} //skip blank slots
         if (max < score)
         {
            max = score;
         }
      }
      
      return max;
   }
   
   public int highestJudge()
   {
      double hs = this.highestScore();
      
      for (int x = 0; x < scores.length - 1; x++)
      {
         if (scores[x] == hs)
         {
            return x + 1;
         }
      }
      System.out.println("Judge not found");
      int y = 0;
      return y;
   }
   
   public String toString()
   {
      String info = "";
      String Str_scores = "";
      
      if (this.totalScore() == 0.0)
      {
         Str_scores = "no scores";
      }
      else
      {
        for (double score : scores)
         {
            Str_scores += score + " ";
         }
      }
      
      info = "Event ID: " + eventID + " Diver ID: " + diverID + " Dive " + diveNumber + " Scores: " + Str_scores;
      return info;  
   }
   
   public String getEventID()
   {
      return eventID;
   }
   
   public String getDiverID()
   {
      return diverID;
   }
   
   public int getDiveNumber()
   {
      return diveNumber;
   }
   
   public double getTariff()
   {
      return tariff;
   }
   
   public double getCount()
   {
      double count = 0;
      for (double score : scores)
      {
         if (score == 0)
         {
         continue;
         }
         count++;
      }
      
      return count;
   }
   
   public double[] getScore()
   {
      return scores;
   }
   
   public void setEventID(String newEID)
   {
      eventID = newEID;
   }
   
   public void setDiverID(String newDID)
   {
      diverID = newDID;
   }
   
   public void setDiveNumber(int newDNumber)
   {
      diveNumber = newDNumber; 
   }
}