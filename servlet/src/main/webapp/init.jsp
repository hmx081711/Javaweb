<%@ page import="com.dorothy.listener.bindingListener.User" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/12
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>init</title>
</head>
<body>
    <h1>属性监听器测试</h1>
    <%
        request.setAttribute("name","小明");
        request.getServletContext().setAttribute("context","context");
        session.setAttribute("age",18);
        User user = new User("dorothy","123456");
        session.setAttribute("currentUser",user);
    %>
</body>
</html>
