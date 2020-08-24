<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exames</title>
</head>
<body>
	<h1>Lista de Exames</h1>
	<table>
		<thead>
			<tr>
				<th>Paciente</th>
				<th>Hospital</th>
				<th>Medico</th>
				<th>Data</th>
				<th>Diagnostico</th>
				<th>Action</th>
			</tr>
		</thead>
		<s:iterator value="exames">
			<tr>
				<td><s:property value="nomePaciente" /></td>
				<td><s:property value="local" /></td>
				<td><s:property value="nomeMedico" /></td>
				<td><s:property value="data" /></td>
				<td><s:property value="diagnostico" /></td>
				<td><a
					href='atualiza.action?tipoRequisicao=atualiza&nomePaciente=<s:property value="nomePaciente"/>'>
						<button>Atualizar</button>
				</a> <a href='deleta.action?nomePaciente=<s:property value="nomePaciente"/>'>
						<button>Delete</button>
				</a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="<s:url action='adiciona'/>"><button>Adicionar</button></a>
</body>
</html>