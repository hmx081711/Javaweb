<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/11
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>错误处理Jsp</title>
</head>
<body>
    <%
        out.write(exception.getMessage());
    %>
</body>
</html>
