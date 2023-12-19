<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 18/12/2023
  Time: 4:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<form>
    <table class="table table-striped">
        <tr>
            <th>STT</th>
            <th>Ho va ten</th>
            <th>Email</th>
            <th>dia chi</th>
        </tr>
        <c:forEach var="list" items="${list}" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}"/></td>
                <td><c:out value="${list.name}"/></td>
                <td><c:out value="${list.email}"/></td>
                <td><c:out value="${list.address}"/></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
