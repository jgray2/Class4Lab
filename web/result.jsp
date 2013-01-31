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
        <h1>Area of Rectangle</h1>
        <p>
            <% String rArea = (String)request.getAttribute("rArea");
            out.print("The area of the rectangle is: " + rArea);
            %>
        </p>
        
        <h1>Area of Circle</h1>
        <p>
           
        </p>
    </body>
</html>
