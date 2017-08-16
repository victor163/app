package info.javaway.web.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    int x1,x2,x3,x4;
    int rnd1=0,rnd2=0,rnd3=0,rnd4=0;

    int x;

    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String account = req.getParameter("account");

        if (allowUser(account)) {

            out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
            out.println("<BODY>"+account+"<BR>");
            out.println("<form action=button1.jsp method=\"post\"><input type=\"submit\" value=\"  1   \"></form>");
            out.println("<form action=button2.jsp method=\"post\"><input type=\"submit\" value=\"  2   \"></form>");
            out.println("<form action=button3.jsp method=\"post\"><input type=\"submit\" value=\"  3   \"></form>");
            out.println("<form action=button4.jsp method=\"post\"><input type=\"submit\" value=\"  4   \"></form>");
            out.println("<form action=button5.jsp method=\"post\"><input type=\"submit\" value=\"  5   \"></form>");
            out.println("<form action=button6.jsp method=\"post\"><input type=\"submit\" value=\"  6   \"></form>");
            out.println("<form action=button7.jsp method=\"post\"><input type=\"submit\" value=\"  7   \"></form>");
            out.println("<form action=button8.jsp method=\"post\"><input type=\"submit\" value=\"  8   \"></form>");
            out.println("<form action=button9.jsp method=\"post\"><input type=\"submit\" value=\"  9   \"></form>");
            out.println("<form action=button0.jsp method=\"post\"><input type=\"submit\" value=\"  0   \"></form>");
            out.println("<form action=buttonRasch.jsp method=\"post\"><input type=\"submit\" value=\"  rasch   \"></form>");
            out.println("</BODY></HTML>");
            HttpSession session = req.getSession();
            session.setAttribute("logon.isDone", account);

            try {
                String target = (String) session.getAttribute("login.target");
                if (target != null) {
                    res.sendRedirect(target);
                    return;
                }
            }
            catch (Exception ignored) { }

        }
    }

        protected boolean allowUser(String account) {
        return true;
    }


}