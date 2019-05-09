<%-- 
    Document   : makale_ekle_form_kodu
    Created on : 08-Dec-2018, 17:10:29
    Author     : Vural
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Admin Theme v3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- jQuery UI -->
        <link href="https://code.jquery.com/ui/1.10.3/themes/redmond/jquery-ui.css" rel="stylesheet" media="screen">

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
    <script>
        function formuKontrolEdenFonksiyon(form) {
            //--------------------------------
            if (form.Makale_Adi.value == '') {

                alert("anakategoriadi alanını boş geçemezsiniz.");
                return false;
            }
            //--------------------------------
            if (form.Makale_Konusu.value == '') {

                alert("anakategorisirasi alanını boş geçemezsiniz.");
                return false;
            }
            //--------------------------------
        }
    </script>
    <body style="background-image: url('images/arkaplan.jpg')">


        <h1 style="text-align: center ;text-decoration: #003399">MAKALE GÖNDERME FORMU</h1>


        <form class="form-group "method="POST" action="Veritabani_Ekleme.jsp"  name="makale_ekle_form" id="makale_ekle_form" onsubmit="return formuKontrolEdenFonksiyon(document.makale_ekle_form);">
            <div class="col-md-pull-10" >  <select class="form-control" id="Dergiler" name="Dergiler" ><option value='International Journal of Clinical and Experimental Pathology' >International Journal of Clinical and Experimental Pathology</option><option value='International Journal of Clinical and Experimental Medicine' >International Journal of Clinical and Experimental Medicine</option><option value='American Journal of Digestive Disease' >American Journal of Digestive Disease</option><option value='American Journal of Translational Research' >American Journal of Translational Research</option><option value='American Journal of Cancer Research' >American Journal of Cancer Research</option><option value='International Journal of Physiology, Pathophysiology and Pharmacology' >International Journal of Physiology, Pathophysiology and Pharmacology</option><option value='International Journal of Molecular Epidemiology and Genetics' >International Journal of Molecular Epidemiology and Genetics</option><option value='International Journal of Biochemistry and Molecular Biology' >International Journal of Biochemistry and Molecular Biology</option><option value='American Journal of Blood Research' >American Journal of Blood Research</option><option value='American Journal of Cardiovascular Disease' >American Journal of Cardiovascular Disease</option><option value='International Journal of Burns and Trauma' >International Journal of Burns and Trauma</option><option value='American Journal of Nuclear Medicine and Molecular Imaging' >American Journal of Nuclear Medicine and Molecular Imaging</option><option value='American Journal of Stem Cells' >American Journal of Stem Cells</option><option value='American Journal of Clinical and Experimental Immunology' >American Journal of Clinical and Experimental Immunology</option><option value='American Journal of Neurodegenerative Disease' >American Journal of Neurodegenerative Disease</option><option value='American Journal of Clinical and Experimental Obstetrics and Gynecology' >American Journal of Clinical and Experimental Obstetrics and Gynecology</option><option value='American Journal of Clinical and Experimental Urology' >American Journal of Clinical and Experimental Urology</option> </select>          </div>         
            <input class="form-control" type="text" placeholder="Makale Adi" name="Makale_Adi" id="Makale_Adi" >
            <input class="form-control" type="text" placeholder="Makale Konusu" name="Makale_Konusu"id="Makale_Konusu">

            <input class="form-control" type="text" placeholder="Makale Gönderilme Tarih" name="Makale_Tarih"id="Makale_Tarih">

            <input class="form-control" type="text" placeholder="Yazar Adı" name="Yazar_Adi" id="Yazar_Adi">
            <input class="form-control" type="text" placeholder="Yazar Email" name="Yazar_Email" id="Yazar_Email">
            <input class="form-control" type="text" placeholder="Yazar Telefon" name="Yazar_Telefon" id="Yazar_Telefon">
            <input class="form-control" type="file" placeholder="Dosya" name="Dosya" id="Dosya"> 

            <div class="action" >

                <input class="btn btn-success" type="submit" name="onayla" id="onayla" value="Onayla" style="width: 521px" />
            </div>   
        </form>







        <link href="vendors/datatables/dataTables.bootstrap.css" rel="stylesheet" media="screen">

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://code.jquery.com/jquery.js"></script>
        <!-- jQuery UI -->
        <script src="https://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <script src="vendors/datatables/js/jquery.dataTables.min.js"></script>

        <script src="vendors/datatables/dataTables.bootstrap.js"></script>

        <script src="js/custom.js"></script>
        <script src="js/tables.js"></script>
    </body>
</html>

