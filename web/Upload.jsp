
<%@page import="com.servlet.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MAKALE YÜKLE</title>
        <style>

              tr,td,th{
                background:#00CC33;
                padding: 20px;
                text-align: center;
            }

        </style>

    <title>MAKALE YÜKLE</title>
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
                                <li><a href="Upload.jsp"><i class="glyphicon glyphicon-upload"></i>MAKALE YÜKLE</a></li>
                             

                            </ul>
                        </div>
                    </div>

                    <div class="col-md-10">

                    </div>
                    <br><br><br><br>
                    <center>

                        <form action="UploadServlet" method="post" enctype="multipart/form-data">
                            <table width="530px" height="380px" align="center" border=2>
                                <tr>
                                    <td align="center"  colspan="2"><strong>FORM BİLGİLERİ</strong></td>
                                </tr>
                                <tr>
                                    <td><strong>AD</strong> </td>
                                    <td>
                                <input type="text" size="40" required="" name="firstname">
                                    </td>
                                    </tr>
                                    <tr>
                                        <td><strong>SOYAD</strong> </td>
                                        <td>
                                    <input type="text" size="40" required="" name="lastname">
                                        </td>
                                        </tr>
                                        <tr>
                                            <td><strong>MAKALE SEÇ</strong> </td>
                                            <td>
                                        <input type="file" required="" name="file">
                                            </td>
                                            </tr>
                                            <tr>
                                                <td></td>
                                                <td><input type="submit" value="YÜKLE"></td>
                                                </tr>
                                                </table>

                                                </form>
                                        
                                                </center>


                                                </div>

                                                <footer style="position: relative; bottom: -195px;">
                                                    <div class="container">

                                                        <div class="copy text-center">
                                                            Akademik Dergi Yönetim Sistemi <a href='#'>Website</a>
                                                        </div>

                                                    </div>
                                                </footer>
                                                </div>
                                                <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
                                                <script src="https://code.jquery.com/jquery.js"></script>
                                                <!-- Include all compiled plugins (below), or include individual files as needed -->
                                                <script src="bootstrap/js/bootstrap.min.js"></script>
                                                <script src="js/custom.js"></script>
                                                </body>
                                                </html>