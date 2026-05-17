package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/teacher")

public class TeacherRecordServlet extends HttpServlet {

    String url = "jdbc:mysql://localhost:3306/teacherdb";
    String username = "root";
    String password = "8400";

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String teacherName =
                request.getParameter("teacher_name");

        String subject =
                request.getParameter("subject");

        int experience =
                Integer.parseInt(
                        request.getParameter("experience")
                );

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver"
            );

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            String query =
                    "INSERT INTO teachers(teacher_name, subject, experience) VALUES(?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(query);

            pst.setString(1, teacherName);
            pst.setString(2, subject);
            pst.setInt(3, experience);

            int rows = pst.executeUpdate();

            out.println("<html>");
            out.println("<body style='font-family:Segoe UI;text-align:center;padding-top:100px;'>");

            out.println("<h2>Teacher Record Inserted Successfully</h2>");

            out.println("<h3>Rows Inserted : " + rows + "</h3>");

            out.println("<a href='forms/TeacherRecord.html'>Add Another Teacher</a>");

            out.println("</body>");
            out.println("</html>");

            con.close();

        } catch (Exception e) {

            out.println(e);

        }
    }
}