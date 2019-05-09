<%-- 
    Document   : Makale_Ekle
    Created on : 08-Dec-2018, 17:08:41
    Author     : Vural
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>YAZAR-MAKALE-GÖNDERME</title>
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
    <body style="background-image: url('images/arkaplan.jpg')">
      <div class="header">
	     <div class="container">
	        <div class="row">
	           <div class="col-md-5">
	              <!-- Logo -->
	              <div class="logo">
                          <h1><a href="Makale_Gonder.jsp">YAZAR GİRİŞİ</a></h1>
	              </div>
	           </div>
	           <div class="col-md-5">
	              <div class="row">
	                <div class="col-lg-12">
	                  <div class="input-group form">
	                       <input type="text" class="form-control" placeholder="Search...">
	                       <span class="input-group-btn">
	                         <button class="btn btn-primary" type="button">Search</button>
	                       </span>
	                  </div>
	                </div>
	              </div>
	           </div>
	           <div class="col-md-2">
	              <div class="navbar navbar-inverse" role="banner">
	                  <nav class="collapse navbar-collapse bs-navbar-collapse navbar-right" role="navigation">
	                    <ul class="nav navbar-nav">
	                      <li class="dropdown">
	                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Hesabım <b class="caret"></b></a>
	                        <ul class="dropdown-menu animated fadeInUp">
	                          <li><a href="profile.html">Profilim</a></li>
                                  <form method="POST" action="logout">
                                      <li><a href="Login_Secim.jsp">Çıkış</a></li>
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
                            <li ><a href="Makale_Gonder.jsp"><i class="glyphicon glyphicon-home"></i>AnaSayfa</a></li>


                            <li><a href="Makale_Duzenle.jsp"><i class="glyphicon glyphicon-list"></i> Makalelerim</a></li>

                            <li><a href="Makale_Goster.jsp"><i class="glyphicon glyphicon-pencil"></i>Makale Düzenle</a></li>

                            <li class="submenu">
                                <a href="#">
                                    <i class="glyphicon glyphicon-list"></i> Sayfaya git
                                    <span class="caret pull-right"></span>
                                </a>
                                <!-- Sub menu -->
                                <ul>
                                    <li><a href="login.jsp">Giriş</a></li>
                                    <li><a href="signup.html">Üye Ol</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9" role="main">

                    <div><h3><font style="color: chartreuse">Makale Gönder</font></h3><p><a class="btn btn-success" href="Gonderme_Formu.jsp">Yeni Makale Gönder</a></p><p><a class="btn btn-primary" href="Makale_Goster.jsp">Makale Düzenle</a></p></div>
		</div>
            </div>
        </div>



       <footer style="position: relative; bottom: -215px;">
            <div class="container">

                <div class="copy text-center">
                    Copyright 2014 <a href='#'>Website</a>
                </div>

            </div>
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://code.jquery.com/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>
