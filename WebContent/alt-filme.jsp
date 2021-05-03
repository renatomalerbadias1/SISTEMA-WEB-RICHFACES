<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<html>
<head>
<link href="css/alt-filme.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Alteração de Filme</title>
</head>
<body>
	<f:view>
	
		<jsp:include page="/menu.jsp"/>
	
		<h:form>
			<h3 styleClass="text">Alteração de Filmes  </h3>
			
			<h:panelGrid columns="1">
				<h:messages />
				</h:panelGrid>
			
				<h:panelGrid columns="2" >
				
					<h:outputText value="Nome:" />
					<h:inputText value="#{filmeBacking.nome }" maxlength="45" size="45"/>
					
					<h:outputText value="Valor:" />
					<h:inputText value="#{filmeBacking.valor }" maxlength="8" size="15"/>
					
					<h:outputText value="Disponivel:" />
					<h:selectOneRadio value="#{filmeBacking.disponivel }">
						<f:selectItem itemValue="Sim" itemLabel="SIM"/>
						<f:selectItem itemValue="Não" itemLabel="NÃO"/>
					</h:selectOneRadio>
					
					<h:outputText value="Promoção:" />
					<h:selectOneRadio value="#{filmeBacking.promocao }">
						<f:selectItem itemValue="Sim" itemLabel="SIM"/>
						<f:selectItem itemValue="Não" itemLabel="NÃO"/>
					</h:selectOneRadio>
					
					<h:outputText value="Valor Promoção:" />
					<h:inputText value="#{filmeBacking.valorPromocao }" maxlength="8" size="15"/>
					
					<h:outputText value="Diretor" />
					<h:inputText value="#{filmeBacking.diretor }" maxlength="45" size="45"/>
					
					<h:outputText value="Ano Lançamento" />
					<h:inputText value="#{filmeBacking.anoLancamento }" maxlength="4" size="5"/>
					
					<h:outputText value="Faixa Etario" />
					<h:inputText value="#{filmeBacking.faixaEtaria }" maxlength="2" size="5"/>
					
					<h:outputText value="Genero" />
					<h:inputText value="#{filmeBacking.genero }" maxlength="45" size="45"/>
					
					
				</h:panelGrid>
				
				<h:panelGrid columns="3">
					<h:commandButton action="#{filmeBacking.alterarFilme }" value="Cadastrar" styleClass="botao"  />
					<h:commandButton action="#{filmeBacking.cancelar }" value="Cancelar" styleClass="botao" />
					<h:commandButton action="#{filmeBacking.sair }" value="Sair" styleClass="botao" />
					
				</h:panelGrid>
		</h:form>
	
	</f:view>

</body>
</html>