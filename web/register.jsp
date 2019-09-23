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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("input[name=username]").blur(verifyUsername);
        });
        function verifyUsername() {
            $.ajax({
                url:encodeURI("${pageContext.request.contextPath}/verifyusername"),
                type:"post",
                data:{
                    username:$("input[name='username']").val()
                },
                dataType:"json",
                success:function (msg) {
                    if(msg.isSuccess){
                        $("#msg").html("<font color='blue'>用户名可用！</font>")
                    }else{
                        $("#msg").html("<font color='red'>用户名重复!</font>")
                    }
                }
            });
        }
    </script>
</head>
<body>
${message}
注册
<hr/>
<form action="<%=request.getContextPath()%>/register_do" method="post">
    用户名：<input type="text" name="username"/><div id="msg"></div><br/>
    密码：<input type="password" name="password"/><br/>
    年龄：<input type="text" name="age"/><br/>
    性别：男<input type="radio" name="sex" value="男" checked="checked"/>女<input type="radio" name="sex" value="女"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
