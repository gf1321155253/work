<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    a {
        text-decoration: none;
    }

    .tab {
        width: 1000px;
        text-align: center;

    }
</style>
<script src="/static/js/jquery-1.6.2.js"></script>
<script type="text/javascript">
    function del(id) {
        $.ajax({
            type: 'post',
            url: "/goodsdel",
            data: {
                "id": id
            },
            success: function () {
                alert("删除成功！")
            }
        })
    }


</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="bdiv">
    <form action="/mhselect" method="post">
        <input type="text" placeholder="请输入商品名称" name="goodsname">
        <input type="submit" value="查询">
        <table class="tab" border="1px" cellspacing="0px" cellpadding="0px">
            <tr>
                <th>商品种类</th>
                <th>商品价格</th>
                <th>商品品牌</th>
                <th>商品名称</th>
                <th>操作</th>
            </tr>
            <%--                       <c:forEach items="${mhlist}" var="tmp">--%>
            <%--                       </c:forEach>--%>
            <tr>
                <td>查询</td>
                <td>查询</td>
                <td>查询</td>
                <td>查询</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>
            <tr>
                <td>查询</td>
                <td>查询</td>
                <td>查询</td>
                <td>查询</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>

        </table>
    </form>
</div>
<div>
    <a href="getUserList?pageNum=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getUserList?pageNum=1">1</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getUserList?pageNum=2">2</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getUserList?pageNum=3">3</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="#">尾页</a>
</div>
</body>
</html>
