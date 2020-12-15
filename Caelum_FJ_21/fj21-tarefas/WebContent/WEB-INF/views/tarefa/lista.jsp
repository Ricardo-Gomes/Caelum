<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<link href="resources/css/main.css" rel="stylesheet" type="text/css">
<c:import url="/WEB-INF/views/cabecalho.jsp" />
<title>Lista de Tarefas</title>
</head>
<body>
	<div class="container">
		<a href="novaTarefa">
			<button class="btn">
				<span class="glyphicon glyphicon-plus"></span> Criar nova tarefa
			</button>
		</a> <br /> <br />
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Descrição</th>
					<th>Finalizada?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tarefas}" var="tarefa">
					<tr id="tarefa_${tarefa.id}"
						bgcolor="=${id.count % 2 == 0 ? 'A9A9A9' : 'DCDCDC'}">
						<td>${tarefa.id}</td>
						<td>${tarefa.descricao }</td>
						<td><c:if test="${tarefa.finalizado eq false }">
								<a href="" onclick="finalizaAgora(${tarefa.id})">
									<button class="btn">
										<span class="glyphicon glyphicon-ok"></span> Finalizar agora
									</button>
								</a>
							</c:if> <c:if test="${tarefa.finalizado eq true }">
						  Finalizado
                    </c:if></td>
						<td id="tarefa_data_${tarefa.id}"><fmt:formatDate
								value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" /></td>
						<td><a href="" onclick="removeTarefa(${tarefa.id})">
								<button class="btn">
									<span class="glyphicon glyphicon-remove"></span>Excluir
								</button>
						</a></td>
						<td><a href="mostraTarefa?id=${tarefa.id}">
								<button class="btn">
									<span class="glyphicon glyphicon-pencil"></span> Alterar
								</button>
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script type="text/javascript">
function finalizaAgora(id) {
	$.post("finalizaTarefa", {'id' : id}, function(resposta){
		$("#tarefa_" + id).html(resposta);
	});
}

function removeTarefa(id) {
	$.post("removeTarefa", {'id' : id}, function(resposta) {
		$("#tarefa_" + id).closest("tr").hide();
	});;
}
</script>
<c:import url="/WEB-INF/views/rodape.jsp" />
</body>
</html>