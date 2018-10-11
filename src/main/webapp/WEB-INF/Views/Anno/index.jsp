<%--
  Created by IntelliJ IDEA.
  User: ouryoushi
  Date: 2018/10/11
  Time: 下午10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/anno/showresult" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName" value="三" type="text"/>
    <input type="submit"/>
</form>
<form action="/anno/showparamresult" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName" value="三" type="text"/>
    <input type="submit"/>
</form>
</body>
</html>
