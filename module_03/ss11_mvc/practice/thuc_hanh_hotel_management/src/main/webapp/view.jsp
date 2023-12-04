<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
            text-align: center;
        }
    </style>
</head>
<body>
<h3>Danh sach khach hang</h3>
<table border="1px">
    <tr>
        <th>STT</th>
        <th>Ten</th>
        <th>Email</th>
        <th>Dia chi</th>
        <th>Chuc nang</th>
    </tr>
    <c:forEach items="${customers}" var="c" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}"/></td>
            <td><c:out value="${c.name}"/></td>
            <td><c:out value="${c.email}"/></td>
            <td><c:out value="${c.address}"/></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/customer-servlet?action=create">Click de them moi </a>
<br/>
<a href="/customer-servlet?action=delete">Click de xoa khach hang theo id</a>
<br/>
<td><a href="/customer-servlet?action=edit">Click de sua thong tin khach hang</a>
</body>
</html>
