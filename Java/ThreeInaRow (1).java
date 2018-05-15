/** 
   @author Steven Burrell
   04/13/2017
   ThreeInaRow - A Class to solve a 3 in a row puzzle using a starting text file that defines the starting board
   and its inital conditions.
*/
import java.io.*;
import java.util.*;


public class ThreeInaRow
{
    private String[][] board;
    int boardSize;
    boolean possible;
    boolean allComplete;
    int Wcount;
    int Bcount;
  
  public ThreeInaRow(String filename, int boardSize) throws IOException
  {
      possible = true;
      allComplete = false;
      this.boardSize = boardSize;
      board = new String[boardSize][boardSize];
      initTable();
      readFile(filename);
      
      if (isPossible())
        fill(0,0);
      if (!allComplete)
        possible = false;

  }
  
  private boolean isPossible()
  {
    if ((boardSize % 2) != 0)
        return false;
    if (!stateCheck())
        return false;
    
    return true;
  }

  public void readFile(String filename) throws IOException
  { 
    try {
    
    File inFile = new File(filename);
    Scanner thing = new Scanner(inFile);
    
    String temp = "";
    int rcounter = 0, ccounter = 0;
 
    while (thing.hasNextLine())
    {
      temp = thing.nextLine();
      
      for (char j : temp.toCharArray())
      {
         if (j == 'B')
         {
         board[rcounter][ccounter] = "B";
         }
         else if (j == 'W')
         {
         board[rcounter][ccounter] = "W";
         }
         ccounter++;
      }
      ccounter = 0;
      rcounter++;
    }
    
    }
    catch (Exception e)
    {       System.out.println("File not Found");     }
      
  }
  
  public String toString()   //this method is not finished.
  {
    String result = "";
     for (String[] i : board)
     {
      for (String k : i)
      {
         result += (k + " ");
      }
      if (board[boardSize - 1] != i)
         result += "\n";
     }
     return result;
  }
  
  public String solution()   //this method is not finished.
  {
    if (possible)
    {
       String result = "|";
        for (String[] i : board)
        {
         for (String k : i)
         {
            result += k;
         }
         if (board[boardSize - 1] != i)
            result += "|";
        }
        return result;
     }
     else
     {
       return "NONE";
     }
  }
  
  public void initTable()
  {
     for (int i = 0; i < board.length; i++)
     {
      for (int j = 0; j < board.length; j++)
      {
         if ((board[i][j] != "B") && (board[i][j] != "W"))
            board[i][j] = "G";
      }
     }
  }
  
  public void fill(int entry1, int entry2)
  {
      if (board[entry1][entry2] != "G")  //the space is already full
         continuefill(entry1,entry2); 
      else                            
      {  
           board[entry1][entry2] = "W";
           
           if (stateCheck()) 
               continuefill(entry1,entry2);
           
           if (!allComplete)  
               board[entry1][entry2] = "B";
               if (stateCheck()) 
                continuefill(entry1,entry2);
          
           if (!allComplete)
               board[entry1][entry2] = "G";
       }
      
  }
  
  private void continuefill(int entry1, int entry2)
  {
   if (entry2 + 1 < boardSize)
       fill(entry1, entry2 + 1);
   else
       if (entry1 + 1 < boardSize)
           fill(entry1 + 1, 0);
    else
    {
      if (stateCheck() && rowColCheck())
         allComplete = true;
      else
         allComplete = false;
       }
  }


   /**Checks the state of the board for a row of 3 tiles with the same color either horizontally or vertically on the board
      @return true if the 
   */
   public boolean stateCheck()
   {
     int BinArow = 0;
     int WinArow = 0;
     // Test Horizontally for 3 colors in a row
     for (int i = 0; i < boardSize; i++)  {
       for (int k = 0; k < boardSize; k++)    {
           if (board[i][k] == "B") {
               BinArow++;
               WinArow = 0;
           }
           else if (board[i][k] == "W") {
               WinArow++;
               BinArow = 0;
           }
           else {
               WinArow = 0;
               BinArow = 0;
           }
           if ((BinArow >=3) || (WinArow >= 3))
               return false;
       }
       WinArow = 0;
       BinArow = 0;
     }
     WinArow = 0;
     BinArow = 0;
     
     // Test Vertically for 3 colors in a row.
     
      for (int i = 0; i < boardSize; i++)  {
       for (int k = 0; k < boardSize; k++)    {
           if (board[k][i] == "B") {
               BinArow++;
               WinArow = 0;
           }
           else if (board[k][i] == "W") {
               WinArow++;
               BinArow = 0;
           }
           else {
               WinArow = 0;
               BinArow = 0;
           }
           if ((BinArow >=3) || (WinArow >= 3))
               return false;
       }
       WinArow = 0;
       BinArow = 0;
     }
     
     return true; 
   }
   
  private boolean rowColCheck()
  {
     int wNum = 0;
     int bNum = 0;
     // Check row... there's no other way to do this...
     for (int i = 0; (i < boardSize); i++)  {
       for (int k = 0; (k < boardSize); k++)    {
            if (board[i][k] == "W")
               wNum++;
            else 
               bNum++;
       }
       
       if (wNum != bNum)
           return false;
          
       bNum = 0;
       wNum = 0;
     }
     
     //now the coloumns... brace yourselves.
     for (int i = 0; (i < boardSize); i++)  {
       for (int k = 0; (k < boardSize); k++)    {
            if (board[k][i] == "W")
               wNum++;
            else
               bNum++;
       }
       
       if (wNum != bNum)
           return false;
       
       wNum = 0;
       bNum = 0;
     }
   
     return true;  
  }
}