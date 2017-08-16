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
    <%=b1.button1()%>

</ol>

</body>
</html>
