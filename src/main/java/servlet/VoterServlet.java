package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/voter")

public class VoterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        int age = Integer.parseInt(
                request.getParameter("age")
        );

        String mobile = request.getParameter("mobile");

        String status;

        if(age >= 18){
            status = "Eligible for Voting";
        }
        else{
            status = "Not Eligible for Voting";
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println(

                "<html>" +

                        "<body style='background:#f1f5f9;" +
                        "font-family:Segoe UI;" +
                        "display:flex;" +
                        "justify-content:center;" +
                        "align-items:center;" +
                        "height:100vh;'>"

                        +

                        "<div style='width:450px;" +
                        "background:white;" +
                        "padding:35px;" +
                        "border-radius:20px;" +
                        "box-shadow:0 10px 25px rgba(0,0,0,0.08);'>"



                        +

                        "<p><b>Name:</b> " + name + "</p>"

                        +

                        "<p><b>Age:</b> " + age + "</p>"

                        +

                        "<p><b>Mobile:</b> " + mobile + "</p>"

                        +

                        "<p style='margin-top:20px;" +
                        "font-size:18px;" +
                        "font-weight:bold;" +
                        "color:#2563eb;'>"

                        +

                        status

                        +

                        "</p>"

                        +

                        "</div>" +

                        "</body>" +

                        "</html>"
        );
    }
}
