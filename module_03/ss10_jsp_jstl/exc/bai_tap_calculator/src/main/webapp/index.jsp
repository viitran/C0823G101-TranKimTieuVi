<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator-servlet" method="post">
    Enter number 1: <input type="text" name="first-operand">
    <br/>
    Select operation:
    <select name="operation">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
    </select>
    <br/>
    Enter number 2: <input type="text" name="second-operand"><br>
    <input type="submit" value="Calculate">
</form>
<hr>
Result:
${result}
</body>
</html>