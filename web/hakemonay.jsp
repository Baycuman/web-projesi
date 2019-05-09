<%-- 
    Document   : hakemonay
    Created on : 25.Ara.2018, 18:52:09
    Author     : yakup
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet">

        <style>

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
                            <b>Editör Tarafından Onaylanan Makaleler</b></font></p>
                    
                </div>
            </div>
            <!-- /container -->
        </div>

        <!-- /Header -->

        <!-- Main -->

        <div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">

            <ul class="nav nav-pills nav-stacked" style="border-right:1px solid black">
                <!--<li class="nav-header"></li>-->
                <li><a href="#"><i class="fa fa-dashboard"></i>ANASAYFA</a></li>
                <li><a href="#"><i class="fa fa-tags"></i>YAYINLANACAK MAKALELER</a></li>
                <li><a href="#"><i class="fa fa-history"></i>EDİTÖRDEN GELEN MAKALEYİ ONAYLA</a></li>
                <li><a href="#"><i class="fa fa-lock"></i>REDDEDİLMİŞ MAKALELER </a></li>

            </ul>
        </div><!-- /span-3 -->
        <div class="col-lg-10 col-md-10 col-sm-9 col-xs-12">
            <!-- Right -->

          
            <hr>
        </div>