<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
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
		      <div class="col-md-6 col-md-offset-3">
		        <div class="well well-sm">
		          <form class="form-horizontal" method="post" action="sidentifier">
		          <fieldset>
		            <legend class="text-center">Liste de vos clients</legend>
		    
		            <!-- liste clients-->
		            <table>
 						<tr>
							<th>Nom</th>
							<th>Numéro de Compte</th>
							<th>Solde</th>
						</tr>
						<c:forEach items="${clientList}" var="client">
							<tr>
								<td rowspan="2">${client.prenom} ${client.nom}</td>
								<td>Compte courant: ${client.listCompte.compteCourant.idCompteBancaire}</td>
								<td>${client.compteCourant.solde}</td>
 							</tr>
							<tr>
								<td>Compte épargne: ${client.listComte.compteEpargne.idCompteBancaire}</td>
								<td>${client.compteEpargne.solde}</td>
							</tr>
						</c:forEach>
					</table>
		    
		            <!-- button actions -->
		            <div class="form-group">
		              	<div class="col-md-12 text-right">
		                	<form class="form-horizontal" method="post" action="ServletClientadd" >
		                	</br>
		                		<input id="name" name="nomClient" type="text" placeholder="Nom du client" class="form-control">
		                		<button type="submit" class="btn btn-primary btn-lg">Mettre à jour les informations client</button>
		                	</form>
		              	</div>
		            </div>
		          </fieldset>
		          </form>
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