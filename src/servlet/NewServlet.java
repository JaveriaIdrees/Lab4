package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewServlet")
public class NewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        out.println("Data Inserted Successfully");
        String username = request.getParameter("username");
        /*DbConnection dbConnection;
        dbConnection = new DbConnection();
        dbConnection.insertRecord(username);*/
        // This is use to redirect to other page
        response.sendRedirect("servletdisplay");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
