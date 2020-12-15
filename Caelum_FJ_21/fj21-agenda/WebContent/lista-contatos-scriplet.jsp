<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,br.com.caelum.agenda.dao.*,br.com.caelum.agenda.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto fj21-agenda</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>

	<table>
		<%
			ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> contatos = contatoDAO.getLista();
		for (Contato contato : contatos) {
		%>
		<tr>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
			<td colspan="2">Atividade</td>
		</tr>

		<tr bgcolor="=${id.count % 2 == 0 ? 'aaee88' : 'ffffff'}">
			<td><%=contato.getNome()%></td>
			<td><c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
							E-mail não infomado
						</c:otherwise>
				</c:choose></td>
			<td><%=contato.getEndereco()%></td>
			<td><fmt:formatDate value="${contato.dataNascimento.time}"
					pattern="dd/MM/yyyy" /></td>
			<td><a
				href="mvc?logica=AlteraContatoLogic&id=${contato.id}&nome=${contato.nome}&email=${contato.email}&endereco=${contato.endereco}&dataNascimento=${contato.dataNascimento.time}">Alterar</a>
			</td>
			<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
			</td>
		</tr>

		<%
			}
		%>
	</table>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>