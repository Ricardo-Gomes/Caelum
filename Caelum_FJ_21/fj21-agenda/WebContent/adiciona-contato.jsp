<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/jquery.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<meta charset="UTF-8">

<title>Adicionar Contato</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<div>
	<h3>Adicionar Contato</h3>
		<fieldset>
			<form action="adicionaContato" method="post">
				<table>
					<tr>
						<td>Nome:</td>
						<td><input type="text" name="nome"></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input type="text" name="nome"></td>
					</tr>
					<tr>
						<td>Endereco:</td>
						<td><input type="text" name="nome"></td>
					</tr>
					<tr>
						<td>Data Nascimento:</td>
						<td><caelum:campoData id="dataNascimento"></caelum:campoData>
						</td>
					</tr>
					<tr>
						<td><input type="submit" value="Gravar Dados"></td>
					</tr>
				</table>
				<input type="hidden" name="logica" value="AdicionaContatoLogic" />
			</form>
		</fieldset>
	</div>
	<c:import url="rodape.jsp" />
</body>
</html>