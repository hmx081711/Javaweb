<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/12
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>destroy</title>
</head>
<body>
    <%
        request.removeAttribute("name");
        pageContext.getServletContext().removeAttribute("context");
        session.removeAttribute("age");
    %>
</body>
</html>
