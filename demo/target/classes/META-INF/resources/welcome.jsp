<%--
  Created by IntelliJ IDEA.
  User: aa
  Date: 2019/12/1
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商城首页</title>
    <script src="/static/js/jquery-1.6.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                url: '/brandindex',
                type: 'post',
                async: true,
                data: {},
                success: function (data) {
                    $("#showdiv").html(data);
                }
            });
        });
    </script>
</head>
<body>
<div id="showdiv">
</div>
</body>
</html>
