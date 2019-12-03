<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa
  Date: 2019/11/30
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
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
    <form action="bra" method="post">
        <input type="text" placeholder="请输入商品名称" name="欧文">
        <input type="submit" value="查询">
        <table class="tab" border="1px" cellspacing="0px" cellpadding="0px">
            <tr>
                <th>商品种类</th>
                <th>商品价格</th>
                <th>商品品牌</th>
                <th>商品名称</th>
                <th>操作</th>
            </tr>
            <%--           <c:forEach items="${list}" var="tmp">--%>
            <%--           <tr>--%>
            <%--               <td>${tmp.id}</td>--%>
            <%--               <td>2</td>--%>
            <%--               <td>3</td>--%>
            <%--               <td>4</td>--%>
            <%--               <td><a href="brandindex?id=1">删除</a> | <a href="goodsupdate">修改</a> | <a href="goodsadd">新增</a></td>--%>
            <%--           </tr>--%>
            <%--           </c:forEach>--%>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td><a href="javascript:void(0);" onclick="del(19)">删除</a> | <a
                        href="goodsupdate?id=2&goodstype=1&goodsbrand=1&goodsname=1&goodssprice=1">修改</a> | <a
                        href="goodsadd">新增</a></td>
            </tr>
        </table>

        <ul class="pagination">
            <a href="#">上一页</a>
            <a href="#">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">下一页</a>
        </ul>
    </form>
</div>
</body>
</html>
