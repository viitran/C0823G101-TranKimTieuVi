<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 04/12/2023
  Time: 2:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create customer</title>
</head>
<body>
<p>
  <a href="/customers">Back to customer list</a>
</p>
<form method="post">
  <fieldset>
    <legend>Customer information</legend>
    <table>
      <tr>
        <td>Name: </td>
        <td><input type="text" name="name" id="name"></td>
      </tr>
      <tr>
        <td>Email: </td>
        <td><input type="text" name="email" id="email"></td>
      </tr>
      <tr>
        <td>Address: </td>
        <td><input type="text" name="address" id="address"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Create customer"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
