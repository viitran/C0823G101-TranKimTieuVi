<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<form method="post">
<fieldset>
    <legend>Form update product information</legend>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"  value="${products.getName()}"></td>
        </tr>
        <tr>
            <td>Price($):</td>
            <td><input type="text" name="price"  value="${products.getPrice()}"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type="text" name="description"  value="${products.getDescription()}"></td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td><input type="text" name="producer"  value="${products.getProducer()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Confirm"></td>
            <a href="/product-servlet"> back</a>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
