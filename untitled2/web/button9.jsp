<%--
  Created by IntelliJ IDEA.
  User: Victor
  Date: 14.08.2017
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="info.javaway.web.servlets.ButtonClass" %>
<jsp:forward page="/LoginHandler.do"></jsp:forward>

<html>
<head>
    <title>button2</title>
</head>
<body>
<%ButtonClass b1=new ButtonClass();%>
<ol>
    <%=b1.button9()%>
</ol>

</body>
</html>
