<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Convert money</title>
</head>
<body>
<h1>Convert</h1>
<form action="/convert-servlet" method="post">
    <label>Rate: </label>
    <br>
    <input type="text" name="rate" value="22000"> VND
    <br>
    <label>To: </label>
    <br>
    <input type="text" name="usd" value="0"> $
    <br>
    <input type="submit" value="convert">
    <hr>
</form>
Result: ${result}
</body>
</html>