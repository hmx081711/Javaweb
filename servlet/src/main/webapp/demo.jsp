<%@ page import="java.util.Date" %>
<%@ page import="com.dorothy.servlet.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/11
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%--jsp的三大指令 page include tablig--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>demoJsp</title>
</head>
<body>
    <h1>这是测试Jsp</h1>
    <%--here to write java code--%>

    <%
        User user = new User();
    %>
    <jsp:plugin type="applet" code="com.dorothy.servlet.domain.User.class">
        <jsp:params>
            <jsp:param name="username" value="xiaoming"/>
            <jsp:param name="password" value="12345"/>
        </jsp:params>
    </jsp:plugin>

    <%
        Date date = new Date();
        out.write(date.toString());
        //out.write(user.getPassword());
        //out.write(user.getUsername());
    %>
    <%--九大内置对象 request,response,session,application,page,pagrContext,out,config,exception--%>

    <p>${requestScope.get("name")}</p>
    <p>${requestScope.get("age")}</p>
</body>
</html>
