<%-- 
    Document   : hakemredsucces
    Created on : 25.Ara.2018, 23:05:07
    Author     : yakup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>
    <center>
        <c:if test="${requestScope.msg!=null}">
        <h3><c:out value="${requestScope.msg}"></c:out></h3>
        </c:if><br><br>
        <c:if test="${sessionScope.fileName!=null}">
            <c:set var = "file" scope = "session" value = "${sessionScope.fileName}"/>  
        </c:if>
         <a href = "<c:url value = "DownloadServlet4?fileName=${file}"/>">İNDİR</a>&nbsp;&nbsp;&nbsp;
         <a href = "<c:url value = "hakemredfile-list.jsp"/>">LİSTEYİ GÖRÜNTÜLE</a>
    </center>
    </body>
</html>