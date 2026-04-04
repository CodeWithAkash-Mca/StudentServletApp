package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "8400");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            out.println("<h2>Student List</h2>");

            while (rs.next()) {
                out.println("ID: " + rs.getInt("id") +
                        " Name: " + rs.getString("name") +
                        " Age: " + rs.getInt("age") +
                        " Course: " + rs.getString("course") +
                        "<br><br>");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}