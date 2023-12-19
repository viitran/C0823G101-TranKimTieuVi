<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 19/12/2023
  Time: 12:18 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ điển tiếng anh - việt</h1>
<form action="/translate">
<input type="text" name="search" placeholder="enter word">
<input type="submit" value="translate">
<hr/>
</form>
result: ${result}
</body>
</html>
