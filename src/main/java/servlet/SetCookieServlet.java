package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/setCookie")
public class SetCookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        String name = request.getParameter("username");

        // create cookie
        Cookie cookie = new Cookie("user", name);
        cookie.setMaxAge(60 * 60); // 1 hour

        response.addCookie(cookie);

        PrintWriter out = response.getWriter();
        out.println("<h2>Cookie Saved</h2>");
        out.println("<a href='getCookie'>Go to Next Page</a>");

    }
}
