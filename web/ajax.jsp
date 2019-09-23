<%--
  Created by IntelliJ IDEA.
  User: Totoro
  Date: 2019/9/22
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        setInterval("callAjaxByJs()",2000);
        function callAjaxByQuery() {
            $.ajax({
                url:encodeURI("${pageContext.request.contextPath}/ajaxrequest?data=我是客户端发送的数据"),
                type:"get",
                cache:false,
                success:function (msg) {
                    $("#msg").append(msg);  
                }
            });
        }
        function callAjaxByJs() {
            var xmlhttp=new XMLHttpRequest();
            xmlhttp.open("GET",encodeURI("${pageContext.request.contextPath}/ajaxrequest?data=233"),true);
            xmlhttp.send();
            xmlhttp.onreadystatechange=function (msg) {
                if(xmlhttp.readyState==4&&xmlhttp.status==200){
                    $("#msg").append(xmlhttp.responseText);
                }
            }
            
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/login_do" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
<div id="msg">
</div>
</body>
</html>
