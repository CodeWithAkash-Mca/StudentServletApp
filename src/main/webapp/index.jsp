<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Web App</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        h1 {
            font-size: 3.5em;
            margin-bottom: 50px;
            text-shadow: 2px 2px 4px rgba(0,0,0,0.3);
            animation: fadeIn 1s ease-in;
        }

        .container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 30px;
            max-width: 800px;
            width: 100%;
            padding: 20px;
        }

        a {
            text-decoration: none;
            background: rgba(255, 255, 255, 0.9);
            color: #333;
            padding: 25px 20px;
            border-radius: 15px;
            font-weight: bold;
            font-size: 1.2em;
            transition: all 0.3s ease;
            box-shadow: 0 8px 15px rgba(0,0,0,0.1);
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 80px;
        }

        a:hover {
            background: #ffcc00;
            transform: translateY(-5px);
            box-shadow: 0 12px 20px rgba(0,0,0,0.2);
            color: #000;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .subtitle {
            font-size: 1.5em;
            margin-bottom: 20px;
            opacity: 0.9;
        }
    </style>
</head>
<body>

<h1>🚀 Student Web Application</h1>
<p class="subtitle">Explore various servlet functionalities and forms</p>

<div class="container">
    <a href="forms/index.html" title="Access a basic form demonstrating GET and POST methods">📝 GET/POST Form</a>
    <a href="forms/StudentDetails.html" title="Fill out an advanced form for student information">📋 Advanced Form</a>
    <a href="forms/Login.html" title="Login using session management">🔐 Session Login</a>
    <a href="forms/LoginDb.html" title="Authenticate user against database">🗄️ DB Login</a>
    <a href="forms/Cookie.html" title="Demonstrate cookie creation and retrieval">🍪 Cookies</a>
    <a href="forms/Db.html" title="Insert and view student records in database">💾 Database Insert/View</a>
    <a href="refresh" title="Automatically refresh the page every few seconds">🔄 Auto Refresh</a>
</div>

</body>
</html>