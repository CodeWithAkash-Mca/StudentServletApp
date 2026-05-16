package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/datetime")

public class DateTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Get current date and time
        LocalDateTime now =
                LocalDateTime.now();

        // Format date and time
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm:ss"
                );

        String formattedDateTime =
                now.format(formatter);

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        // Output
        out.println("<html>");
        out.println("<body>");

        out.println("<h2>Date Time Widget</h2>");

        out.println("<p>");
        out.println("Current Date & Time: "
                + formattedDateTime);
        out.println("</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
