import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RetrieveByPhone extends HttpServlet
{
     public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
    PrintWriter pw=res.getWriter();
    res.setContentType("text/html");
    try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
           long phn=Integer.parseInt(req.getParameter("Phone"));
            
            ResultSet r = s.executeQuery("select * from StudentInformation where phone="+"'"+phn+"'");
            String detailsphone=req.getParameter("Phonenumber");
            if(detailsphone.equals("Get details"))
            {
            while (r.next())
            {
            pw.println("<html><body>");
            pw.println(r.getString(1) + "  " + r.getString(2)+" "+r.getLong(3)+" "+r.getString(4));
            pw.println("</html></body>");

            }
        }
        }
        catch (Exception e) 
        {
            System.out.println("Exception" + e);
        }
    }
}