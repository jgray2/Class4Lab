<%-- 
    Document   : result
    Created on : Jan 30, 2013, 6:06:48 PM
    Author     : jgray2
--%>
<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation</title>
    </head>
    <body>        
          <h1>Length of Triangle Leg</h1>
        <p>
            <% String tLegC = (String)request.getAttribute("tLegC");
            out.print("The length of leg C is: " + tLegC);
            %>
        </p>
    </body>
</html>
