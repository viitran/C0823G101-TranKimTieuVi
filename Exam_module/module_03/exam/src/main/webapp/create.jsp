<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 14/12/2023
  Time: 10:22 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thêm lịch sử chi tiêu</title>
</head>
<body>
<h1>Form mới lịch sử chi tiêu</h1>
<form action="/spending-servlet" method="post">
    <input type="hidden" name="action" value="create">
    <fieldset>
        <legend>Form điền thông tin lịch sử chi tiêu</legend>
        <div>
            Tên Chi tiêu: <input type="text" name="name" placeholder="tên chi tiêu" required>
        </div>
        <div>
            Ngày chi: <input type="date" name="date" placeholder="ngày chi" required>
        </div>
        <div>
            Số tiền chi: <input type="text" name="price" placeholder="số tiền chi" required>
        </div>
        <div>
            Mô tả thêm : <input type="text" name="description" placeholder="mô tả thêm" required>
        </div>
        <div>
            Loại chi tiêu:
        </div>
        <div>
            Loại chi tiêu:
            <select name="spendingType">
            <c:forEach items="${spendingType}" var="type">
                <option value="${type.typeId}">
                        ${type.name}
                </option>
                </c:forEach>
            </select>
        </div>
        <button type="submit">Thêm mới</button>
    </fieldset>

</form>
</body>
</html>
