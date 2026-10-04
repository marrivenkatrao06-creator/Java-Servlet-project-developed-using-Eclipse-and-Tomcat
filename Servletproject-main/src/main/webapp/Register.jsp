<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Register</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#4facfe,#00f2fe);
}

.login-container{
    background:white;
    padding:30px;
    border-radius:10px;
    width:350px;
    box-shadow:0 4px 10px rgba(0,0,0,0.2);
}

.login-container h2{
    text-align:center;
    margin-bottom:20px;
    color:#333;
}

.input-group{
    margin-bottom:15px;
}

.input-group input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:5px;
    font-size:16px;
}

button{
    width:100%;
    padding:12px;
    border:none;
    background:#4facfe;
    color:white;
    font-size:16px;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#2196f3;
}

.register-link{
    text-align:center;
    margin-top:15px;
}

.register-link a{
    color:#4facfe;
    text-decoration:none;
}

</style>

</head>

<body>

<div class="login-container">

    <h2>Register</h2>

    <form action="Register" method="post">

        <div class="input-group">
            <input type="text"
                   name="Fullname"
                   placeholder="Full Name"
                   required>
        </div>

        <div class="input-group">
            <input type="text"
                   name="ReferCode"
                   placeholder="Referral Code"
                   required>
        </div>

        <div class="input-group">
            <input type="email" 
                   name="mail"
                   placeholder="Email"
                   required>
        </div>

        <div class="input-group">
            <input type="text"
                   name="phone"
                   placeholder="Phone Number"
                   required>
        </div>

        <div class="input-group">
            <input type="password"
                   name="pass"
                   placeholder="Password"
                   required>
        </div>

   
       <button type="submit">Register</button>
         
    </form>

    <p class="register-link">
        Already have an account?
        <a href="Login.html">Login</a>
    </p>

</div>

</body>
</html>