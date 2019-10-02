<%--
  Created by IntelliJ IDEA.
  User: thuan
  Date: 10/1/19
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="get" action="/calculate">
    <h3>Calculator</h3>
    <input type="text" name="firstOperand" placeholder="0">
    <input type="text" name="secondOperand" placeholder="0"><br/>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="*">
    <input type="submit" name="operator" value="/">
</form>
</body>
</html>
