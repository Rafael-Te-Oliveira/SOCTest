<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EXAME FORM</h1>
	<s:form action="persiste" method="post">
	<s:textfield name="nomePaciente" label= "Nome do Paciente"/>
	<s:textfield name="local" label= "Endereço do Hospital"/>
	<s:textfield name="nomeMedico" label= "Nome do Medico"/>
	<s:textfield name="data" label= "Data"/>
	<s:textfield name="diagnostico" label= "Diagnóstico"/>
	<s:submit/>
	</s:form>
</body>
</html>