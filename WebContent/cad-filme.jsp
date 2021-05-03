<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Filme</title>

<link href="css/cad-filme.css" rel="stylesheet">
</head>
<body>

	
	
	
	<f:view>
	
	
		<jsp:include page="/menu.jsp" />

		<h:form>


			<div align="center">
			
			
			<h1>Cadastro de Filmes </h1>
			
			<h:panelGrid columns="1">
				<h:messages />
				</h:panelGrid>



			<h:panelGrid  columns="2">
			
			<h:outputText value="Nome:" />
			<h:inputText value="#{filmeBacking.nome }" maxlength="40" size="40"/>
			
			<h:outputText value="Valor:" />
			<h:inputText value="#{filmeBacking.valor }" maxlength="8" size="15"/>
			
			<h:outputText value="Disponivel:" />
			<h:selectOneRadio value="#{filmeBacking.disponivel }">
	     	<f:selectItem itemValue="sim" itemLabel="Sim"/>
		    <f:selectItem itemValue="nao" itemLabel="Não"/>	 
			</h:selectOneRadio>
			
			<h:outputText value="Promoção:" />
			<h:selectOneRadio value="#{filmeBacking.promocao }">
	     	<f:selectItem itemValue="sim" itemLabel="Sim"/>
		    <f:selectItem itemValue="nao" itemLabel="Não"/>	 
			</h:selectOneRadio>	
				
			<h:outputText value="Valor Promoção:" />
			<h:inputText value="#{filmeBacking.valorPromocao }" maxlength="40" size="40"/>	
			
			<h:outputText value="Diretor:" />
			<h:inputText value="#{filmeBacking.diretor }" maxlength="40" size="40"/>
			
			<h:outputText value="Ano Lançamento:" />
			<h:inputText value="#{filmeBacking.anoLancamento }" maxlength="4" size="5"/>
			
			<h:outputText value="Faixa Etaria:" />
			<h:inputText value="#{filmeBacking.faixaEtaria }" maxlength="4" size="5"/>
			
			<h:outputText value="Genero:" />
			<h:inputText value="#{filmeBacking.genero }" maxlength="40" size="40"/>
			
			
			
			
			</h:panelGrid>

				<h:panelGrid columns="3">
				
				<h:commandButton action="#{filmeBacking.cadastrar}" value="Cadastrar" />
			    <h:commandButton action="#{filmeBacking.cancelar}" value="Cancelar" />
			    <h:commandButton action="#{filmeBacking.sair}" value="Sair" />
			
				
				</h:panelGrid>




		</h:form>


	</f:view>
	
	
	</div>


	


</body>
</html>