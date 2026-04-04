package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        String username = request.getParameter("username");

        // create session
        HttpSession session = request.getSession();
        session.setAttribute("user", username);

        PrintWriter out = response.getWriter();
        out.println("<h2>Login Successful</h2>");
        out.println("<a href='profile'>Go to Profile</a>");
    }
}
