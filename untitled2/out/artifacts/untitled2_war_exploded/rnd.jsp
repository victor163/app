<%--
  Created by IntelliJ IDEA.
  User: Victor
  Date: 16.08.2017
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="info.javaway.web.servlets.ButtonClass" %>
<jsp:forward page="/LoginHandler.do"></jsp:forward>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%ButtonClass b1=new ButtonClass();%>
<ol>
    <%=b1.getRnd1()%>
    <%=b1.getRnd2()%>
    <%=b1.getRnd3()%>
    <%=b1.getRnd4()%>
</ol>
</body>
</html>
