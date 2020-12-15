<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript"
	src="http://jquery-ui.googlecode.com/svn/trunk/ui/i18n/jquery.ui.datepicker-pt-BR.js"></script>
<link type="text/css" href="css/jquery.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Contato</title>
</head>
<c:import url="cabecalho.jsp" />
<div>
	<h3>Alterar Contato</h3>
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
			<input type="hidden" name="logica" value="AlteraContatoLogic" />
		</form>
	</fieldset>
</div>
<c:import url="rodape.jsp" />