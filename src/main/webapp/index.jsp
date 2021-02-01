<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01-Feb-21
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product</h2>
  <form method="post" action="/display-discount">
    <label>Product Description</label><br/>
    <input type="text" placeholder="description"/><br/>
    <label>List Price</label><br/>
    <input type="text" name="price" placeholder="price"/><br/>
    <label>Discount Percent</label><br/>
    <input type="text" name="percent" placeholder="%"/><br/>
    <input type="submit" id="submit" value="Count price"/>
  </form>
  </body>
</html>
