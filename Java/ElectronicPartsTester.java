import java.util.Scanner;
import java.util.Queue;
import java.io.*;
import java.util.LinkedList;
public class ElectronicPartsTester
{
   public static void main(String[] args) throws IOException
   {
      File source = new File("example_data 2.csv");
      Scanner inFile = new Scanner(source);
      int size = 0;
      Queue<String> preList = new LinkedList<String>();
      
      while (inFile.hasNextLine())
      {
         size++;
         preList.add(inFile.nextLine());
      }
      String[] inList = new String[size];
      
      for (int i = 0; i > inList.length ; i ++)
      {
         inList[i] = preList.remove();
      }
      
      
      
      String sampleRecord1 = "10283064,108,00:00.0,15.36,15.36,1,1,63,A,1,1,B,L,ST,00:00.0,12,24,195,2290,IN_HOUSE,365,N,4.46,1,13.98,B,A,1,No";
      String sampleRecord2 = "1249,40,00:00.0,59.05,59.05,1,1,25,B,1,1,B,L,ST,00:00.0,4,18,293,1538,IN_HOUSE,90,N,15,1,48.96,B,B,4,Maybe";
      String sampleRecord3 = "100586,19,00:00.0,19.86,6.21,1,1,22,B,1,1,B,L,ST,00:00.0,10,25,208,2514,IN_HOUSE,21,N,2,0.25,3.34,B,A,4,Yes";
      String[] sampleSet = { sampleRecord1, sampleRecord2, sampleRecord3};
      
      String sampleTRecord1 = "10283064,108,00:00.0,15.36,15.36,1,1,63,A,1,1,B,L,ST,00:00.0,12,24,195,2290,IN_HOUSE,365,N,4.46,1,13.98,B,A,1,";
      String sampleTRecord2 = "1249,40,00:00.0,59.05,59.05,1,1,25,B,1,1,B,L,ST,00:00.0,4,18,293,1538,IN_HOUSE,90,N,15,1,48.96,B,B,4,";
      String sampleTRecord3 = "100586,19,00:00.0,19.86,6.21,1,1,22,B,1,1,B,L,ST,00:00.0,10,25,208,2514,IN_HOUSE,21,N,2,0.25,3.34,B,A,4,";
      String[] sampleTSet = { sampleTRecord1, sampleTRecord2, sampleTRecord3};
      
      ElectronicPartsClassification epc = new ElectronicPartsClassification();
      
      epc.classifyParts(sampleSet, sampleTSet);
   }
}