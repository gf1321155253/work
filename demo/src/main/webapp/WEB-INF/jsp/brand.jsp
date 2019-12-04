<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>--%>
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
                       <c:forEach items="${list}" var="tmp">
                       <tr>
                           <td>${tmp.goodsname}</td>
                           <td>2</td>
                           <td>3</td>
                           <td>4</td>
                           <td><a href="brandindex?id=1">删除</a> | <a href="goodsupdate">修改</a> | <a href="goodsadd">新增</a></td>
                       </tr>
                       </c:forEach>
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

<%--        <c:set var="age" value="13"></c:set>--%>
<%--        <c:if test="${age<12}">你是小学生</c:if>--%>
<%--        <c:if test="${18>age&&age>12}">你是中学生 </c:if>--%>
<%--        <c:if test="${age>18}">你高于中学生 </c:if>--%>

    </form>
</div>

<%--<div class="pgidxclass">--%>
<%--    &lt;%&ndash; 定义分页风格：普通风格 &ndash;%&gt;--%>
<%--    <pg:index>--%>
<%--        <pg:first>--%>
<%--            <a href="${pageUrl}">首页</a>--%>
<%--        </pg:first>--%>
<%--        <pg:prev>--%>
<%--            <a href="${pageUrl }">上一页</a>--%>
<%--        </pg:prev>--%>
<%--        <pg:pages>--%>
<%--            <c:choose>--%>
<%--                &lt;%&ndash;当循环页码是当前页码，则该页码不可以导航，并显示为红色&ndash;%&gt;--%>
<%--                <c:when test="${currentPageNumber eq pageNumber}">--%>
<%--                    <font color="red">[${pageNumber }]</font>--%>
<%--                </c:when>--%>

<%--                &lt;%&ndash; 当循环页码不是当前页码，则该页码可以导航 &ndash;%&gt;--%>
<%--                <c:otherwise>--%>
<%--                    <a href="${pageUrl }">[${pageNumber }]</a>--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>
<%--        </pg:pages>--%>
<%--        <pg:next>--%>
<%--            <a href="${pageUrl }">下一页</a>--%>
<%--        </pg:next>--%>
<%--        <pg:last>--%>
<%--            <a href="${pageUrl }">尾页</a>--%>
<%--        </pg:last>--%>
<%--    </pg:index>--%>
<%--</div>--%>
<%--</pg:pager>--%>
</body>
</html>
