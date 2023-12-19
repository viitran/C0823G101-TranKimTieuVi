<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 15/12/2023
  Time: 12:14 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product-servlet" method="post">
    <input type="hidden" name="action" value="create">
    <div>
        Code: <input type="text" name="code" placeholder="code" required>
    </div>
    <div>
        Name: <input type="text" name="name" placeholder="name" required>
    </div>
    <div>
        Unit: <input type="text" name="unit" placeholder="unit" required>
    </div>
    <div>
        Price: <input type="text" name="price" placeholder="price" required>
    </div>
    <div>
        Date: <input type="date" name="date" placeholder="date" required>
    </div>
    <div>
        <select name="productType">
            <c:forEach items="${productTypes}" var="pt">
                <option value="${pt.id}">${pt.name}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit">Submit</button>
</form>

</body>
</html>
