import java.sql.*;
import java.util.*;
import java.math.*;

public class jdbcSteven
{
    private static ArrayList<jdbcEmployeeClass> EmployeeList = new ArrayList<jdbcEmployeeClass>();
    private static ArrayList<String> ProjectList = new ArrayList<String>();
    static Connection con = null;
    static Statement stmt;
    static ResultSet result;
    static String query;
    static String fullname;
    static String ofname;
    static String olname;
    static String ssn;

    public static void main(String Args[])
    {
        try
          {
              Class.forName("com.mysql.jdbc.Driver").newInstance();
              con = DriverManager.getConnection("jdbc:mysql:///COMPANY",
                                                "student", "simple16");

              if(!con.isClosed())
                  {
                      stmt = con.createStatement();
                      query = "SELECT * FROM EMPLOYEE ORDER BY Fname";
                      result = stmt.executeQuery(query);
                      while(result.next())
                          {
                              ofname = result.getString("Fname");
                              olname = result.getString("Lname");
                              ssn = result.getString("Ssn");
                              jdbcEmployeeClass employee = new jdbcEmployeeClass(ofname, olname, ssn);
                              EmployeeList.add(employee);
                          }


                      query = "SELECT Pname FROM PROJECT";
                      result = stmt.executeQuery(query);
                      while(result.next())
                          {
                              ProjectList.add(result.getString("Pname"));
                          }
                  }
          }
      catch(Exception e)
          {
              System.err.println("Exception: " + e.getMessage());
          }
      finally
          {
         try
             {
                 if(con != null)
                     con.close();
                 printResults();
             }
         catch(SQLException e) {}
          }
    }

    public static void printResults()
    {
        double myhours = 0.0;
        double totalhours = 0.0;
        for(int i = 0; i < EmployeeList.size(); i++)
            {
                jdbcEmployeeClass e = EmployeeList.get(i);
                String Fullname = e.getFname() + " " + e.getLname();
                System.out.println(Fullname);

                for (String j : ProjectList)
                    {
                        try { myhours += e.getProjecthrs(j); }
                        catch (Exception ee) { continue; }
                        if (myhours != 0.0)
                            {
                                System.out.printf("     %-15s %4.2f", j, myhours );
                                totalhours += myhours;
                                System.out.println();
                            }
                        myhours = 0.0;
                    }
                PrintTotal(totalhours);
                totalhours = 0;


            }
    }

    public static void PrintTotal(double thours)
    {
        thours = Math.round(thours);
        String n = "" + thours;
        String hyps = "";
        for (int x = 0; x < n.length();x++)
	    {
                hyps += "-";
            }
        if (thours != 0.0)
            {
                System.out.printf("%26s" + "\n", hyps);
                System.out.printf("%26.2f" + "\n", thours);
            }
        else { System.out.printf("%26s" + "\n", "Undetermined"); }
    }
}
