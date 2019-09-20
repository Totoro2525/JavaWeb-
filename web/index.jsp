<%@ page import="com.totoro.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/19
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <%
      request.setCharacterEncoding("utf-8");
      Object o=session.getAttribute("User");
      if (o!=null){
          User u=(User)o;
          out.println("当前登录用户："+u.getUsername());
        }
        else{
        %>
            <a href="register.jsp">注册</a><br/>
            <a href="login.jsp">登录</a>
        <%
      }
  %>
  <br/>
    首页
  <hr/>
  各种商品的展示
  </body>
</html>
