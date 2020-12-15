<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>Formulario</title>
</head>
<body>
	<h3>Adicionar Tarefas</h3>
	<form:errors path="tarefa.descricao" cssStyle="color:red" />
	<form action="adicionaTarefa" method="post">
		Descrição: <br />
		<textarea name="descricao" rows="5" cols="100"></textarea>
		<br /> <input type="submit" value="Adicionar" />
	</form>
	<c:import url="/WEB-INF/views/rodape.jsp" />
</body>
</html>