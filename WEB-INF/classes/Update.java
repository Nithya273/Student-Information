import java.sql.*;

class Update {
    public static void main(String args[]) 
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from StudentInfo");
            System.out.println("Table is created");
            while (r.next())
                System.out.println(r.getInt(1) + "  " + r.getString(2)+" "+r.getString(3));
            r.close();
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}