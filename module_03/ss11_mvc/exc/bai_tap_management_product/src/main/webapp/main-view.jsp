
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
<h1>Quan ly san pham</h1>
    <table border="1px">
        <tr>
            <th>STT</th>
            <th>Ten san pham</th>
            <th>Gia</th>
            <th>Mo ta</th>
            <th>Nha san xuat</th>
        </tr>
        <c:forEach items="${products}" var="p" varStatus="loop">
            <tr>
                <td><c:out value="${p.name}"/></td>
                <td><c:out value="${p.price}"/></td>
                <td><c:out value="${p.description}"/></td>
                <td><c:out value="${p.producer}"/></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
