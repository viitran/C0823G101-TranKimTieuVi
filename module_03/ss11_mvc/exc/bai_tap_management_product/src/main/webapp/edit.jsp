<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<fieldset>
    <legend>Old product information</legend>
    <table>
        <tr>
            <td>Name</td>
            <td>${products.getName()}</td>
        </tr>
        <tr>
            <td>Price($)</td>
            <td>${products.getPrice()}</td>
        </tr>
        <tr>
            <td>Description</td>
            <td>${products.getDescription()}</td>
        </tr>
        <tr>
            <td>producer</td>
            <td>${products.getProducer()}</td>
        </tr>
    </table>
</fieldset>
<hr>
<fieldset>
    <legend>Form update product information</legend>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="${product.getName()}"></td>
        </tr>
        <tr>
            <td>Price($):</td>
            <td><input type="text" name="price" value="${product.getPrice()}"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type="text" name="description" value="${product.getDescription()}"></td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td><input type="text" name="producer" value="${product.getProducer()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Confirm"></td>
        </tr>
    </table>
</fieldset>
<a href="/product-servlet"> back</a>
</body>
</html>
