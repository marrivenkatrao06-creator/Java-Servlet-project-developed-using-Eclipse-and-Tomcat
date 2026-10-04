<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


 <style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    background: #f4f7fb;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background: #fff;
    padding: 40px;
    border-radius: 15px;
    box-shadow: 0 8px 20px rgba(0,0,0,0.1);
    text-align: center;
    max-width: 400px;
    width: 90%;
}

.checkmark {
    width: 80px;
    height: 80px;
    background: #28a745;
    color: white;
    font-size: 45px;
    border-radius: 50%;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0 auto 20px;
}

h1 {
    color: #28a745;
    margin-bottom: 15px;
}

p {
    color: #555;
    margin: 8px 0;
}

.order-details {
    background: #f8f9fa;
    padding: 15px;
    border-radius: 10px;
    margin: 20px 0;
}

.btn {
    display: inline-block;
    text-decoration: none;
    background: #007bff;
    color: white;
    padding: 12px 25px;
    border-radius: 8px;
    transition: 0.3s;
    font-weight: bold;
}

.btn:hover {
    background: #0056b3;
}



        </style>



</head>
<body>

<div class="container">
    <div class="checkmark">✓</div>
    <h1>Order Placed Successfully!</h1>
    <p>Thank you for your purchase.</p>
    <p>Your order has been confirmed and will be delivered soon.</p>

    

    <a href="final.html" class="btn">Continue Shopping</a>
</div>

</body>
</html>

