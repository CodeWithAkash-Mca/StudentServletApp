package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String course = request.getParameter("course");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "8400");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student(name, age, course) VALUES (?, ?, ?)");

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);

            ps.executeUpdate();

            PrintWriter out = response.getWriter();
            out.println("<h2>Data Inserted Successfully</h2>");
            out.println("<a href='Db.html'>Back</a>");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}