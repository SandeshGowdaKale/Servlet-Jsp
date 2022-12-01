
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SecondServlet extends GenericServlet{

    //Already 4 method is Overridden
    //Only we have to Override Service Method
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is Servlet Using Generic Servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is My Second Servlet using Generic Servlet</h1>");
        
    }
    
    
    
    
}
