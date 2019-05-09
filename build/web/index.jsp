
<%@page import="com.servlet.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

        <style>

            tr,td,th{
                background:green;
                padding: 20px;
                text-align: center;
            }

        </style>

    <title>YAZAR SAYFASI</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- styles -->
        <link href="css/styles.css" rel="stylesheet">

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
              <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
              <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
            <![endif]-->

            </head>

            <body background="https://i.pinimg.com/originals/03/a7/d0/03a7d08d24c8bc925c70604c6310cd3c.jpg">
            <div class="header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-5">
                            <!-- Logo -->
                            <div class="logo">
                                <h1><a href="index.jsp">YAZAR GİRİŞ SAYFASI</a></h1>
                            </div>
                        </div>
                        <div class="col-md-5">

                        </div>
                        <div class="col-md-2">
                            <div class="navbar navbar-inverse" role="banner">
                                <nav class="collapse navbar-collapse bs-navbar-collapse navbar-right" role="navigation">
                                    <ul class="nav navbar-nav">
                                        <li class="dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Hesabım <b class="caret"></b></a>
                                            <ul class="dropdown-menu animated fadeInUp">

                                                <form method="POST" action="logout">
                                                    <li><a href="login.jsp">Çıkış</a></li>
                                                </form>
                                            </ul>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="page-content">
                <div class="row">
                    <div class="col-md-2">
                        <div class="sidebar content-box" style="display: block;">
                            <ul class="nav">
                                <!-- Main menu -->

                                <li class="current"><a href="index.jsp"><i class="glyphicon glyphicon-home"></i> ANASAYFA</a></li>
                                <li><a href="yazaronaymakale.jsp"><i class="glyphicon glyphicon-ok"></i>ONAYLANAN MAKALELERİM</a></li>
                                <li><a href="yazarredmakale.jsp"><i class="glyphicon glyphicon-remove"></i>EDİTÖR TARAFINDAN REDDEDİLEN MAKALELERİM</a></li>
                                <li><a href="yazarredmakale1.jsp"><i class="glyphicon glyphicon-remove"></i>HAKEM TARAFINDAN REDDEDİLEN MAKALELERİM</a></li>
                                <li><a href="Upload.jsp"><i class=" glyphicon glyphicon-upload"></i>MAKALE YÜKLE</a></li>                  


                            </ul>
                        </div>
                    </div>

                    <div class="col-md-10">

                    </div>
                    <center>
                        <%!
                            Connection con = null;
                            PreparedStatement ps = null;
                            ResultSet rs = null;
                        %>

                        <h1 style="color:white"><strong>YÜKLEDİĞİM MAKALELER<strong></h1>

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
                                            <td ><a href="DownloadServlet?fileName=<%=rs.getString(4)%>">Download</a></td>

                                        </tr>
                                        <%
                                            }
                                        %>

                                    </table><br><br>


                                    </center>

                                    </div>


                                    </div>
                                    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
                                    <script src="https://code.jquery.com/jquery.js"></script>
                                    <!-- Include all compiled plugins (below), or include individual files as needed -->
                                    <script src="bootstrap/js/bootstrap.min.js"></script>
                                    <script src="js/custom.js"></script>
                                    </body>
                                    </html>