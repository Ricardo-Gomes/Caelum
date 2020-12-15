<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/jquery.min.map.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/bootstrap-theme.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/bootstrap-theme.map.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/bootstrap-theme.main.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/jquery.css" rel="stylesheet" type="text/css">
<c:import url="/WEB-INF/views/cabecalho.jsp" />
<title>Menu</title>
</head>
<body>
	<div class="container">
		<h2>Página Inicial</h2>
		<p>Bem vindo, ${usuarioLogado.login}</p>
		<a href="listaTarefas">
			<button class="btn btn-primary btn-large" type="submit">Entrar</button>
		</a><br /> <a href="logout">
			<button class="btn btn-primary btn-large" type="submit">Sair</button>
		</a>
	</div>
	<c:import url="/WEB-INF/views/rodape.jsp" />
</body>
</html>