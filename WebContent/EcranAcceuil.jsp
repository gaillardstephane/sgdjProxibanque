<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" prefix = "c">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="feuille1.css">
<title>Acceuil</title>
</head>
<body>
	<fieldset>
		<legend>identifiez-vous</legend>
		
		<form action="sidentifier" method="post">
			identifiant*: 
			<input type="text" id="user" name="utilisateur"
				placeholder="saisissez votre pseudo" /> 
				<br /> 
				
			mot de pass*: 
			<input type="password" id="pwd" name="motdepasse"
				placeholder="saisissez votre mot de passe" />
				 <br />
				 <br /> 
				 <br /> 
			 <input type="submit" value="sidentifier" align='center'>
		</form>

	</fieldset>

<!-- 	<c:forEach var="i" begin="1" end="15"> -->
<%--          Item <c:out value="${idClient}" /> --%>
<!-- 		<p> -->
<!-- 	</c:forEach> -->


	<%
		
	%>

</body>
</html>