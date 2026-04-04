<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Web App</title>
    <style>
        body {
            font-family: Arial;
            background: linear-gradient(to right, #667eea, #764ba2);
            color: white;
            text-align: center;
        }

        h1 {
            margin-top: 30px;
        }

        .container {
            display: grid;
            grid-template-columns: repeat(2, 200px);
            gap: 20px;
            justify-content: center;
            margin-top: 40px;
        }

        a {
            text-decoration: none;
            background: white;
            color: black;
            padding: 15px;
            border-radius: 10px;
            font-weight: bold;
            transition: 0.3s;
        }

        a:hover {
            background: #ffcc00;
        }
    </style>
</head>
<body>

<h1>🚀 Student Web Application</h1>

<div class="container">
    <a href="forms/index.html">GET/POST Form</a>
    <a href="forms/StudentDetails.html">Advanced Form</a>
    <a href="forms/Login.html">Session Login</a>
    <a href="forms/LoginDb.html">DB Login</a>
    <a href="forms/Cookie.html">Cookies</a>
    <a href="forms/Db.html">Database Insert/View</a>
    <a href="refresh">Auto Refresh</a>
</div>

</body>
</html>