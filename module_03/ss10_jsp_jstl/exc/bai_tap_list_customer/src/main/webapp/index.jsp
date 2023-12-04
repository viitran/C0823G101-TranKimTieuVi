<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
    <style>
        table {
            border-collapse: collapse;
            text-align: center;
        }
    </style>
</head>
<body>
<table border="1px">
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Nơi ở</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.location}</td>
            <td><img src="${customer.picture}" style=" width:100px;height:100px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>