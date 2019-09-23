<%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/23
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
dispatcher2.jsp
<%
    request.getRequestDispatcher("dispatcherfilter1.jsp").forward(request,response);
%>
</body>
</html>
