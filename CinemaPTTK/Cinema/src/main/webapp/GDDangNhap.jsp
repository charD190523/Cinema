<%-- 
    Document   : GDDangNhap.jsp
    Created on : Nov 5, 2024, 10:06:24 PM
    Author     : Admin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
    <style>
        /* Reset CSS */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        /* Body styling */
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f5f5f5;
        }

        /* Container styling */
        .container {
            text-align: center;
            background-color: #ffffff;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        /* Title styling */
        h2 {
            margin-bottom: 1rem;
            font-size: 1.5rem;
            color: #333;
        }

        /* Button styling */
        form {
            display: inline-block;
            margin: 0.5rem;
        }

        input[type="submit"] {
            padding: 0.5rem 1.5rem;
            border: none;
            border-radius: 4px;
            font-size: 1rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
            color: #fff;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        /* Specific button colors */
        input[value="Đăng nhập"] {
            background-color: #007bff;
        }

        input[value="Đăng ký"] {
            background-color: #28a745;
        }

        input[value="Đăng nhập"]:hover {
            background-color: #0069d9;
        }

        input[value="Đăng ký"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chào mừng bạn đến với hệ thống</h2>
        
        <!-- Nút Đăng nhập -->
        <form action="DangNhapServlet" method="post">
            <input type="submit" value="Đăng nhập" />
        </form>

        <!-- Nút Đăng ký -->
        <form action="GDNhapTT.jsp" method="get">
            <input type="submit" value="Đăng ký" />
        </form>
    </div>
</body>
</html>
