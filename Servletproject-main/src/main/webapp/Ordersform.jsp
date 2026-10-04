<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Form</title>

<style>

body{
    font-family: Arial, sans-serif;
    background:#f4f7f4;
}

.form-container{
    width:400px;
    margin:50px auto;
    padding:25px;
    background:white;
    border-radius:15px;
    box-shadow:0 5px 15px rgba(0,0,0,.15);
}

h2{
    text-align:center;
    color:green;
}

input,textarea{
    width:100%;
    padding:12px;
    margin:10px 0;
    border:1px solid #ccc;
    border-radius:5px;
    font-size:16px;
}

button{
    width:100%;
    padding:12px;
    background:green;
    color:white;
    border:none;
    border-radius:5px;
    font-size:18px;
    cursor:pointer;
}

button:hover{
    background:#006400;
}

</style>

</head>

<body>

<%
String id = (String) session.getAttribute("id");

String plant = request.getParameter("plant");
String price = request.getParameter("price");

if(plant==null)
    plant="";

if(price==null)
    price="";
%>

<div class="form-container">

<h2>🌿 Order Form</h2>

<form action="Order" method="post">

<input type="text"
       name="id"
       value="<%= id %>"
       readonly>

<input type="text"
       name="Plantname"
       value="<%= plant %>"
       readonly>

<input type="text"
       name="Price"
       value="<%= price %>"
       readonly>

<textarea
          name="Address"
          placeholder="Enter Delivery Address"
          required></textarea>

<button type="submit">
Submit Order
</button>

</form>
</div>

</body>
</html>