<%@ page import="com.totoro.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/19
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    Object o=session.getAttribute("User");
    if (o!=null){
        User u=(User)o;
        out.println(u.getUsername());
    }
%>
welcome
<hr/>
</body>
</html>
