<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.totoro.model.Goods" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/20
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <style type="text/css">
        *{
            font-size: 14px;
        }
    </style>
</head>

<body>
<h1>商品管理</h1>
<a>添加</a>
<table border="1">
    <tr>
        <th>名称</th><th>描述</th><th>价格</th><th>库存</th><th>操作</th>
    </tr>
    <c:forEach items="${goods}" var="g">
        <tr>
            <th>${g.name}</th><th>${g.des}</th><th>g.price</th><th>g.inventory</th>
        </tr>
    </c:forEach>
    <%--<%--%>
        <%--List<Goods> goods= (ArrayList)request.getAttribute("goods");--%>
        <%--for (Goods g:goods--%>
             <%--) {--%>
            <%--%>--%>
            <%--<tr>--%>
                <%--<th><%=g.getName()%></th><th><%=g.getDes()%></th><th><%=g.getPrice()%></th><th><%=g.getInventory()%></th><th>修改，删除</th>--%>
            <%--</tr>--%>
            <%--<%--%>
        <%--}--%>
    <%--%>--%>
</table>

</body>
</html>
