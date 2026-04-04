package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/refresh")
public class AutoRefreshServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        // refresh every 5 seconds
        response.setIntHeader("Refresh", 5);

        PrintWriter out = response.getWriter();
        out.println("<h2>Auto Refresh Page</h2>");
        out.println("Current Time: " + new Date());
    }
}
