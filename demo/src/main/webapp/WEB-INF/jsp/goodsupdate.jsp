<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa
  Date: 2019/12/1
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.6.2.js"></script>
    <script type="text/javascript">
    </script>
</head>

<body>
<form action="/goodsupdatebut" method="post">
    <input type="hidden" value="${param.id}" name="id">
    <input type="text" value="${param.goodstype}" name="goodstype">
    <input type="text" value="${param.goodssprice}" name="goodssprice">
    <input type="text" value="${param.goodsbrand}" name="goodsbrand">
    <input type="text" value="${param.goodsname}" name="goodsname">
    <input type="submit" id="but" value="确认修改">
</form>
</body>
</html>
