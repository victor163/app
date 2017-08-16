<%--
  Created by IntelliJ IDEA.
  User: Victor
  Date: 11.08.2017
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<TITLE>Login</TITLE>
<BODY>
<FORM ACTION=LoginHandler.do METHOD=POST>
  <CENTER>
    <TABLE BORDER=0>
      <TR><TD COLSPAN=2>
        <P ALIGN=CENTER>
          Welcome!<br>
          Please enter your Name<br>
      </TD></TR>

      <TR><TD>
        <P ALIGN=RIGHT><B>Account:</B>
      </TD>
        <TD>
          <P><INPUT TYPE=TEXT NAME="account" VALUE="" SIZE=15>
        </TD></TR>
      <TR><TD COLSPAN=2>
        <CENTER>
          <INPUT TYPE=SUBMIT VALUE="  NEXT   ">
        </CENTER>

      </TD></TR>
    </TABLE>
</FORM>
</BODY>
</html>
