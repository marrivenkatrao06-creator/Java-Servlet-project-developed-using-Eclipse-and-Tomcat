<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful</title>

<style>
body{
    font-family: Arial, sans-serif;
    background:#f4f4f4;
}

.container{
    width:500px;
    margin:80px auto;
    background:#fff;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px rgba(0,0,0,0.2);
    text-align:center;
}

.sucess{
    color:green;
    font-size:28px;
    font-weight:bold;
}

.id{
    margin:20px 0;
    font-size:24px;
    color:#0d6efd;
    font-weight:bold;
    border:2px dashed #0d6efd;
    padding:15px;
    display:inline-block;
    background:#eef5ff;
}

.note{
    color:#555;
    margin-top:20px;
}

.btn{
    display:inline-block;
    margin-top:25px;
    padding:10px 20px;
    background:#198754;
    color:white;
    text-decoration:none;
    border-radius:5px;
}
</style>

</head>
<body>

<div class="container">

    <div class="sucess">
        Registration Successful!
    </div>

    <h3>Your Registration ID</h3>

    <div class="id">
        <%= request.getAttribute("id1") %>
    </div>

    <p class="note">
        Please save this Registration ID for future reference.
        It will be required for login, verification, or support.
    </p>

    <a href="Login.html" class="btn">Go to Login</a>

</div>

</body>
</html>