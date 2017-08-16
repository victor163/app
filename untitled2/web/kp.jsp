<%--
  Created by IntelliJ IDEA.
  User: Victor
  Date: 16.08.2017
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="info.javaway.web.servlets.ButtonClass" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%ButtonClass b1=new ButtonClass();%>
<ol>
    <%=b1.getKollvoPopitok()%>
</ol>

</body>
</html>
