<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple login</title>
</head>
<body>
<form action="/login-servlet" method="post">
    tài khoản <input type="text" name="account">
    mật khẩu <input type="password" name="password">
    <input type="submit" value="Sign in">
</form>
</body>
</html>