<%--
  Created by IntelliJ IDEA.
  User: Victor
  Date: 14.08.2017
  Time: 17:02
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
    <%=b1.bikKorov()%>
</ol>
<tr><form action=nazad.jsp method="post"><input type="submit" value="  nazad   "></form></tr>

</body>
</html>
