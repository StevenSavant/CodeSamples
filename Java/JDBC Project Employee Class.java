import java.sql.*;
public class jdbcEmployeeClass
{
    private String FirstName = "";
    private String LastName = "";
    private String Myssn = "";

    public jdbcEmployeeClass(String fname, String lname, String ssn)
    {
        FirstName = fname;
        LastName = lname;
        Myssn = ssn;
    }

    public Double  getProjecthrs(String Pname) throws Exception
    {
        Double hrs = 0.00;
        Connection con = null;
        Statement stmt;
        ResultSet result;
        String query;
        try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql:///COMPANY",
                                                  "student", "simple16");
                if(!con.isClosed())
                    {
                        stmt = con.createStatement();
                        query = "SELECT Hours FROM WORKS_ON1 WHERE Pname = '" + Pname + "' AND Essn = " + Myssn;
                        result = stmt.executeQuery(query);
                        if(result.next())
                        hrs = result.getDouble(1);
                    }

            }
         catch(Exception e)
            {
                 System.err.println("Exception In EmployeeXClass Hours: " + e.getMessage());
            }

        return hrs;

    }

    public String getFname()
    {
        return FirstName;
    }

    public String getLname()
    {
        return LastName;
    }

}
