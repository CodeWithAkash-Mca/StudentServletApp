package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        PrintWriter out = response.getWriter();
        out.println("<h2>GET Method Data</h2>");
        out.println("Name: " + name);
        out.println("Age: " + age);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        PrintWriter out = response.getWriter();
        out.println("<h2>POST Method Data</h2>");
        out.println("Name: " + name);
        out.println("Age: " + age);
    }
}
