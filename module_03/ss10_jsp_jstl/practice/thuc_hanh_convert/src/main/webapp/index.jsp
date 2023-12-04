<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>currency convert</title>
</head>
<body>
<form action="/convert-servlet" method="post">
    <label>Rate:</label>
    <input type="text" name="rate" value="22000">
    <br>
    <label>USD($)</label>
    <input type="text" name="usd" value="0">
    <br>
    <input type="submit" name="convert">
    <hr>
</form>
Result: ${result} VND
</body>
</html>