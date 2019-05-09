<%-- 
    Document   : loginanasayfa
    Created on : 09.Ara.2018, 15:31:37
    Author     : yakup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>ANASAYFA</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Akademik Dergi Yönetim Sistemi</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
            </div>
            <form class="form-inline my-2 my-lg-0">
                <a href="register_page.jsp"  <button class="btn btn-outline-success my-2 my-sm-0" type="button">KAYIT OL</button></a>
            </form>
            </div>
        </nav>

    <div class="card-group">
        <div class="card">
            <img class="card-img-top" src="http://kmit.in/emagazine/wp-content/uploads/2015/04/editor.gif" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title"><strong>YAZAR</strong></h5>
                    <p class="card-text"><font color="blue" size="4">Yazar olarak makalenizi sisteme yükleyebilir , yayınlanıp yayınlanmayacağını görebilirsiniz.</font></p>
                </div>
                <div class="card-footer">
                    <a href="login.jsp"   <button type="button" class="btn btn-primary">Yazar Girişi</button> </a>
                </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://4.bp.blogspot.com/-WlM6OFnEqqw/VwEKo411ImI/AAAAAAAABNo/axPaC1xSBZMWJkku9kuTiz_DbCCPawFeA/s1600/ED%25C4%25B0T%25C3%2596R.tif" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title"><strong>EDİTÖR</strong></h5>
                    <p class="card-text"><font color="black" size="4">Editör yazarların sisteme yüklediği makaleleri uygun görürse hakeme yönlendirmek ile sorumludur.Aynı zamanda hakemden gelecek sonucu da yazara bildirir.</font>  </p>
                </div>
                <div class="card-footer">
                    <a href="editorlogin.jsp"   <button type="button" class="btn btn-dark">Editör Girişi</button> </a>
                </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://emlakkulisi.com/resim/orjinal/MjEyNDc1Mj-tuketici-hakem-heyeti-gorev-alani.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title"><strong>HAKEM HEYETİ</strong></h5>
                    <p class="card-text"><font color="green" size="4">Hakemler editör tarafından uygun görülen makaleler üzerinde incelemeler yapar ve uygun gördükleri takdirde makale yayınlanır.Karar editöre bildirilir ve ardından yazara ulaşır.</font> </p>
                </div>
                <div class="card-footer">
                    <a href="hakemlogin.jsp" <button type="button" class="btn btn-success">Hakem Girişi</button></a>
                </div>
        </div>
    </div>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>