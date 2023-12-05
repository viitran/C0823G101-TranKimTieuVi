<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 05/12/2023
  Time: 11:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete Product</h1>
<form method="post">
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
                <td>Producer</td>
                <td>${products.getProducer()}</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete"></td>
                <td><a href="/product-servlet"> back</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
