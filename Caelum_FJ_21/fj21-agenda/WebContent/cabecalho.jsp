<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabecalho</title>
</head>
<body>
<!-- <img alt="logo" src="imagens/caelum.png"/>  -->

<!-- Utilizando o c:url -->
<img width="400" alt="logo" src="<c:url value="imagens/caelum.png" />" />
<h2>Agenda de Contato</h2>
<hr/>
</body>
</html>