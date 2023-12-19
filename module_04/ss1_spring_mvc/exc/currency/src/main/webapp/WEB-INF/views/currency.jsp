<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 18/12/2023
  Time: 11:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator" method="get">
  <fieldset>
    <legend>Convert currency</legend>
     USD <input type="text" name="usd" required> $
    <br/>
    <input type="submit" value="convert">
  </fieldset>
</form>
<hr/>
Result: ${result} VND
</body>
</html>
