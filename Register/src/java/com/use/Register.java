package com.use;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");

            //getting all the incoming details from the request..\
            String name = request.getParameter("user_name");
            String email = request.getParameter("user_email");
            String password = request.getParameter("user_password");

            out.println(name);
            out.println(password);
            out.println(email);

            //connections....................
           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "root");

                //query...................
                String query = "insert into user(name,password,email) values(?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, name);
                pstmt.setString(2, password);
                pstmt.setString(3, email);

                pstmt.executeUpdate();

                out.println("<h1>done....</h1>");

            } catch (ClassNotFoundException e){
                e.printStackTrace();
                out.println("<h1>error.....</h1>");
            } 
             catch (SQLException e){
              e.printStackTrace();
                out.println("<h1>error.....</h1>");
            } 
            //........................
            out.println("</body>");
            out.println("</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
