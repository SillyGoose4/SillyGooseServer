<%--
  Created by IntelliJ IDEA.
  User: wjr
  Date: 2018/4/30
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    System.out.println(basepath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basepath%>" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>
<body>
<h2>login.jsp登录界面</h2>

<form action="user/login" method="post">
    用户名：<input type="number" name="userId"><br />
    密码：<input type="text" name="userPasswd"><br />
    <input type="submit" value="登录" />
</form>
</body>
</html>
