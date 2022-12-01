package com.sandesh.servletlifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle extends GenericServlet {

    public ServletLifeCycle() {
        System.out.println("Servlet Objected Only Onces");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet Object is Initialized");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("nm");
        String place = req.getParameter("pl");
        PrintWriter out = res.getWriter();
        out.print("<html><body bgcolor='yellow'><h1> Welcome " + name + " From " + place + "</h1></body></html>");
        out.close();
        System.out.println("Service method is Excuted");//how many time request is sent that many times service method will excute
    }

    @Override
    public void destroy() {
        System.out.println("Closed Costly Resources");
    }

}
