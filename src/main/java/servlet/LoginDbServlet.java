package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/loginDb")
public class LoginDbServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "8400");

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            PrintWriter out = response.getWriter();

            if (rs.next()) {

                HttpSession session = request.getSession();
                session.setAttribute("user", username);

                out.println("<h2>Login Successful</h2>");
                out.println("<a href='dashboard'>Go to Dashboard</a>");

            } else {
                out.println("<h2>Invalid Credentials</h2>");
                out.println("<a href='LoginDb.html'>Try Again</a>");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
