<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Product</title>
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
            rel="stylesheet">
</head>
<body>
<fieldset>
  <legend>Search Product</legend>
  <input type="text" name="search" placeholder="enter name product">
  <input type="submit" value="search">
</fieldset>
  <hr>
<c:if test="${products != null}">
<h3>Found this product </h3>
<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Ten San Pham</th>
        <th>Gia</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="products" varStatus="loop">
      <tr>
        <td>${loop.count}</td>
        <td><a href="/product-servlet?action=details&id=${products.getId()}">${products.name}</a></td>
        <td>${products.price}</td>
        <td><a href="/product-servlet?action=delete&id=${products.getId()}">xoa</a>
          <a href="/product-servlet?action=edit&id=${products.getId()}">sua</a></td>
      </tr>
    </c:forEach>
    </tbody>
</table>
</c:if>
<c:if test="${products == null}">
  <h3>Can't Found this product</h3>
</c:if>
</body>
<script
        type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.umd.min.js"
></script>
</html>
