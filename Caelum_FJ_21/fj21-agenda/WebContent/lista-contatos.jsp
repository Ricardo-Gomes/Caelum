<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page
	import="java.util.*, br.com.caelum.agenda.dao.*, br.com.caelum.agenda.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Contatos</title>
</head>
<body>
	<!-- Cria DAO -->
	<jsp:useBean id="contatoDAO"
		class="br.com.caelum.agenda.dao.ContatoDAO" />

	<c:import url="cabecalho.jsp"></c:import>
	<!-- cria a lista -->

	<table border="1" cellpadding="1" cellspacing="1">
	<caption><h3> Lista de Contatos</h3></caption>
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Endereco</th>
			<th>Data de Nascimento</th>
			<th>Remove Contato</th>
		
		</tr>
		<!-- for -->
		<c:forEach var="contato" items="${contatoDAO.lista}" varStatus="id">
			<tr bgcolor="#${id.count  % 2 == 0 ? 'CCCCCC' : 'ffffff'}">
				<td>${id.count}</td>
				<td width="300px">${contato.nome}</td>
				<td width="300px"><c:if test="${not empty contato.email}">
						<a href="malito:${contato.email}">${contato.email}</a>
					</c:if> <c:if test="${empty contato.email}">
                           Não tem email
                     </c:if></td>
				<td width="100">${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a></td>
			</tr>
		</c:forEach>

	</table>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>