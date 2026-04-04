package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/studentDetails")
public class StudentDetailsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");

        String[] skills = request.getParameterValues("skills");

        PrintWriter out = response.getWriter();

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age + "<br>");
        out.println("Course: " + course + "<br>");
        out.println("Gender: " + gender + "<br>");

        out.println("Skills: ");
        if (skills != null) {
            for (String s : skills) {
                out.println(s + " ");
            }
        }
    }
}
