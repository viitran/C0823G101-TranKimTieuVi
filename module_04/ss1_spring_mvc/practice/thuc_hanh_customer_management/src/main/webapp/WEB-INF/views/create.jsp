<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 18/12/2023
  Time: 7:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer</title>
</head>
<body>
<form>
  <fieldset>
    <legend>Create Customer</legend>
    Name : <input type="text" name="name" placeholder="Enter name Customer" required>
    <br/>
    Email : <input type="text" name="email" placeholder="Enter email Customer" required>
    <br/>
    Address : <input type="text" name="address" placeholder="Enter address Customer" required>
    <br/>
    <a type="submit"> Create </a>
  </fieldset>
  <a href="list.jsp">Back to list</a>
</form>
</body>
</html>
