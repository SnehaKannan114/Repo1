<%-- 
    Document   : Result
    Created on : 22 Feb, 2017, 7:59:19 PM
    Author     : Sneha
--%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
    </head>
    <body>
        <h1 align="center">Character Results</h1>
        <p>
            <%
                int n = 1;
                List styles = (List)(request.getAttribute("styles"));
                Iterator it = styles.iterator();
                while(it.hasNext())
                {
                    out.print("<br>" + n +" "+it.next());
                    n = n+1;
                }
            %>
    </body>
</html>
