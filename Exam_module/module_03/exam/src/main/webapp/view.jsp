<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 15/12/2023
  Time: 12:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lịch sử chi tiêu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Lịch sử chi tiêu</h1>
<br/>
<form>
    <a href="create.jsp" class="btn btn-success">Add new Product</a>
    <table class="table">
        <thead class="table-dark">
        <th>STT</th>
        <th>Tên chi tiêu</th>
        <th>Ngày chi</th>
        <th>Số tiền chi</th>
        <th>Loại chi</th>
        <th>Mô tả</th>
        <th>Xoá</th>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}"/></td>
                <td><c:out value="${list.name}"/></td>
                <td><c:out value="${list.date}"/></td>
                <td><c:out value="${list.price}"/></td>
                <td><c:out value="${list.description}"/></td>
                <td><c:out value="${list.nameType}"/></td>
                <td>
                    <a type="button" onclick="removeHistory('${list.id}')" class="btn btn-primary"
                       data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</form>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form method="post">
                <div class="modal-body">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" id="idDelete" name="idDelete">
                    Bạn có muốn xoá lịch sử chi tiêu?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script>
    function removeHistory(id) {
        document.getElementById("idDelete").value = id;
    }
</script>
</html>
