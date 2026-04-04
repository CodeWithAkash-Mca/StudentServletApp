This project is a comprehensive Java Web Application developed using Servlets, JSP, and JDBC. It demonstrates core web development concepts such as request handling, session management, cookies, and database connectivity. The application is designed as a single integrated system with a centralized dashboard for easy navigation between different modules.

The project begins with basic form handling using GET and POST methods, allowing users to submit student information. It then progresses to advanced topics such as session tracking, where user data is maintained across multiple requests using HttpSession. Cookie management is also implemented to store and retrieve user-specific data on the client side.

A key feature of this application is its integration with a MySQL database using JDBC. Users can insert student records into the database and view stored data dynamically. The project also includes a login system that validates user credentials from the database and manages authentication using sessions.

To improve usability, a colorful and responsive dashboard (index.jsp) is created as the main entry point. From this dashboard, users can access all functionalities including forms, login systems, cookie handling, database operations, and auto-refresh features.

The project follows a modular structure where each functionality is handled by a separate servlet, ensuring clean and maintainable code. HTML pages are organized into a dedicated folder, and proper URL mapping is used to connect front-end forms with backend servlets.

🚀 Technologies Used
Java Servlets
JSP (Java Server Pages)
JDBC (Java Database Connectivity)
MySQL Database
Apache Tomcat Server
HTML & CSS

This project serves as a strong foundation for understanding Java web development and prepares the transition toward modern frameworks like Spring Boot.
