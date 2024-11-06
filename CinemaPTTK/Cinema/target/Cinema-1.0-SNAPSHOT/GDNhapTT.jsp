<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng ký thành viên</title>
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
            background-color: #f7f7f7;
            overflow-y: hidden; /* Prevent body scroll */
        }

        /* Container styling */
        .container {
            width: 700px;
            max-height: 90vh; /* Set max-height and enable scroll */
            padding: 2rem;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            overflow-y: auto; /* Enable scrolling within the container */
        }

        /* Title styling */
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 1rem;
        }

        h3 {
            color: #555;
            margin-top: 1.5rem;
            margin-bottom: 0.5rem;
            width: 100%;
        }

        /* Form layout */
        form {
            display: flex;
            flex-wrap: wrap;
            gap: 1rem;
        }

        .form-group {
            flex: 1 1 48%; /* Set width for two columns layout */
            display: flex;
            flex-direction: column;
        }

        .small-width {
            flex: 1 1 23%; /* Smaller fields for compact display */
        }

        .full-width {
            flex: 1 1 100%; /* Full width for single row elements */
        }

        label {
            margin-bottom: 0.3rem;
            color: #333;
        }

        input[type="text"], input[type="password"], input[type="email"], input[type="number"], input[type="date"] {
            width: 100%;
            padding: 0.5rem;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 1rem;
        }

        /* Submit button styling */
        .submit-container {
            width: 100%;
            text-align: center;
            margin-top: 1.5rem;
        }

        input[type="submit"] {
            width: 100%;
            max-width: 200px;
            padding: 0.7rem;
            font-size: 1rem;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Đăng ký thành viên mới</h2>
        <form action="DangKyThanhVienServlet" method="post">
            <!-- Thông tin tài khoản -->
            <div class="form-group">
                <label>Username:</label>
                <input type="text" name="username" required />
            </div>
            <div class="form-group">
                <label>Password:</label>
                <input type="password" name="password" required />
            </div>
            
            <!-- Thông tin cá nhân -->
            <div class="form-group">
                <label>Họ:</label>
                <input type="text" name="ho" required />
            </div>
            <div class="form-group">
                <label>Tên đệm:</label>
                <input type="text" name="tendem" />
            </div>
            <div class="form-group">
                <label>Tên:</label>
                <input type="text" name="ten" required />
            </div>
            <div class="form-group">
                <label>Ngày sinh:</label>
                <input type="date" name="ngaysinh" />
            </div>

            <!-- Thông tin địa chỉ -->
            <h3>Địa chỉ</h3>
            <div class="form-group small-width">
                <label>Số nhà:</label>
                <input type="number" name="sonha" required />
            </div>
            <div class="form-group">
                <label>Ngõ:</label>
                <input type="text" name="ngo" />
            </div>
            <div class="form-group">
                <label>Đường:</label>
                <input type="text" name="duong" />
            </div>
            <div class="form-group">
                <label>Xã:</label>
                <input type="text" name="xa" />
            </div>
            <div class="form-group">
                <label>Quận:</label>
                <input type="text" name="quan" />
            </div>

            <!-- Thông tin liên hệ -->
            <h3>Thông tin liên hệ</h3>
            <div class="form-group full-width">
                <label>Email:</label>
                <input type="email" name="email" />
            </div>
            <div class="form-group full-width">
                <label>Số điện thoại:</label>
                <input type="text" name="sdt" />
            </div>

            <!-- Nút Đăng ký -->
            <div class="submit-container">
                <input type="submit" value="Đăng ký" />
            </div>
        </form>
    </div>
</body>
</html>
