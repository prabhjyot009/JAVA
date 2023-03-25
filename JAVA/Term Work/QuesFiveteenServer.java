//15.	WAP to communicate between two machine using Servlet to receive factorial from server*/

import java.io.IOException;
import java.io.PrintWriter;

public class QuesFiveteenServer extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        int n=Integer.parseInt(req.getParameter("num"));
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        out.println("Factorial of "+n+" is "+fact);
    }
}
package singh;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        int n=Integer.parseInt(req.getParameter("num"));
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        out.println("Factorial of "+n+" is "+fact);
    }
}
