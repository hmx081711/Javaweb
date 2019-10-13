<%@ page import="com.dorothy.listener.listenerDemo.UserInfo" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/12
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>init</title>
</head>
<body>
当前用户在线人数:<%= request.getServletContext().getAttribute("onlineNumber")%>
<%
    List<UserInfo> list = (List<UserInfo>) pageContext.getServletContext().getAttribute("userList");
    for (UserInfo user:list) {
        out.write("sessionId:"+user.getSessionid()+"\n");
        out.write("firstLoginTime:"+user.getFirstLoginTime()+"\n");
        out.write("AddrIp:"+user.getIpAddr()+"\n");
        out.write("---------------------\n");
    }
%>

<button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">init</button>
<button onclick="location.href='<%=request.getContextPath()%>/destroy.jsp';">destroy</button>
<%=session.getAttribute("currentUser")%>
<%=session.getAttribute("age")%>
</body>
</html>
