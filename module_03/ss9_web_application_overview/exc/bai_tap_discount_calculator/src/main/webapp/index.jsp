<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="/discount-servlet" method="post">
    <label>Name product</label>
    <br>
    <input type="text" name="name" placeholder="enter name product">
    <br>
    <label>Product Description</label>
    <br>
    <textarea name="description" placeholder="enter description product"></textarea>
    <br>
    <label>List Price</label>
    <br>
    <input type="text" name="price" value="0">
    <br>
    <label>Discount Percent(%)</label>
    <br>
    <input type="text" name="percent" value="0">
    <br>
    <input type="submit" name="Calculate Discount">
    <hr>
</form>
Name product: ${name}
<br>
Description: ${description}
<br>
Discount amount: ${amount}
<br>
Discount price: ${price}
</body>
</html>