<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualiza</title>
</head>
<body>
	<form action="atualiza" method="post">
		<pre>
		<h1>Atualização de dados</h1>
		<label>Paciente:</label>  
		<input type="text" name="nomePaciente" value='<s:property value="nomePaciente"/>'>
		<input type="hidden" name="nomePacienteHidden" value='<s:property value="nomePaciente"/>'>
		
		<label>Endereço do Hospital:</label>         
		<input type="text" name="local" value='<s:property value="local"/>'>
		
		<label>Médico:</label>         
		<input type="text" name="nomeMedico" value='<s:property value="nomeMedico"/>'>
		
		<label>Data:</label>         
		<input type="text" name="data" value='<s:property value="data"/>'>
		
		<label>Diagnostico:</label>         
		<input type="text" name="diagnostico" value='<s:property value="diagnostico"/>'>
		
		<button name="tipoRequisicao" value="persiste" type="submit">Atualizar</button>
		</pre>	
	</form>
</body>
</html>