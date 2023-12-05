<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 05/12/2023
  Time: 9:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Create Product</h1>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" ></td>
            </tr>
            <tr>
                <td>Price($): </td>
                <td><input type="text" name="price" ></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><input type="text" name="description" ></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create customer"></td>
                <td><a href="/product-servlet">Back</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
