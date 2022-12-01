package com.servlet;
import java.io.IOException;
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
