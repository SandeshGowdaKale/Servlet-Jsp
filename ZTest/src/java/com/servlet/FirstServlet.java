package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
    
    //Life Cycle Methods
    ServletConfig conf;
    
    public void init(ServletConfig config){
        this.conf=conf;
        System.out.println("Creating Object:......");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Serviceing.........");
        
        //Set the Content type of the Response
        res.setContentType("text/html");
        PrintWriter out =res.getWriter();
        out.println("<h1>This is My Output From Servlet Method:</h1>");
        out.println("<h1>Todays date and time is" + new Date().toString()+"</h1>");    
    }

    @Override
    public void destroy() {
        System.out.println("going to Destroy Servlet Object");
    }
    
    //Non LifeCycle Methods

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    @Override
    public String getServletInfo() {
       return "This Servlet is Created By Sandesh Gowda";
    }
}
