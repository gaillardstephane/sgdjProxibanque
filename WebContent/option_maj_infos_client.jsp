<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Proxibanque V3 </title>
	<!-- font -->
	<link rhref="font-family: 'Roboto', sans-serif;" />
	
	<!-- css -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<!-- contenu du site -->
<body>
	<!-- header -->
	<header class="container-fluid header">
		<div class="container">
			<a href="#" class="logo">Proxibanque V3</a>
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
				<legend class="text-center"> Modification des données client </legend>
		      	<div class="col-md-12 col-md-offset-2">
		        	<div class="col-md-9 text-left">
				        <fieldset>
					        <!-- input des infos client -->
				            	<br>
				            	<form class="form-horizontal" method="post" action="ServletClientadd" >
						            <div class="form-group">
						              <div class="col-md-9">
						                <input id="name" name="nomClient" type="text" placeholder="Nom du client" class="form-control">
						                <input id="name" name="prenomClient" type="text" placeholder="Prénom du client" class="form-control">
						                <input id="name" name="adresseClient" type="text" placeholder="Adresse" class="form-control">
						                <input id="name" name="codePostal" type="text" placeholder="Code postal" class="form-control">
						                <input id="name" name="ville" type="text" placeholder="Ville" class="form-control">
						                <input id="name" name="numeroTel" type="text" placeholder="Téléphone" class="form-control">
						                <input id="name" name="email" type="text" placeholder="email de contact" class="form-control">

						                <button type="reset" class="btn btn-primary btn-lg"> Recommencer </button>
						                <button type="submit" class="btn btn-primary btn-lg"> Valider </button>

						              </div>
						            </div>
		          			    </form>
				       	</fieldset>
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