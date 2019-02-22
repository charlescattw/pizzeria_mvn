<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="ressources/css/pizza_css.css" />
</head>

<body>
	<!-- <c:import url="menu_jsp.jsp"></c:import> -->
	<Fieldset id="conteneur">

<a href="PizzaAjoutServlet"> ajouter une pizza </a>
		
		<c:forEach items="${pizza}" var="Lpizza">
			<!-- le forEach est dépendant de la librairie jstl. -->
			<div>${Lpizza.libelle}</div>
			<div>
				<a href="pizza-info?id=${Lpizza.id}"> <label id="Titre_pizza">
						"${Lpizza.libelle}" </label> <img id="photoP" src="${Lpizza.urlimage}" />
				</a>
			</div>
			<div>${Lpizza.prix}</div>
		</c:forEach>
		
		

	</Fieldset>
</body>
</html>