import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class Internal extends HttpServlet
{  
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
{  
    res.setContentType("text/html");
    PrintWriter pw=res.getWriter();
    String op=req.getParameter("button");
    if(op==null)
    {
     pw.println("Please select a button");
    }
    else if(op.equals("Search by RollNumber"))
    {
        pw.println("<html><body>");
        pw.println("<form method='get' action='Retrieve'>");
        pw.println("<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");
        pw.println("<div class=\"form__group\">");
        pw.println("<input type=\"text\" class=\"form__input\" id=\"name\" placeholder=\"Roll Number\" required=\"\" name=\"rollnumber\">");
        pw.println("<label for=\"name\" class=\"form__label\">Roll Number</label>");
        pw.println("<input type='submit' value='Get details' name='RollNumber'>");
        pw.println("</div>");
        pw.println("</form>");
        pw.println("<style>");
        pw.println("*::after,*::before");
        pw.println(" margin: 0;");
        pw.println(" padding: 0;");
        pw.println("  box-sizing: inherit;");
        pw.println("font-size: 62,5%;");
        pw.println("}");
        pw.println("body {");
        pw.println("height: 100vh;");
        pw.println("width: 100%;");
        pw.println("background: #0f2027; ");
        pw.println(" background: linear-gradient(to right,#2c5364, #203a43, #0f2027);");
        pw.println(" justify-content: center;");
        pw.println("align-items: center;");
        pw.println("  height: 100vh;");
        pw.println("color: #fff");
        pw.println("}");
        pw.println(".form__label {");
        pw.println("font-family: 'Roboto', sans-serif");
        pw.println("font-size: 1.2rem");
        pw.println("margin-left: 2rem");
        pw.println("margin-top: 0.7rem");
        pw.println("display: block");
        pw.println("transition: all 0.3s");
        pw.println("transform: translateY(0rem);}");
 
pw.println(".form__input {");
pw.println("font-family: 'Roboto', sans-serif");
pw.println("color: #333;");
pw.println("font-size: 1.2rem");
pw.println("margin: 0 auto");
pw.println("padding: 1.5rem 2rem");
pw.println( "border-radius: 0.2rem");
pw.println("background-color: rgb(255, 255, 255)");
pw.println("border: none");
pw.println("width: 90%");
pw.println("display: block");
pw.println("border-bottom: 0.3rem solid transparent");
pw.println("transition: all 0.3s}");

pw.println(".form__input:placeholder-shown + .form__label {");
pw.println("opacity: 0");
pw.println("visibility: hidden");
pw.println("-webkit-transform: translateY(-4rem)");
pw.println(" transform: translateY(-4rem)}");
pw.println("</style>");
pw.println("</html></body>");

       /*try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
            String tb=req.getParameter("Name");    
            ResultSet r = s.executeQuery("select * from StudentInfo where rollno="+tb);
            pw.println("<html>");
            while (r.next())
            {
            pw.println("<html>");
            pw.println(r.getInt(1) + "  " + r.getString(2)+" "+r.getInt(3)+" "+r.getString(3));
            pw.println("</html>");
            }
    }
    catch (Exception e) 
{
    System.out.println("Exception" + e);
}
}*/
      /*  pw.println("<style>");
       pw.println("body{
        background-image: linear-gradient(to right , #cb2d3e , #ef473a);
    }");
    pw.println("position: absolute;");
    pw.println(".searchBox {
        position: absolute;");       
    }*/
}
    else if(op.equals("Search by name"))
    {
        pw.println("<html><body>");
        pw.println("<form method='post' action='Retrieve'>");
        pw.println("<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");
        pw.println("<div class=\"form__group\">");
        pw.println("<input type=\"text\" class=\"form__input\" id=\"name\" placeholder=\"Full name\" required=\"\" name=\"Name\">");
        pw.println("<label for=\"name\" class=\"form__label\">Full Name</label>");
        pw.println("<input type='submit' value='Get details' name='fullName'>");
        pw.println("</div>");
        pw.println("</form>");
        pw.println("<style>");
        pw.println("*::after,*::before");
        pw.println(" margin: 0;");
        pw.println(" padding: 0;");
        pw.println("  box-sizing: inherit;");
        pw.println("font-size: 62,5%;");
        pw.println("}");
        pw.println("body {");
        pw.println("height: 100vh;");
        pw.println("width: 100%;");
        pw.println("background: #0f2027; ");
        pw.println(" background: linear-gradient(to right,#2c5364, #203a43, #0f2027);");
        pw.println(" justify-content: center;");
        pw.println("display:flex;");
        pw.println("align-items: center;");
        pw.println("  height: 100vh;");
        pw.println("color: #fff");
        pw.println("}");
        pw.println(".form__label {");
 
pw.println(".form__input {");
pw.println("font-family: 'Roboto', sans-serif");
pw.println("color: #333;");
pw.println("font-size: 1.2rem");
pw.println("margin: 0 auto");
pw.println("padding: 1.5rem 2rem");
pw.println("border-radius: 0.2rem");
pw.println("background-color: rgb(255, 255, 255)");
pw.println("border: none");
pw.println("width: 90%");
pw.println("display: block");
pw.println("border-bottom: 0.3rem solid transparent");
pw.println("transition: all 0.3s}");

pw.println(".form__input:placeholder-shown + .form__label {");
pw.println("opacity: 0");
pw.println("visibility: hidden");
pw.println("-webkit-transform: translateY(-4rem)");
pw.println(" transform: translateY(-4rem)}");
pw.println("</style>");
pw.println("</html></body>");

    }
    else if(op.equals("Search by Phone Number"))
    {
        pw.println("<html><body>");
        pw.println("<form method='post' action='Retrieve'>");
        pw.println("<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");
        pw.println("<div class=\"form__group\">");
        pw.println("<input type=\"text\" class=\"form__input\" id=\"name\" placeholder=\"Phone Number\" required=\"\" name=\"Phone\" >");
        pw.println("<label for=\"name\" class=\"form__label\">Phone Number</label>");
        pw.println("<input type='submit' value='Get details' name='Phonenumber'/>");
        pw.println("</div>");
        pw.println("</form>");
        pw.println("<style>");
        pw.println("*::after,*::before");
        pw.println(" margin: 0;");
        pw.println(" padding: 0;");
        pw.println("  box-sizing: inherit;");
        pw.println("font-size: 62,5%;");
        pw.println("}");
        pw.println("body {");
        pw.println("height: 100vh;");
        pw.println("width: 100%;");
        pw.println("background: #0f2027; ");
        pw.println(" background: linear-gradient(to right,#2c5364, #203a43, #0f2027);");
        pw.println(" justify-content: center;");
        pw.println("align-items: center;");
        pw.println("  height: 100vh;");
        pw.println("color: #fff");
        pw.println("}");
        pw.println(".form__label {");
 
pw.println(".form__input {");
pw.println("font-family: 'Roboto', sans-serif");
pw.println("color: #333;");
pw.println("font-size: 1.2rem");
pw.println("margin: 0 auto");
pw.println("padding: 1.5rem 2rem");
pw.println( "border-radius: 0.2rem");
pw.println("background-color: rgb(255, 255, 255)");
pw.println("border: none");
pw.println("width: 90%");
pw.println("display: block");
pw.println("border-bottom: 0.3rem solid transparent");
pw.println("transition: all 0.3s}");

pw.println(".form__input:placeholder-shown + .form__label {");
pw.println("opacity: 0");
pw.println("visibility: hidden");
pw.println("-webkit-transform: translateY(-4rem)");
pw.println(" transform: translateY(-4rem)}");
pw.println("</style>");
pw.println("</html></body>");

        /*pw.println("<html><body>");
        pw.println("<center>");
        pw.println("<form action='Retrieve' method='post'>");
        pw.println("<input type='number' placeholder='Enter phone number' name='number'/>");
        pw.println("<input type='submit' value='Get details' name='Phone'/>");
        pw.println("</form>");
        pw.println("</center>");*/
        /*try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "nithya");
            Statement s = c.createStatement();
            String tb=req.getParameter("number");
            String details=req.getParameter("Phone");
            if(details.equals("Get details"))
            {
            ResultSet r = s.executeQuery("select * from StudentInformation where phone="+tb);
            while (r.next())
            {
            pw.println("<html>");
            pw.println(r.getInt(1) + "  " + r.getString(2)+" "+r.getInt(3)+" "+r.getString(3));
            pw.println("</html>");
            }
        }
    }
    catch (Exception e) 
{
    System.out.println("Exception" + e);
}*/
}
    else if(op.equals("Search by E-mail"))
    {
        pw.println("<html><body>");
        pw.println("<form method='post' action='Retrieve'>");
        pw.println("<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");
        pw.println("<div class=\"form__group\">");
        pw.println("<input type=\"text\" class=\"form__input\" id=\"name\" placeholder=\"E-mail\" required=\"\" name=\"email\" >");
        pw.println("<label for=\"name\" class=\"form__label\">E-mail</label>");
        pw.println("<input type='submit' value='Get details' name='Email'>");
        pw.println("</div>");
        pw.println("</form>");
        pw.println("<style>");
        pw.println("*::after,*::before");
        pw.println(" margin: 0;");
        pw.println(" padding: 0;");
        pw.println("  box-sizing: inherit;");
        pw.println("font-size: 62,5%;");
        pw.println("}");
        pw.println("body {");
        pw.println("height: 100vh;");
        pw.println("width: 100%;");
        pw.println("background: #0f2027; ");
        pw.println(" background: linear-gradient(to right,#2c5364, #203a43, #0f2027);");
        pw.println(" justify-content: center;");
        pw.println("align-items: center;");
        pw.println("  height: 100vh;");
        pw.println("color: #fff");
        pw.println("}");
        pw.println(".form__label {");
 
pw.println(".form__input {");
pw.println("font-family: 'Roboto', sans-serif");
pw.println("color: #333;");
pw.println("font-size: 1.2rem");
pw.println("margin: 0 auto");
pw.println("padding: 1.5rem 2rem");
pw.println( "border-radius: 0.2rem");
pw.println("background-color: rgb(255, 255, 255)");
pw.println("border: none");
pw.println("width: 90%");
pw.println("display: block");
pw.println("border-bottom: 0.3rem solid transparent");
pw.println("transition: all 0.3s}");

pw.println(".form__input:placeholder-shown + .form__label {");
pw.println("opacity: 0");
pw.println("visibility: hidden");
pw.println("-webkit-transform: translateY(-4rem)");
pw.println(" transform: translateY(-4rem)}");
pw.println("</style>");
pw.println("</html></body>");
}
    }
}  