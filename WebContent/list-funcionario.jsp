<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta de Funcionarios</title>
</head>
<body>

	<f:view>
	
		<jsp:include page="/menu.jsp" />
		
		<h:form>
		
			<h:panelGrid columns="1">
				<h:messages></h:messages>
			</h:panelGrid>
			
			<h:panelGrid columns="3">
				<h:outputText value="Nome:" />
				<h:inputText value="#{funcionarioBacking.nomePesquisar}" maxlength="45" size="45" />
				<h:commandButton action="#{funcionarioBacking.pesquisar}" value="Pesquisar" />
			</h:panelGrid>
			
			<h:panelGrid columns="1" width="450">
			
				<rich:dataTable id="tabFilmes" width="100%" value="#{funcionarioBacking.listaFuncionarios}" var="filme">
				
					<f:facet name="caption">
						<h:outputText value="Funcionario Cadastrados" />
					</f:facet>
					
					<f:facet name="header">
						
						<rich:columnGroup>
							
							<rich:column>
								<h:outputText value="Codigo" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="Nome" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="RG" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="CP" />
							</rich:column>
							
							

						</rich:columnGroup>
					
					</f:facet>
					
					<rich:column>
						<h:outputText value="#{funcionario.idFuncionario}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{funcionario.nome}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{funcionario.cpf}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{funcionario.rg}" />
					</rich:column>
					
					
					<rich:column>
						<h:commandLink action="#{funcionarioBacking.alterar}" value="Alterar" >
						<f:setPropertyActionListener value="#{funcionario}" target="#{funcionarioBacking.funcionarioSelecionado}" />						
						</h:commandLink>
					</rich:column>
				
				<rich:column>
						<h:commandLink action="#{funcionarioBacking.excluir}" value="Alterar" >
						<f:setPropertyActionListener value="#{funcionario}" target="#{funcionarioBacking.funcionarioSelecionado}" />						
						</h:commandLink>
					</rich:column>
				
						
					
				
				
				</rich:dataTable>
			
			</h:panelGrid>
			
		</h:form>
		
	</f:view>

</body>
</html>