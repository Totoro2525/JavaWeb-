<%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/19
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
${message}
注册
<hr/>
<form action="<%=request.getContextPath()%>/register_do" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    年龄：<input type="text" name="age"/><br/>
    性别：男<input type="radio" name="sex" value="男" checked="checked"/>女<input type="radio" name="sex" value="女"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
