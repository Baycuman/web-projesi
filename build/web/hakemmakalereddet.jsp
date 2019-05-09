<%-- 
    Document   : hakemmakalereddet
    Created on : 25.Ara.2018, 22:58:08
    Author     : yakup
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="hakemred.DB4"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet">

        <style>

            tr,td,th{
                background:#00FFFF;
                padding: 20px;
                text-align: center;
            }

            .navbar-inverse
            {
                background:#00796B;
                border-bottom-color: #004D40;
            }
            .navbar-inverse .navbar-nav>li>a,.navbar-inverse .navbar-brand,.navbar-inverse .navbar-nav>.dropdown>a .caret
            {
                color: #fff;
            }
            .navbar-inverse .navbar-nav>.open>a, .navbar-inverse .navbar-nav>.open>a:hover, .navbar-inverse .navbar-nav>.open>a:focus,
            .navbar-nav>li>.dropdown-menu
            {
                background:#4DB6AC;
            }
            .nav-pills>li>a,
            {
                color: #303F9F;
            }

            .nav>li>a:hover, .nav>li>a:focus
            {
                background-color: #EEEEEE;
            }
        </style>    

        <title>HAKEM GİRİŞ SAYFASI</title>   
        <div id="top-nav" class="navbar navbar-inverse navbar-static-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand"  href="#">HAKEM</a>
                </div>



                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                        </li>
                        <li><a href="hakemlogin.jsp"><i class="fa fa-sign-out"></i> ÇIKIŞ </a></li>
                    </ul>

                    <p><font face="tahoma" size="6" color="white">
                        <b>MAKALE REDDET</b></font></p>

                </div>
            </div>
            <!-- /container -->
        </div>

        <!-- /Header -->

        <!-- Main -->

        <div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">

            <ul class="nav nav-pills nav-stacked" style="border-right:1px solid black">
                <!--<li class="nav-header"></li>-->
                <li><a href="hakemgiris.jsp"><i class="glyphicon glyphicon-home"></i><strong>ANASAYFA</strong></a></li>
                <li><a href="hakemmakaleonayla.jsp"><i class="glyphicon glyphicon-ok"></i><strong>EDİTÖRDEN GELEN MAKALEYİ ONAYLA</strong></a></li>
                <li><a href="hakemmakalereddet.jsp"><i class="glyphicon glyphicon-remove"></i><strong>EDİTÖRDEN GELEN MAKALEYİ REDDET</strong></a></li>
                <li><a href="yayınlanacakmakale.jsp"><i class="glyphicon glyphicon-ok-sign"></i><strong>YAYINLANACAK MAKALELER</strong></a></li>
                <li><a href="hakemredmakale.jsp"><i class="glyphicon glyphicon-remove-sign"></i><strong>REDDEDİLMİŞ MAKALELER </strong></a></li>

            </ul>
        </div><!-- /span-3 -->
        <div class="col-lg-10 col-md-10 col-sm-9 col-xs-12">
            <!-- Right -->


            <center>

                <form action="UploadServlet4" method="post" enctype="multipart/form-data">
                    <table width="500px" height="350px" align="center" border=2>
                        <tr>
                            <td align="center"  colspan="2"><strong>FORM BİLGİLERİ</strong></td>
                        </tr>
                        <tr>
                            <td><strong>YAZAR AD</strong> </td>
                            <td>
                        <input type="text" size="30" required="" name="firstname">
                            </td>
                            </tr>
                            <tr>
                                <td><strong>YAZAR SOYAD</strong> </td>
                                <td>
                            <input type="text" size="30" required="" name="lastname">
                                </td>
                                </tr>
                                <tr>
                                    <td><strong>DOSYA SEÇ</strong> </td>
                                    <td>
                                <input type="file" required="" name="file">
                                    </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td><input type="submit" value="MAKALEYİ REDDET"></td>
                                        </tr>
                                        </table>

                                        </form>
                                        <br><a href = "editorredmakale.jsp"><font color="GREEN"><strong>REDDEDİLENLERİ GÖRÜNTÜLE</strong></a>
                                        </center>












                                        <hr>




                                        </div>