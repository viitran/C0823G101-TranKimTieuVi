<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 19/12/2023
  Time: 3:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/check" method="post">
    email : <input type="text" name="email" placeholder="Enter email" required>
    <input type="submit" value="Validate">
</form>
<hr/>
Result: Hello ${email};
</body>
</html>
