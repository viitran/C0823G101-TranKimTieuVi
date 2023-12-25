<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<br/>
<%--<a href="/product-servlet">aa</a>--%>
<c:redirect url="/product-servlet"></c:redirect>
</body>
</html>