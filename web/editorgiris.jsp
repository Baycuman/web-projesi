<%-- 
    Document   : editorgiris
    Created on : 22.Ara.2018, 02:17:30
    Author     : yakup
--%>

<%@page import="com.servlet.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <html>
        <head>
        <title>EDİTÖR SAYFASI</title>
        </head>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
            <style>
                tr,td,th{
                    background:green;
                    padding: 10px;
                    text-align: center;
                }
                *
                {
                    margin:0px;
                    padding:0px;
                }
                ul.navbar 
                {
                    background:#4a7746;
                    list-style-type: none;
                    margin: 0px;
                    padding: 0px;

                }
                .navbar > li > a i
                {
                    margin-right: 10px;
                    width: 40px;
                    padding: 10px;
                    box-sizing: border-box;
                }
                .navbar > li > a:hover,.navbar > li.active > a
                {
                    background: #335230;
                }
                .navbar > li > a
                {
                    display: block;
                    color: #fff;
                    text-decoration: none;
                    font-size: 18px;
                    padding: 10px;
                }
                .brand
                {
                    background: #3e523d;
                    color:#fff;
                    float: left;
                    width: 100%;
                    box-sizing: border-box;
                    padding:18px 10px; 
                    font-size: 25px;
                }

                .brand a:hover
                {
                    background: #444;
                }
                .brand a i
                {

                }
                .brand a
                {
                    padding: 5px 10px;
                    float: right;
                    box-sizing: border-box;
                    color: #fff;
                    background: #4a7746;
                }
                .hideNav
                {

                    visibility: hidden;
                }

                @media screen and (min-width: 768px) {

                    ul.navbar {
                        height: 100vh;
                        width: 80px;
                    }
                    ul.navbar li span
                    {
                        visibility: hidden;
                    }
                    ul.navbar li a i
                    {
                        font-size: 30px;
                        padding-top: 22px;

                        vertical-align: middle;
                    }
                    ul.navbar li
                    {
                        text-align: center;
                    }
                    .btn-bars
                    {
                        visibility: visible;
                    }
                }
                @media screen and (min-width: 768px) {
                    .brand
                    {
                        padding-right: 10px;
                        background: #3e523d;
                        color:#fff;
                        width: 16.666%;
                    }

                    ul.navbar {
                        width: 16.666%;
                    }
                    ul.navbar.hideNav
                    {
                        width: 100px;
                        visibility: visible;
                    }
                    ul.navbar.hideNav {
                        height: 100vh;
                        width: 80px;
                    }
                    ul.navbar.hideNav li span
                    {
                        visibility: hidden;
                    }
                    ul.navbar.hideNav li a i
                    {
                        font-size: 30px;
                        padding-top: 22px;

                        vertical-align: middle;
                    }
                    ul.navbar.hideNav li
                    {
                        text-align: center;
                    }

                    ul.navbar.hideNav li span
                    {
                        text-align: left;
                        visibility: visible;
                    }
                    ul.navbar li span
                    {
                        text-align: left;
                        visibility: visible;
                    }
                    ul.navbar li a i
                    {
                        font-size: 18px;
                        padding-top: 0px;
                        vertical-align: baseline;
                    }
                    ul.navbar li a 
                    {
                        padding-top: 22px;
                        font-size: 18px;

                    }
                    ul.navbar li
                    {
                        text-align: left;
                    }
                }
                .header
                {
                    height: 70.48px;
                    width: 100%;
                    background: #163c12;
                }
                .header-right ul
                {
                    list-style-type: none;
                    margin: 0px;padding:0px;
                }
                .header-right
                {
                    width: 83.3333%;
                    float: left;
                }
                .header-right input
                {
                    margin: 15px;
                    padding: 10px;
                    width: 400px;
                    border-radius:5px;
                    border:0px;
                    outline: none;
                }

                .header-right ul.navbar-right
                {
                    position: absolute;
                    right: 10px;
                    top: 60px;
                    margin-top: 20px;
                    box-shadow: 0px 0px 3px 1px #ddd;
                    width:200px;
                }
                .header-right ul.navbar-right li.active,
                .header-right ul.navbar-right li:hover
                {

                    background: #f4f4f4;
                }
                .header-right ul.navbar-right li a i
                {
                    box-sizing: border-box;
                    padding: 10px;
                }
                .header-right ul.navbar-right li a
                {
                    text-decoration: none;
                    padding: 10px 10px;
                    display: block;
                    color: #333;
                }
                .blog-user
                {
                    float: right;
                }
                .blog-user a.avator img 
                {
                    float: right;
                }
                .avator 
                {   
                    height: 55px;
                    width: 55px;
                    margin-top: 5px;
                    margin-right: 15px;
                    float: right;

                }
                .avator img
                {
                    border-radius: 100px;
                    height: 90%;
                    border:4px solid #fff; 
                }

                .header-right ul.navbar-right li
                {
                    z-index: 9999;            
                    border-bottom: 1px solid #e1e1e1;
                    background: #fff;

                }
                .hidden
                {
                    visibility: hidden;
                }
            </style>
            <body>
            <script>
                $(function () {
                    $(".btn-bars").click(function () {
                        $(".navbar").toggleClass("hideNav", "slow");
                    });
                    $(".avator").click(function () {
                        $(".navbar-right").toggleClass("hidden", "slow");
                    });
                });



            </script> 

            <nav class="nav-bar">
                <div class="header">
                    <div class="brand"> EDİTÖR <a href="javascript:void(0)" class="btn-bars"> <i class="fa fa-bars"></i></a></div>

                    <div class="header-right"> 

                        <p><font face="tahoma" size="7" color="white">
                            <b>Yazar Tarafından Yüklenen Makaleler</b></font></p>
                        <div class="blog-user">
                            <a href="#" class="avator"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgV1cokAhUc_f0ljJt88_Jf4K9RaRgZSvGuUCBV6Up4SS9wo--"></a>

                            <ul class="navbar-right hidden">
                                <li class="active"><a href="editorlogin.jsp"><i class="fa fa-user"></i><span>ÇIKIŞ</span></a></li>

                            </ul>
                        </div>

                    </div>


                    <center>
                        <%!
                            Connection con = null;
                            PreparedStatement ps = null;
                            ResultSet rs = null;
                        %>
                        <table border="2">
                            <tr>
                                <th>ID</th><th>AD</th><th>SOYAD</th><th>DOSYA ADI</th><th>DOSYA YOLU</th><th>EKLENME TARİHİ</th><th>İNDİR/İNCELE</th>
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

                                    
                                    </center>



                                    </div>


                                    <ul class="navbar">
                                        <li><a href="editorgiris.jsp"><i class="glyphicon glyphicon-home"></i><span>ANASAYFA </span></a></li>
                                        <li><a href="onaylananmakale.jsp"><i class="glyphicon glyphicon-pencil"></i><span>MAKALE ONAYLA </span></a></li>
                                         <li><a href="editorreddet.jsp"><i class="glyphicon glyphicon-pencil"></i><span>MAKALE REDDET </span></a></li>
                                        <li><a href="editoronaymakale.jsp"><i class="glyphicon glyphicon-ok"></i><span>ONAYLANAN MAKALELER</span> </a></li>
                                        <li><a href="editorredmakale.jsp"><i class="glyphicon glyphicon-remove"></i><span>REDDEDİLEN MAKALELER </span></a></li>
                                         
                                    </ul>
                                    </nav>


                                    </body>
                                    </html>