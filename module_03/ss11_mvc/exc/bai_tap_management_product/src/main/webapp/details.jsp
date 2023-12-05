<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 05/12/2023
  Time: 3:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details Product</title>
</head>
<body>
<h1>Details Product</h1>
<fieldset>
    <legend>Product information</legend>
    <table>
        <tr>
            <td>Name</td>
            <td>${products.getName()}</td>
        </tr>
        <tr>
            <td>Price($)</td>
            <td>${products.getPrice()}</td>
        </tr>
        <tr>
            <td>Description</td>
            <td>${products.getDescription()}</td>
        </tr>
        <tr>
            <td>producer</td>
            <td>${products.getProducer()}</td>
        </tr>
        <tr>
            <td></td>
            <td><a href="/product-servlet"> back</a></td>
        </tr>
    </table>
</fieldset>
</body>
</html>
