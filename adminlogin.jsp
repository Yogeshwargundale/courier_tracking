<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Home</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="css/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="css/style.min.css" rel="stylesheet">
 
<title>Home</title>
</head>

<body class="grey lighten-3">

    <!--Main Navigation-->
    <header>

        <!-- Navbar -->
        <nav class="navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar">
            <div class="container-fluid">

                <!-- Brand -->
                <a class="navbar-brand waves-effect" href="" target="_blank">
                    <strong class="blue-text">A1_Couriers</strong>
                </a>

                <!-- Collapse -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <!-- Links -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">

                    <!-- Left -->
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link waves-effect" href="home.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link waves-effect" href="" target="_blank">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link waves-effect" href="tracking.jsp" target="_blank">Track Courier</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link waves-effect" href="" target="_blank">Contact_Us</a>
                        </li>
                    </ul>

                    <!-- Right -->
                    

                </div>

            </div>
        </nav>
        <!-- Navbar -->

        <!-- Sidebar -->
        <div class="sidebar-fixed position-fixed">

            <a class="logo-wrapper waves-effect">
                <img src="logo.png" class="img-fluid" alt="tracking logo" width="70px" height="100px">
            </a>

            <div class="list-group list-group-flush">
                <a href="#" class="list-group-item active waves-effect" >
                    <i class="fa fa-pie-chart mr-3"></i>Dashboard
                </a>
                <a href="admin.jsp" class="list-group-item list-group-item-action waves-effect">
                    <i class="fa fa-user mr-3"></i>Admin</a>
                <a href="branch.jsp" class="list-group-item list-group-item-action waves-effect">
                    <i class="fa fa-table mr-3"></i>Branch</a>
                
            </div>

        </div>
        <!-- Sidebar -->

    </header>
    <!--Main Navigation-->

    <!--Main layout-->
    <main class="pt-5 mx-lg-5">
        <div class="container-fluid mt-5" id="abc">
<!--form area-->
  
<!-- Material form login -->
<form action="adminlogin" method="post">
    <p class="h4 text-center mb-4">Admin Sign in</p>

    <!-- Material input email -->
    <div class="md-form">
        <i class="fa fa-envelope prefix grey-text"></i>
        <input type="text" id="materialFormLoginEmailEx" class="form-control" name="un">
        <label for="materialFormLoginEmailEx">User Name</label>
    </div>

    <!-- Material input password -->
    <div class="md-form">
        <i class="fa fa-lock prefix grey-text"></i>
        <input type="password" id="materialFormLoginPasswordEx" class="form-control" name="ps">
        <label for="materialFormLoginPasswordEx">Password</label>
    </div>

    <div class="text-center mt-4">
        <button class="btn btn-default" type="submit">Login</button>
    </div>
</form>
<!-- Material form login -->
                      

                      		  
		  
<!--form area-->
		 </div>
           
    </main>
    <!--Main layout-->

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    <!--Footer-->
    <footer class="page-footer text-center font-small primary-color-dark darken-2 mt-4 wow fadeIn">

       

        <hr class="my-4">

       

        <!--Copyright-->
        <div class="footer-copyright py-3">
            © 2018 Copyright:
           
        </div>
        <!--/.Copyright-->

    </footer>
    <!--/.Footer-->

    <!-- SCRIPTS -->
    <!-- JQuery -->
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="js/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="js/mdb.min.js"></script>
    <!-- Initializations -->
    <script type="text/javascript">
        // Animations initialization
        new WOW().init();
    </script>
</body>
</html>