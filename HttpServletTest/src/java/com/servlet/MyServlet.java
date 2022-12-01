
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
       
        System.out.println("This is get method......");
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.print("<h1> This is get method of my Servlet </h1>");
        out.print("<h1>"+ new Date().toString()+"</h1>");
    }
}
