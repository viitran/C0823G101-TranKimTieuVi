<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 19/12/2023
  Time: 7:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/save">
    <table>
        <tr><td><input type="checkbox" name="condiments" value="Lettuce">Lettuce</td>
            <td><input type="checkbox" name="condiments" value="Tomato">Tomato</td>
            <td><input type="checkbox" name="condiments" value="Mustard">Mustard</td>
            <td><input type="checkbox" name="condiments" value="Sprouts">Sprouts</td>
    </table>
    <hr>
    <input type="submit" value="save">
</form>
</body>
</html>
