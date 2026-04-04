package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);


        if (session != null) {
            session.invalidate(); // destroy session
        }

        PrintWriter out = response.getWriter();
        out.println("<h2>Logged out successfully</h2>");
        String path = request.getContextPath();

        out.println("<a href='" + path + "/forms/Login.html'>Login again</a>");
        //out.println("<a href='Login.html'>Login again</a>");
        //out.println("<a href='/StudentServletApp_war_exploded/Login.html'>Login again</a>");
        //out.println("<a href='../Login.html'>Login again</a>");
    }
}
