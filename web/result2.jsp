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
               
        <h1>Area of Circle</h1>
        <p>
            <% String cArea = (String)request.getAttribute("cArea");
            out.print("The area of the circle is: " + cArea);
            %>
        </p>
        
    </body>
</html>
