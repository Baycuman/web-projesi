<%-- 
    Document   : Message
    Created on : 09-Dec-2018, 17:17:47
    Author     : Vural
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message</title>
</head>
<body>
    <center>
        <h3><%=request.getAttribute("Message")%></h3>
    </center>
</body>
</html>
