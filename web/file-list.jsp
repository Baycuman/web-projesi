

<%@page import="com.servlet.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            tr,td,th{
                background:green;
                padding: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body bgcolor="gray">
        <br><br><br>
    <center>
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
        <table border="2">
            <tr>
                <th>ID</th><th>AD</th><th>SOYAD</th><th>DOSYA ADI</th><th>DOSYA YOLU</th><th>EKLENME TARİHİ</th><th>İNDİR</th>
            </tr>
            <%
                con = DB.getConnection();
            String sql = "select * from employee";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getTimestamp(6)%></td>
                <td><a href="DownloadServlet?fileName=<%=rs.getString(4)%>">Download</a></td>
            </tr>
            <%
                }
            %>
            
        </table><br>
        <a href="Gonderme_Formu.jsp">ANASAYFA</a>
    </center>
    </body>
</html>
