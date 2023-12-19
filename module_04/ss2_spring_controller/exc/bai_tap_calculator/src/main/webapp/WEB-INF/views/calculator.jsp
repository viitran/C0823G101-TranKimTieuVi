<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 19/12/2023
  Time: 11:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calculator">
    <table>
        <tr>
            <td><input type="text" name="firstNumb" required placeholder="enter first number"></td>
            <td><input type="text" name="secondNumb" required placeholder="enter second number"></td>
        </tr>
        <tr>
            <td><input type="submit" name="calculation" value="Addition"></td>
            <td><input type="submit" name="calculation" value="Subtraction"></td>
        </tr>
        <tr>
            <td><input type="submit" name="calculation" value="Multiplication"></td>
            <td><input type="submit" name="calculation" value="Division"></td>
        </tr>
    </table>
    <hr/>
</form>
Result ${calculation} : ${result}
</body>
</html>
