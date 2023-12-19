<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 14/12/2023
  Time: 3:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- Font Awesome -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
    />
    <!-- Font Awesome -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
    />
    <!-- MDB -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
            rel="stylesheet"
    />
</head>
<body>
<h1>Quản lý sản phẩm rau củ quả</h1>
<form>
    <a href="/product-servlet?action=create" class="btn btn-success">Add new Product</a>
    <table class="table">
        <thead class="table-dark">
        <th>#</th>
        <th>Mã hàng hoá</th>
        <th>Tên hàng hoá</th>
        <th>Đơn vị tính</th>
        <th>Giá</th>
        <th>Loại hàng hóa</th>
        <th>Ngày thu hoạch</th>
        <th>Chỉnh sửa</th>
        <th>Xóa</th>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}"/></td>
                <td><c:out value="${list.code}"/></td>
                <td><c:out value="${list.name}"/></td>
                <td><c:out value="${list.unit}"/></td>
                <td><c:out value="${list.price}"/></td>
                <td><c:out value="${list.typeName}"/></td>
                <td><c:out value="${list.date}"/></td>
                <td>
                    <a type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                        Update
                    </a>
                </td>
                <td>
                    <a type="button" onclick="onDeleteHandler(${list.id}, '${list.name}')" class="btn btn-danger"
                       data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</form>
<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/product-servlet" method="post">
                <div class="modal-body">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" name="idDelete" id="idDelete">
                    Do you want to delete product with name <span id="nameDelete"></span>?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    function onDeleteHandler(id, name) {
        document.getElementById("idDelete").value = id;
        document.getElementById("nameDelete").innerHTML = name;
    }
</script>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<!-- MDB -->
<script
        type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.umd.min.js"
></script>
</html>
