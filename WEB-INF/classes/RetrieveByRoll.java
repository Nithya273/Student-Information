import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RetrieveByRoll extends HttpServlet
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
            String rno=req.getParameter("rollnumber");
            ResultSet r1 = s.executeQuery("select * from StudentInformation where rollnum="+"'"+rno+"'");
            String detailsrollno=req.getParameter("RollNumber");
            if(detailsrollno.equals("Get details"))
            {
            
            while (r1.next())
            {
            pw.print("<html><body>");
            pw.print(r1.getString(1) + "\n" + r1.getString(2)+"\n"+r1.getLong(3)+"\n"+r1.getString(4));
            pw.print("</html></body>");
            }
        }
    }
        catch (Exception e) 
        {
            System.out.println("Exception" + e);
        }
    }
}
        /*String n=req.getParameter("Name");
        ResultSet r2 = s.executeQuery("select * from StudentInformation where name="+"'"+n+"'");
        String detailsname=req.getParameter("fullName");
        if(detailsname.equals("Get details"))
            {
            while (r2.next())
            {
            pw.println("<html><body>");
            pw.println(r2.getString(1) + "  " + r2.getString(2)+" "+r2.getLong(3)+" "+r2.getString(4));
            pw.println("</html></body>");
            }
        }
        long phn=Integer.parseInt(req.getParameter("Phone"));    
        ResultSet r3 = s.executeQuery("select * from StudentInformation where phone="+"'"+phn+"'");
            String detailsphone=req.getParameter("Phonenumber");
           if(detailsphone.equals("Get details"))
            {
            while (r3.next())
            {
            pw.println("<html><body>");
            pw.println(r3.getString(1) + "  " + r3.getString(2)+" "+r3.getLong(3)+" "+r3.getString(4));
            pw.println("</html></body>");

            }
        }
        String ema=req.getParameter("email");
            ResultSet r4 = s.executeQuery("select * from StudentInformation where email="+"'"+ema+"'");
            String detailsemail=req.getParameter("Email");
            if(detailsemail.equals("Get details"))
            {
            while (r4.next())
            {
            pw.println("<html><body>");
            pw.println(r4.getString(1) + "  " + r4.getString(2)+" "+r4.getLong(3)+" "+r4.getString(4));
            pw.println("</html></body>");
            }
        }
        }
        catch (Exception e) 
        {
            System.out.println("Exception" + e);
        }*/

       /*try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
            String n=req.getParameter("Name");
            ResultSet r = s.executeQuery("select * from StudentInformation where name="+"'"+n+"'");
            String detailsname=req.getParameter("fullName");
            if(detailsname.equals("Get details"))
            {
            while (r.next())
            {
            pw.println("<html><body>");
            pw.println(r.getString(1) + "  " + r.getString(2)+" "+r.getLong(3)+" "+r.getString(3));
            pw.println("</html></body>");
            }
        }
        }
        catch (Exception e) 
        {
            System.out.println("Exception" + e);
        }
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
            pw.println(r.getString(1) + "  " + r.getString(2)+" "+r.getLong(3)+" "+r.getString(3));
            pw.println("</html></body>");

            }
        }
        }
        catch (Exception e) 
        {
            System.out.println("Exception" + e);
        }
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
            String ema=req.getParameter("email");
            ResultSet r = s.executeQuery("select * from StudentInformation where email="+"'"+ema+"'");
            String detailsemail=req.getParameter("Email");
            if(detailsemail.equals("Get details"))
            {
            while (r.next())
            {
            pw.println("<html><body>");
            pw.println(r.getString(1) + "  " + r.getString(2)+" "+r.getLong(3)+" "+r.getString(3));
            pw.println("</html></body>");
            }
        }
        }
        catch (Exception e) 

        {
            System.out.println("Exception" + e);
        }
        
    }
}*/