<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title> Proxibanque V3 </title>
	<!-- font -->
	<link href="font-family: 'Roboto', sans-serif;" />
	<!-- css -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>


<!-- contenu du site -->
<body>
	<!-- header -->
	<header class="container-fluid header">
		<div class="container">
			<a href="#" class="logo"> Proxibanque V3 </a>
			<nav class="menu">
				<a href="#"> Accueil </a>
				<a href="#about"> Qui nous sommes </a>
				<a href="#contact"> Contact </a>
			</nav>

		</div>
	</header>
	<!-- end header -->

	<!-- banniere -->
	<section class="container-fluid banner">
		<div class="ban">
			<img src="img/ban1.jpg" alt="banniere du site">	

		</div>
	</section>
	<!-- end banniere -->

	<!-- a propos -->	
	<section class="container-fluid about">
		<div class="container">
			<div class="row">
				<legend class="text-center">Login effectué</legend>
		      <div class="col-md-10 col-md-offset-3">
		        <div class="well well-sm">
		        	Bonjour ${nomconseiller}, vous voici login dans l'application proxibanque.<br/>
		        </div>
		        <div class="col-md-12 text-right">
	                <button type="button" class="btn btn-primary btn-lg" onclick="http://www.google.fr">Suivant</button>
				</div>
		      </div>
			</div>
		</div>
	</section>
	<!-- end a propos -->	

	<!-- footer/contact -->	
	<footer class="container-fluid contact">
		<div class="container">
		<p>
			Copyright (c) 2017 Copyright Holder All Rights Reserved.
		</p>
		</div>
	</footer>
	<!-- end footer/contact -->	

</body>
</html>